package org.eclipse.gemoc.gemoc_language_workbench.deciders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.AbstractConcurrentExecutionEngine;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.Scheduler;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderChecker;
import org.eclipse.gemoc.gemoc_language_workbench.deciders.sock.utils.SockDeciderHelper;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

import fr.inria.kairos.sock.utils.IOUtils;
import fr.inria.kairos.sock.utils.Utils;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;

public abstract class AbstractSockDecider implements ILogicalStepDecider {
	
	private final static String NAME_PROPERTY_NB_HYPER_PERIOD = "nb.hyper.period";
	
	protected int nbHyperPeriodToDo;
	
	private final static String NAME_PROPERTY_ENABLE_BUTTERFLY_ATTACK = "enable.butterfly.attack";
	
	protected boolean enableButterflyAttack;
	
	private final static String NAME_PROPERTY_PROBA_BUTTERFLY_ATTACK = "proba.butterfly.attack";
	
	protected float probabilityButterFlyAttack;
	
	protected Scheduler scheduler;

	protected int nbDecide;

	protected List<ArrivalTime> schedule;
	
	private IotSystem lastSystem;
	
	public AbstractSockDecider() {
		super();
		this.nbDecide = 0;
		this.schedule = new ArrayList<>();
	}
	
	private void init(IotSystem system) {
		final Properties sockProperties = Utils.getSockProperties();
		this.nbHyperPeriodToDo = Integer.parseInt(sockProperties.getProperty(NAME_PROPERTY_NB_HYPER_PERIOD, "-1"));
		this.enableButterflyAttack = Boolean.parseBoolean(sockProperties.getProperty(NAME_PROPERTY_ENABLE_BUTTERFLY_ATTACK, "false"));
		this.probabilityButterFlyAttack = Float.parseFloat(sockProperties.getProperty(NAME_PROPERTY_PROBA_BUTTERFLY_ATTACK, "0.0F"));
		this.schedule.clear();
		this.scheduler = null;
		this.nbDecide = 0;
		SockDeciderHelper.hyperPeriod = -1;
	}
	
	protected boolean shouldStop(final int hyperPeriod) {
		final int nbHyperPeriodDone = this.nbDecide / hyperPeriod;
		return nbHyperPeriodDone == this.nbHyperPeriodToDo;
	}
	
	protected void stop(final int hyperPeriod, final IotSystem system, AbstractConcurrentExecutionEngine engine) {
		System.out.println(String.format("Reach nb hyper period %d/%d {%d}", this.nbDecide / hyperPeriod, this.nbHyperPeriodToDo, this.nbDecide));
		IOUtils.writeRaw(this.toString(this.schedule), system.getName() + "/schedule");
		this.init(system);
		engine.stop();
	}
	
	protected abstract Optional<Step<?>> getNextEnter(final IotSystem system, final List<Step<?>> possibleLogicalSteps);
	
	protected abstract Optional<Step<?>> getNextTakesOver(final IotSystem system, final List<Step<?>> possibleLogicalSteps);
	
	protected abstract Step<?> decideTakesOverOrProcess(
				Step<?> stepWithProcess,
				String actorNameProcessing,
				Step<?> stepWithTakesOver,
				String actorNameTakingOver
			);
	
	private void initWhenNewSystem(IotSystem system) {
		if (this.lastSystem == null || !this.lastSystem.equals(system)) {
			this.lastSystem = system;
			IOUtils.initFolders(system.getName());
			this.init(system);
		}
	}

	public Step<?> decide(AbstractConcurrentExecutionEngine engine, final List<Step<?>> possibleLogicalSteps) {
		final IotSystem system = (IotSystem) engine.getExecutionContext().getResourceModel().getContents().get(0);
		this.initWhenNewSystem(system);
		final int hyperPeriod = SockDeciderHelper.getHyperPeriod(system);
		if (shouldStop(hyperPeriod)) {
			this.stop(hyperPeriod, system, engine);
		}
		if (possibleLogicalSteps.size() == 1) {
			this.nbDecide++;
			return possibleLogicalSteps.get(0);
		}
		if (this.scheduler == null) {
			this.scheduler = new Scheduler(system);
		}
		Optional<Step<?>> choosenOneOptional = this.getNextEnter(system, possibleLogicalSteps);
		if (choosenOneOptional.isPresent()) {
			final Step<?> choosenStep = choosenOneOptional.get();
			SockDeciderHelper.getAllSubStepsNameMatchingPredicate(choosenStep, SockDeciderChecker.enter)
						.stream()
						.map(subStepName -> subStepName.split("_")[1])
						.map(enteringActorName -> new ArrivalTime(enteringActorName, this.nbDecide))
						.forEach(this.schedule::add);
			this.nbDecide++;
			return choosenStep;
		}
		choosenOneOptional = this.getNextTakesOver(system, possibleLogicalSteps);
		if (choosenOneOptional.isPresent()) {
			final Step<?> stepWithProcess = possibleLogicalSteps.stream()
					.filter(possibleLogicalStep -> SockDeciderChecker.hasClockPredicate(possibleLogicalStep,
							SockDeciderChecker.process))
					.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
							SockDeciderChecker.butterflyAttack))
					.findFirst().orElseThrow(() -> new RuntimeException(""));
			final String actorNameProcessing = SockDeciderHelper.getEntityNameFromClockName(SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(stepWithProcess, SockDeciderChecker.process).get(0));
			final Step<?> stepWithTakesOver = choosenOneOptional.get();
			final String actorNameTakingOver = SockDeciderHelper.getEntityNameFromClockName(SockDeciderHelper
					.getAllSubStepsNameMatchingPredicate(stepWithTakesOver, SockDeciderChecker.takesOver).get(0));
			return this.decideTakesOverOrProcess(stepWithProcess, actorNameProcessing, stepWithTakesOver, actorNameTakingOver);
		}
		return returnRandomLogicalStep(possibleLogicalSteps);
	}

	private Step<?> returnRandomLogicalStep(final List<Step<?>> possibleLogicalSteps) {
		List<Step<?>> logicalStepsWithoutButterflyAttack = possibleLogicalSteps.stream()
				.filter(possibleLogicalStep -> SockDeciderChecker.hasNoClockPredicate(possibleLogicalStep,
						SockDeciderChecker.butterflyAttack))
				.collect(Collectors.toList());
		this.nbDecide++;
		final Step<?> choosenOne = SockDeciderHelper.returnRandomOne(logicalStepsWithoutButterflyAttack);
		return choosenOne;
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public void preempt() {
		// not possible
	}

	protected class ArrivalTime {
		public final String actor;
		public final int arrivalTime;

		public ArrivalTime(String actor, int arrivalTime) {
			this.actor = actor;
			this.arrivalTime = arrivalTime;
		}
	}

	public String toString(List<ArrivalTime> schedule) {
		return schedule.stream().map(arrivalTime -> arrivalTime.actor + " " + arrivalTime.arrivalTime)
				.collect(Collectors.joining(IOUtils.NEW_LINE));
	}
	
}
