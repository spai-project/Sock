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
	-- ========================================================================================================

	-- Mapping event and methods
	
	context Resource
		def : isEnteredResourceEvent : Event = self
		def : isProcessedResourceEvent : Event = self
		def : isExitedResourceEvent : Event = self
		def : doesNothingResourceEvent : Event = self
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
		def : takeOverActorEvent : Event = self.enterIn()
		
--		def : enterIsPriorityActorEvent : Event = self
--		def : enterIsNotPriorityActorEvent : Event = self
--		def : exitIsPriorityActorEvent : Event = self
--		def : exitIsNotPriorityActorEvent : Event = self
	
	-- Constraints
	
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
				self.actor.takeOverActorEvent
			) in
			let intersectionTakeOverIsTakenOverActorForCoincides : Event = Expression Intersection(
				unionIsTakenOverForCoincides,
				unionTakeOverForCoincides
			) in
			Relation Coincides(self.anActorIsTakenOverByAnotherOneResourceEvent, intersectionTakeOverIsTakenOverActorForCoincides)
	
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
				self.takeOverActorEvent,
				self.isPriorityActorValue
			)
	
	context Resource
		inv oneActorCanEnterInTheResourceInTheSameTimeBehavior:
			Relation Exclusion(self.actor.enterActorEvent)
	
	-- ========================================================================================================
	--						BEGIN RESOURCE CLEANING AFTER HIGH PRIORITY
	-- ========================================================================================================
	
	
	context Resource
		inv resourceUsageCycleBehavior:
			Relation ResourceUsageCycleRelation(
				self.isEnteredResourceEvent,
				self.isExitedResourceEvent,
				self.isProcessedResourceEvent,
				self.doesNothingResourceEvent,
				self.anActorIsTakenOverByAnotherOneResourceEvent
			)
	
	-- Mapping event and methods	
	
--	context Resource
--		def : cleanResourceEvent : Event = self.clean()
		
	-- Constraints
	
--	context Actor
--		inv enterSubclockEnterBehavior:
--			let unionOfEnterWithPriority : Event = Expression Union(
--				self.enterIsPriorityActorEvent,
--			 	self.enterIsNotPriorityActorEvent
--			) in
--			Relation Coincides(unionOfEnterWithPriority, self.enterActorEvent)
--		inv exitIsPrioritySublockEnter:
--			let unionOfExitWithPriority : Event = Expression Union(
--				self.exitIsPriorityActorEvent,
--				self.exitIsNotPriorityActorEvent
--			) in
--			Relation Coincides(unionOfExitWithPriority, self.exitActorEvent)
--		inv priorityOnExitBehavior:
--			Relation IsPriorityActorRelation(
--				self.exitIsPriorityActorEvent, 
--				self.exitIsNotPriorityActorEvent,
--				self.isPriorityActorValue
--			)
--		inv priorityOnEnterBehavior:
--			Relation IsPriorityActorRelation(
--				self.enterIsPriorityActorEvent, 
--				self.enterIsNotPriorityActorEvent,
--				self.isPriorityActorValue
--			)
			
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
			let unionIsEnteredAndIsProcessedResourceEvent : Event = Expression Union(
				self.isEnteredResourceEvent,
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
			let unionIsEnteredAndIsProcessedResourceEventIsExitedAndDoesNothingResourceEventTakenOver : Event = Expression Union(
				unionIsEnteredAndIsProcessedResourceEventIsExitedAndDoesNothingResourceEvent,
				self.anActorIsTakenOverByAnotherOneResourceEvent
			) in
			Relation Coincides(
				unionIsEnteredAndIsProcessedResourceEventIsExitedAndDoesNothingResourceEvent,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			)
			
endpackage