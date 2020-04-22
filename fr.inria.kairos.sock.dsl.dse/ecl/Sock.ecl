import 'http://kairos.inria.fr/sock'

import 'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

ECLimport "platform:/resource/fr.inria.kairos.sock.dsl.moccml/mocc/resourceUsageCycle.moccml"
ECLimport "platform:/resource/fr.inria.kairos.sock.dsl.moccml/mocc/actorProcessingCycle.moccml"
ECLimport "platform:/resource/fr.inria.kairos.sock.dsl.moccml/mocc/isPriorityActor.moccml"

package sock

	-- ========================================================================================================
	--						BEGIN GLOBAL
	-- ========================================================================================================
	-- Mapping event and methods
	
	context IotSystem
		def : timeEvent : Event = self.time()
		def : zeroValue : Integer = 0
			
	-- ========================================================================================================
	--						BEGIN RESOURCE USAGE CYCLE 
	-- ========================================================================================================

	-- Mapping event and methods
	
	context Resource
		def : isEnteredResourceEvent : Event = self
		def : isProcessedResourceEvent : Event = self
		def : isExitedResourceEvent : Event = self
		def : doesNothingResourceEvent : Event = self
	
	context  Actor
		def : enterActorEvent : Event = self.enterIn()
		def : processActorEvent : Event = self.process()
		def : exitActorEvent : Event = self.exitOf()
		def : doesNothingActorEvent : Event = self.idle()
		def : processTimeActorValue : Integer = self.processTime
		def : isPriorityActorValue : Integer = self.isPriority
		def : resourceOfActorIsEnteredActorEvent : Event = self -- this one means that the actor is exiting the resource
	
	-- Constraints
	
	context IotSystem
		inv unionOfEnterActorCoincidesWithUnionOfIsEnteredResource:
			let unionIsEnteredResource : Event = Expression Union(self.ownedResource.isEnteredResourceEvent) in
			let unionEnterActor : Event = Expression Union(self.ownedActor.enterActorEvent) in
				Relation Coincides(unionIsEnteredResource, unionEnterActor)
		inv unionOfProcessActorCoincidesWithUnionOfIsProcessedResource:
			let unionisProcessedResource : Event = Expression Union(self.ownedResource.isProcessedResourceEvent) in
			let unionProcessActor : Event = Expression Union(self.ownedActor.processActorEvent) in
				Relation Coincides(unionisProcessedResource, unionProcessActor)
		inv unionOfExitActorCoincidesWithUnionOfIsExitedResource:
			let unionisExitedResource : Event = Expression Union(self.ownedResource.isExitedResourceEvent) in
			let unionExitActor : Event = Expression Union(self.ownedActor.exitActorEvent) in
			let unionResourceOfActorIsEnteredActor : Event = Expression Union(self.ownedActor.resourceOfActorIsEnteredActorEvent) in
			let unionExitActorAndResourceOfActorIsEntered : Event = Expression Union(
				unionExitActor, unionResourceOfActorIsEnteredActor
			) in
				Relation Coincides(unionisExitedResource, unionExitActorAndResourceOfActorIsEntered)
			
	context Actor
		inv resourceIsEnteredActorBehavior:
			Relation SubClock(self.resourceOfActorIsEnteredActorEvent, self.resource.isEnteredResourceEvent)
		inv processTimeBehavior:
			Relation ActorProcessingCycle(
				self.enterActorEvent,
				self.processActorEvent,
				self.processTimeActorValue,
				self.exitActorEvent,
				self.doesNothingActorEvent,
				self.resourceOfActorIsEnteredActorEvent,
				self.isPriorityActorValue
			)
	
	context Resource
		inv oneActorCanEnterInTheResourceInTheSameTimeBehavior:
			Relation Exclusion(self.actor.enterActorEvent)
	
	-- ========================================================================================================
	--						BEGIN RESOURCE CLEANING AFTER HIGH PRIORITY
	-- ========================================================================================================
	
	-- Mapping event and methods	
	
	context Actor
		def : enterIsPriorityActorEvent : Event = self
		def : enterIsNotPriorityActorEvent : Event = self
		def : exitIsPriorityActorEvent : Event = self
		def : exitIsNotPriorityActorEvent : Event = self
		
	context Resource
		def : cleanResourceEvent : Event = self.clean()
		
	-- Constraints
	
	context Actor
		inv enterSublockEnterBehavior:
			let unionOfEnterWithPriority : Event = Expression Union(
				self.enterIsPriorityActorEvent,
			 	self.enterIsNotPriorityActorEvent
			) in
			Relation SubClock(unionOfEnterWithPriority, self.enterActorEvent)
		inv enterIsNotPrioritySublockEnter:
			Relation SubClock(, self.enterActorEvent)
		inv exitIsPrioritySublockEnter:
			Relation SubClock(self.exitIsPriorityActorEvent, self.exitActorEvent)
		inv exitIsNotPrioritySublockEnter:
			Relation SubClock(self.exitIsNotPriorityActorEvent, self.exitActorEvent)
		inv priorityOnExitBehavior:
			Relation IsPriorityActorRelation(
				self.exitIsPriorityActorEvent, 
				self.exitIsNotPriorityActorEvent,
				self.isPriorityActorValue
			)
		inv priorityOnEnterBehavior:
			Relation IsPriorityActorRelation(
				self.enterIsPriorityActorEvent, 
				self.enterIsNotPriorityActorEvent,
				self.isPriorityActorValue
			)
	
	context Resource
		inv resourceUsageCycleBehavior:
			let intersectionOfIsEnteredAndIsExited : Event = Expression Intersection(
				self.isEnteredResourceEvent,
				self.isExitedResourceEvent
			) in
			let unionOfExitIsPriorityEventActor : Event = Expression Union(self.actor.exitIsPriorityActorEvent) in
			Relation ResourceUsageCycleRelation(
				self.isEnteredResourceEvent,
				self.isExitedResourceEvent,
				self.doesNothingResourceEvent,
				intersectionOfIsEnteredAndIsExited,
				unionOfExitIsPriorityEventActor,
				self.cleanResourceEvent
			)
			
	-- ========================================================================================================
	--						BEGIN PERIODICITY 
	-- ========================================================================================================
	
	-- Mapping event and methods
	
	context Actor
		def : periodTimeActorValue  : Integer = self.periodTime
		
	--Constraints

	context Actor
		inv mustCompleteProcessAtEachPeriodActor:
			let periodStartSecondAndMoreEvent : Event = Expression Periodic(
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent,
				self.periodTimeActorValue,
				self.periodTimeActorValue
			) in
			let periodStartFirstTickEvent : Event = Expression OneTickAndDie(
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			) in
			let periodStartEvent : Event = Expression Concatenation(
				periodStartSecondAndMoreEvent,
				periodStartFirstTickEvent
			) in
			Relation Alternates(self.enterActorEvent, periodStartEvent)
			
	-- ========================================================================================================
	--						BEGIN TIME MANAGEMENT
	-- 		Every components must tick at each step
	--		Explicitly like if they do not do anything, they tick a clock doesNothing
	--		Component cannot doesNothing and something else (exclusion)
	-- ========================================================================================================
			
	-- Mapping event and methods
	
	
	-- Constraints
		
	context Actor
		inv unionEventsOfActorCoincidesWithTimeEvent:
			let unionEnterAndProcessActorEvent : Event = Expression Union(
				self.enterActorEvent,
				self.processActorEvent
			) in
			let unionEnterAndProcessAndExitActorEvent : Event = Expression Union(
				unionEnterAndProcessActorEvent,
				self.exitActorEvent
			) in
			let unionEnterAndProcessAndExitAndDoesNothingActorEvent : Event = Expression Union(
				unionEnterAndProcessAndExitActorEvent,
				self.doesNothingActorEvent
			) in
			let unionvEPEDoesNothingAndNewClockActorEvent : Event = Expression Union(
				unionEnterAndProcessAndExitAndDoesNothingActorEvent,
				self.resourceOfActorIsEnteredActorEvent
			) in
			Relation Coincides(
				unionvEPEDoesNothingAndNewClockActorEvent,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			)

	context Resource
		inv unionEventsOfResourceCoincidesWithTimeEvent:
			let unionIsEnteredAndIsProcessedResourceEvent : Event = Expression Union(
				isEnteredResourceEvent,
				self.isProcessedResourceEvent
			) in
			let unionIsEnteredAndIsProcessedResourceEventIsExitedResourceEvent : Event = Expression Union(
				unionIsEnteredAndIsProcessedResourceEvent,
				self.isExitedResourceEvent
			) in
			let unionIsEnteredAndIsProcessedResourceEventIsExitedAndDoesNothingResourceEvent : Event = Expression Union(
				unionIsEnteredAndIsProcessedResourceEventIsExitedResourceEvent,
				self.doesNothingResourceEvent
			) in
			Relation Coincides(
				unionIsEnteredAndIsProcessedResourceEventIsExitedAndDoesNothingResourceEvent,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			)
		inv isEnteredExcludesDoesNothing:
			Relation Exclusion(
				self.isEnteredResourceEvent,
				self.doesNothingResourceEvent
			)
		inv isExitedExcludesDoesNothing:
			Relation Exclusion(
				self.isExitedResourceEvent,
				self.doesNothingResourceEvent
			)
		inv isProcessedExcludesDoesNothing:
			Relation Exclusion(
				self.isProcessedResourceEvent,
				self.doesNothingResourceEvent
			)
		inv isProcessedExcludesIsEntered:
			Relation Exclusion(
				self.isProcessedResourceEvent,
				self.isEnteredResourceEvent
			)
			
			
endpackage