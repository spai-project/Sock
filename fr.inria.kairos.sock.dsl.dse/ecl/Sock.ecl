import 'http://kairos.inria.fr/sock'

import 'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

ECLimport "platform:/resource/fr.inria.kairos.sock.dsl.moccml/mocc/resourceUsageCycle.moccml"
ECLimport "platform:/resource/fr.inria.kairos.sock.dsl.moccml/mocc/actorProcessingCycle.moccml"

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
		def : isRequestedResourceEvent : Event = self
		def : isEnteredResourceEvent : Event = self
		def : isProcessedResourceEvent : Event = self
		def : isExitedResourceEvent : Event = self
		def : doesNothingResourceEvent : Event = self
	
	
	context  Actor
		def : requestActorEvent : Event = self
		def : enterActorEvent : Event = self
		def : processActorEvent : Event = self
		def : exitActorEvent : Event = self
		def : doesNothingActorEvent : Event = self
		
	
	-- Constraints
	
	context IotSystem
		inv unionOfRequestActorCoincidesWithUnionOfIsRequestedResource:
			let unionIsRequestedResource : Event = Expression Union(self.ownedResource.isRequestedResourceEvent) in
			let unionRequestActor : Event = Expression Union(self.ownedActor.requestActorEvent) in
				Relation Coincides(unionIsRequestedResource, unionRequestActor)
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
				Relation Coincides(unionisExitedResource, unionExitActor)
			
	-- ========================================================================================================
	--						BEGIN PROCESS TIME 
	-- ========================================================================================================
		
	-- Mapping event and methods	
			
	context Actor
		def : processTimeActorValue : Integer = self.processTime
		def : isPriorityActorValue : Integer = self.isPriority
		def : resourceOfActorIsEnteredActorEvent : Event = self
	
	context Actor
		inv resourceIsEnteredActorBehavior:
			Relation SubClock(self.resourceOfActorIsEnteredActorEvent, self.resource.isEnteredResourceEvent)
		inv processTimeBehavior:
			Relation ActorProcessingCycle(
				self.requestActorEvent,
				self.enterActorEvent,
				self.processActorEvent,
				self.processTimeActorValue,
				self.exitActorEvent,
				self.doesNothingActorEvent,
				self.resourceOfActorIsEnteredActorEvent,
				self.isPriorityActorValue
			)
			
	
	-- ========================================================================================================
	--						BEGIN RESOURCE CLEANING AFTER HIGH PRIORITY
	-- ========================================================================================================
	
	-- TODO
	
	-- ========================================================================================================
	--						BEGIN RESOURCE ACCESS
	-- ========================================================================================================
	
	context Resource
		inv oneActorCanEnterInTheResourceInTheSameTimeBehavior:
			Relation Exclusion(self.actor.enterActorEvent)
			
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
			let unionRequestAndEnterActorEvent : Event = Expression Union(
				self.requestActorEvent,
				self.enterActorEvent
			) in
			let unionRequestAndEnterAndProcessActorEvent : Event = Expression Union(
				unionRequestAndEnterActorEvent,
				self.processActorEvent
			) in
			let unionRequestAndEnterAndProcessAndExitActorEvent : Event = Expression Union(
				unionRequestAndEnterAndProcessActorEvent,
				self.exitActorEvent
			) in
			let unionRequestAndEnterAndProcessAndExitAndDoesNothingActorEvent : Event = Expression Union(
				unionRequestAndEnterAndProcessAndExitActorEvent,
				self.doesNothingActorEvent
			) in
			let unionvREPEDoesNothingAndNewClockActorEvent : Event = Expression Union(
				unionRequestAndEnterAndProcessAndExitAndDoesNothingActorEvent,
				self.resourceOfActorIsEnteredActorEvent
			) in
			Relation Coincides(
				unionvREPEDoesNothingAndNewClockActorEvent,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			)

	context Resource
		inv unionEventsOfResourceCoincidesWithTimeEvent:
			let unionIsRequestedAndIsEnteredResourceEvent : Event = Expression Union(
				self.isRequestedResourceEvent,
				self.isEnteredResourceEvent
			) in
			let unionIsRequestedAndIsEnteredAndIsProcessedResourceEvent : Event = Expression Union(
				unionIsRequestedAndIsEnteredResourceEvent,
				self.isProcessedResourceEvent
			) in
			let unionIsRequestedAndIsEnteredAndIsProcessedAndIsExitedResourceEvent : Event = Expression Union(
				unionIsRequestedAndIsEnteredAndIsProcessedResourceEvent,
				self.isExitedResourceEvent
			) in
			let unionIsRequestedAndIsEnteredAndIsProcessedAndIsExitedAndDoesNothingResourceEvent : Event = Expression Union(
				unionIsRequestedAndIsEnteredAndIsProcessedAndIsExitedResourceEvent,
				self.doesNothingResourceEvent
			) in
			Relation Coincides(
				unionIsRequestedAndIsEnteredAndIsProcessedAndIsExitedAndDoesNothingResourceEvent,
				self.oclAsType(ecore::EObject).eContainer().oclAsType(IotSystem).timeEvent
			)
		inv isRequestedExcludesDoesNothing:
			Relation Exclusion(
				self.isRequestedResourceEvent,
				self.doesNothingResourceEvent
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