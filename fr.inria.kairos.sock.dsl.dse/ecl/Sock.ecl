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
		def : timeEvent : Event = self
		def : zeroValue : Integer = 0
	
	-- ========================================================================================================
	--						BEGIN RESOURCE USAGE CYCLE 
	-- 				This resource usage includes : 
	--					- the basic cycle request enter process exit
	--					- the management of the time that the actor must process
	--					- the takes over by a high-priority actor from a resource of 
	--					a low-priority actor
	-- ========================================================================================================

	-- Mapping event and methods
	
	context Resource
		def : isEnteredResourceEvent : Event = self
		def : isProcessedResourceEvent : Event = self
		def : isExitedResourceEvent : Event = self
		def : doesNothingResourceEvent : Event = self.idle()
		def : anActorIsTakenOverByAnotherOneResourceEvent : Event = self
	
	context  Actor
		def : requestActorEvent : Event = self.request()
		def : enterActorEvent : Event = self.enterIn()
		def : processActorEvent : Event = self.process()
		def : exitActorEvent : Event = self.exitOf()
		def : doesNothingActorEvent : Event = self.idle()
		def : processTimeActorValue : Integer = self.processTime
		def : isPriorityActorValue : Integer = self.isPriority
		def : isTakenOverActorEvent : Event = self.exitOf()
		def : takesOverActorEvent : Event = self.enterIn()
		
	-- Constraints
	
	context IotSystem
		inv oneTakeOverCoincidesWithOneIsTakenOverActor:
			let unionIsTakenOverForCoincidesWithTakesOver : Event = Expression Union(
				self.ownedActor.isTakenOverActorEvent
			) in
			let unionTakeOverForCoincidesWithIsTakenOver : Event = Expression Union(
				self.ownedActor.takesOverActorEvent
			) in
			Relation Coincides(
				unionTakeOverForCoincidesWithIsTakenOver,
				unionIsTakenOverForCoincidesWithTakesOver
			)
	
	context Resource
		inv isEnteredCoincidesWithOneActorEnter:
			let unionEnterForCoincides : Event = Expression Union(
				self.actor.enterActorEvent
			) in
			Relation Coincides(self.isEnteredResourceEvent, unionEnterForCoincides)
		inv isExitedCoincidesWithOneActorExit:
			let unionExitForCoincides : Event = Expression Union(
				self.actor.exitActorEvent
			) in
			Relation Coincides(self.isExitedResourceEvent, unionExitForCoincides)
		inv isProcessedCoincidesWithOneActorProcess:
			let unionProcessForCoincides : Event = Expression Union(
				self.actor.processActorEvent
			) in
			Relation Coincides(self.isProcessedResourceEvent, unionProcessForCoincides)
		inv AnActorIsTakenOverCoincidesWithOneActorIsTakenOver:
			let unionIsTakenOverForCoincides : Event = Expression Union(
				self.actor.isTakenOverActorEvent
			) in
			let unionTakeOverForCoincides : Event = Expression Union(
				self.actor.takesOverActorEvent
			) in
			let intersectionTakeOverIsTakenOverActorForCoincides : Event = Expression Intersection(
				unionIsTakenOverForCoincides,
				unionTakeOverForCoincides
			) in
			Relation Coincides(self.anActorIsTakenOverByAnotherOneResourceEvent, intersectionTakeOverIsTakenOverActorForCoincides)
		inv oneActorCanEnterInTheResourceInTheSameTimeBehavior:
			Relation Exclusion(self.actor.enterActorEvent)
		
		
	context Actor
		inv processTimeBehavior:
			Relation ActorProcessingCycle(
				self.requestActorEvent,
				self.enterActorEvent,
				self.processActorEvent,
				self.processTimeActorValue,
				self.exitActorEvent,
				self.doesNothingActorEvent,
				self.isTakenOverActorEvent,
				self.takesOverActorEvent,
				self.isPriorityActorValue
			)
		inv ActorCannotBeTakenOverAndTakesOverInTheSameTime:
			Relation Exclusion(
				self.takesOverActorEvent,
				self.isTakenOverActorEvent
			)
	
	-- ========================================================================================================
	--						BEGIN RESOURCE CLEANING AFTER HIGH PRIORITY
	-- ========================================================================================================
	
	-- Mapping event and methods	
	
	context Resource
		def : cleanResourceEvent : Event = self.clean()
	
	context Actor
		def : exitPriorityActorEvent : Event = self
		def : exitNotPriorityActorEvent : Event = self
		
	-- Constraints
	
	context Actor
		inv unionExitWithOrWithoutPriorityCoincidesExitActor:
			let unionExitWithOrWithoutPriorityForCoincides :  Event = Expression Union(
				self.exitPriorityActorEvent,
				self.exitNotPriorityActorEvent			
			) in
			Relation Coincides(self.exitActorEvent, unionExitWithOrWithoutPriorityForCoincides)
		inv excludeExitWithAndWithoutPriorityActor:
			Relation Exclusion(self.exitPriorityActorEvent, self.exitNotPriorityActorEvent)
		inv priorityOnExitBehavior:
			Relation IsPriorityActorRelation(
				self.exitPriorityActorEvent, 
				self.exitNotPriorityActorEvent,
				self.isPriorityActorValue
			)
	
	context Resource
		inv resourceUsageCycleBehavior:
			let unionPriorityActorExitForResourceUsageCycle : Event = Expression Union(
				self.actor.exitPriorityActorEvent
			) in
			let unionNotPriorityActorExitForResourceUsageCycle : Event = Expression Union(
				self.actor.exitNotPriorityActorEvent
			) in
			Relation ResourceUsageCycleRelation(
				self.isEnteredResourceEvent,
				unionNotPriorityActorExitForResourceUsageCycle,
				unionPriorityActorExitForResourceUsageCycle,
				self.isProcessedResourceEvent,
				self.doesNothingResourceEvent,
				self.anActorIsTakenOverByAnotherOneResourceEvent,
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
			Relation Alternates(self.requestActorEvent, periodStartEvent)
			
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
			let unionEnterProcess : Event = Expression Union(
				self.enterActorEvent,
				self.processActorEvent
			) in
			let unionEnterProcessExit : Event = Expression Union(
				unionEnterProcess,
				self.exitActorEvent
			) in
			let unionEnterProcessExitDoesNothing : Event = Expression Union(
				unionEnterProcessExit,
				self.doesNothingActorEvent
			) in
			let unionEnterProcessExitDoesNothingResourceIsEntered : Event = Expression Union(
				unionEnterProcessExitDoesNothing,
				self.isTakenOverActorEvent
			) in
			let unionEnterProcessExitDoesNothingResourceIsEnteredRequest : Event = Expression Union(
				unionEnterProcessExitDoesNothing,
				self.requestActorEvent
			) in			
			Relation Coincides(
				unionEnterProcessExitDoesNothingResourceIsEnteredRequest,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			)

	context Resource
		inv unionEventsOfResourceCoincidesWithTimeEvent:
			let unionIsEnteredIsProcessed : Event = Expression Union(
				self.isEnteredResourceEvent,
				self.isProcessedResourceEvent
			) in
			let unionIsEnteredIsProcessedIsExited : Event = Expression Union(
				unionIsEnteredIsProcessed,
				self.isExitedResourceEvent
			) in
			let unionIsEnteredIsProcessedIsExitedDoesNothingResource : Event = Expression Union(
				unionIsEnteredIsProcessedIsExited,
				self.doesNothingResourceEvent
			) in
			let unionIsEnteredIsProcessedIsExitedDoesNothingResourceTakenOver : Event = Expression Union(
				unionIsEnteredIsProcessedIsExitedDoesNothingResource,
				self.anActorIsTakenOverByAnotherOneResourceEvent
			) in
			let unionIsEnteredIsProcessedIsExitedDoesNothingResourceTakenOverClean : Event = Expression Union(
				unionIsEnteredIsProcessedIsExitedDoesNothingResourceTakenOver,
				self.cleanResourceEvent
			) in
			Relation Coincides(
				unionIsEnteredIsProcessedIsExitedDoesNothingResourceTakenOverClean,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			)
			
endpackage