package fr.inria.kairos.sock.dsl.example.sidechannel;

import java.util.ArrayList;
import java.util.stream.Collectors;

import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import fr.inria.kairos.sock.dsl.model.sock.SockFactory;
import fr.inria.kairos.sock.example.utils.Interval;
import fr.inria.kairos.sock.example.utils.Utils;

public class MainTestSock {

	public static void main(String [] args) {
		final IotSystem s = SockFactory.eINSTANCE.createIotSystem();
		s.setName("s");
		
		final Resource r = SockFactory.eINSTANCE.createResource();
		r.setName("r");
		
		final Actor a1 = SockFactory.eINSTANCE.createActor();
		a1.setName("a");
		a1.setPeriodTime(15);
		a1.setProcessTime(3);
		a1.setResource(r); 
		a1.setIsSensible(1);
		
		
		final Actor a2 = SockFactory.eINSTANCE.createActor();
		a2.setName("b");
		a2.setPeriodTime(25);
		a2.setProcessTime(5);
		a2.setResource(r);
		
		s.getOwnedActor().add(a1);
		s.getOwnedActor().add(a2);
		s.getOwnedResource().add(r);
		
		final int lcm = Utils.lcm(s.getOwnedActor().stream().map(Actor::getPeriodTime).collect(Collectors.toList()));
		System.out.println("LCM " +s.getOwnedActor().stream().map(Actor::getPeriodTime).collect(Collectors.toList()) + " = " + lcm);
		
		// 1>[[0 ; 5] {5}, [16 ; 21] {5}, [26 ; 37] {11}, [47 ; 55] {8}, [62 ; 67] {5}]
//		ScheduLeak.initInstance(s).busyInterval.add(new Interval(0, 5));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(16, 21));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(26, 37));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(47, 55));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(62, 67));
		// 1>[[0 ; 12] {12}, [16 ; 21] {5}, [26 ; 40] {14}, [47 ; 59] {12}, [62 ; 67] {5}]
//		ScheduLeak.initInstance(s).busyInterval.add(new Interval(0, 12));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(16, 21));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(26, 40));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(47, 59));
//		ScheduLeak.getInstance().busyInterval.add(new Interval(62, 67));
//		1>[[0 ; 12] {13}, [16 ; 21] {6}, [26 ; 39] {14}, [46 ; 58] {13}, [61 ; 67] {7}]
		ScheduLeak.initInstance(s).busyIntervals.add(new Interval(0, 12));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(16, 21));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(26, 39));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(46, 58));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(61, 67));
		Utils.indicesOfTakesOver.put(a2, new ArrayList<>());
		Utils.indicesOfTakesOver.get(a2).add(31);
		
		ScheduLeak.getInstance().run();
	}
	
}
