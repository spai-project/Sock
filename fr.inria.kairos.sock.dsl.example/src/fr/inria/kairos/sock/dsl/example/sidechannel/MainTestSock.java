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
		
//		final Actor a1 = SockFactory.eINSTANCE.createActor();
//		a1.setName("a");
//		a1.setPeriodTime(15);
//		a1.setProcessTime(3);
//		a1.setResource(r); 
//		a1.setIsSensible(1);
//		
//		final Actor a2 = SockFactory.eINSTANCE.createActor();
//		a2.setName("b");
//		a2.setPeriodTime(25);
//		a2.setProcessTime(5);
//		a2.setResource(r);
		
		// S 4
		
		final Actor a1 = SockFactory.eINSTANCE.createActor();
		a1.setName("a");
		a1.setPeriodTime(10);
		a1.setProcessTime(2);
		a1.setResource(r); 
		a1.setIsSensible(0);
		
		final Actor a2 = SockFactory.eINSTANCE.createActor();
		a2.setName("b");
		a2.setPeriodTime(35);
		a2.setProcessTime(4);
		a2.setResource(r);
		a2.setIsSensible(1);
		
		
		// S 0
		
//		final Actor a1 = SockFactory.eINSTANCE.createActor();
//		a1.setName("a");
//		a1.setPeriodTime(20);
//		a1.setProcessTime(1);
//		a1.setResource(r); 
//		a1.setIsSensible(1);
//		
//		final Actor a2 = SockFactory.eINSTANCE.createActor();
//		a2.setName("b");
//		a2.setPeriodTime(45);
//		a2.setProcessTime(4);
//		a2.setResource(r);
//		a2.setIsSensible(1);
//		
//		final Actor a3 = SockFactory.eINSTANCE.createActor();
//		a3.setName("c");
//		a3.setPeriodTime(45);
//		a3.setProcessTime(4);
//		a3.setResource(r);
//		a3.setIsSensible(0);
//		
//		final Actor a4 = SockFactory.eINSTANCE.createActor();
//		a4.setName("d");
//		a4.setPeriodTime(45);
//		a4.setProcessTime(4);
//		a4.setResource(r);
//		a4.setIsSensible(1);
		
		// S 1
		
//		final Actor a1 = SockFactory.eINSTANCE.createActor();
//		a1.setName("a");
//		a1.setPeriodTime(25);
//		a1.setProcessTime(1);
//		a1.setResource(r); 
//		a1.setIsSensible(0);
//		
//		final Actor a2 = SockFactory.eINSTANCE.createActor();
//		a2.setName("b");
//		a2.setPeriodTime(25);
//		a2.setProcessTime(1);
//		a2.setResource(r);
//		a2.setIsSensible(1);
//		
//		final Actor a3 = SockFactory.eINSTANCE.createActor();
//		a3.setName("c");
//		a3.setPeriodTime(20);
//		a3.setProcessTime(2);
//		a3.setResource(r);
//		a3.setIsSensible(0);
//		
//		final Actor a4 = SockFactory.eINSTANCE.createActor();
//		a4.setName("d");
//		a4.setPeriodTime(25);
//		a4.setProcessTime(2);
//		a4.setResource(r);
//		a4.setIsSensible(1);
		
		s.getOwnedActor().add(a1);
		s.getOwnedActor().add(a2);
//		s.getOwnedActor().add(a3);
//		s.getOwnedActor().add(a4);
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
//		ScheduLeak.initInstance(s).busyIntervals.add(new Interval(0, 12));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(16, 21));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(26, 39));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(46, 58));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(61, 67));
//		Utils.indicesOfTakesOver.put(a2, new ArrayList<>());
//		Utils.indicesOfTakesOver.get(a2).add(31);
//		[[0 ; 13] {14}, [16 ; 22] {7}, [26 ; 39] {14}, [46 ; 58] {13}, [61 ; 68] {8}]
//		ScheduLeak.initInstance(s).busyIntervals.add(new Interval(0, 13));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(16, 22));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(26, 39));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(46, 58));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(62, 68));
//		Utils.indicesOfTakesOver.put(a2, new ArrayList<>());
//		Utils.indicesOfTakesOver.get(a2).add(2);
//		Utils.indicesOfTakesOver.get(a2).add(32);
		// S4
//		[[0 ; 14] {15}, [21 ; 24] {4}, [31 ; 34] {4}, [36 ; 46] {11}, [51 ; 54] {4}, [61 ; 64] {4}]
		ScheduLeak.initInstance(s).busyIntervals.add(new Interval(0, 14));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(21, 24));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(31, 34));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(36, 46));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(51, 54));
		ScheduLeak.getInstance().busyIntervals.add(new Interval(61, 64));
		// S0
//		[[0 ; 28] {29}, [41 ; 44] {4}, [46 ; 70] {25}, [81 ; 84] {4}, [91 ; 115] {25}, [121 ; 124] {4}, [136 ; 159] {24}, [161 ; 164] {4}]
//		{fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl@6a14422 (name: a2060070) (isSensible: 0, processTime: 4, periodTime: 45, currentProcessTime: 4, code: null)=[101], 
//		fr.inria.kairos.sock.dsl.model.sock.impl.ActorImpl@25c2ca6d (name: a3060070) (isSensible: 1, processTime: 4, periodTime: 45, currentProcessTime: 4, code: null)=[21, 61]}
//		ScheduLeak.initInstance(s).busyIntervals.add(new Interval(0, 28));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(41, 44));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(46, 70));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(81, 84));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(91, 115));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(121, 124));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(136, 159));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(161, 164));
//		Utils.indicesOfTakesOver.put(a3, new ArrayList<>());
//		Utils.indicesOfTakesOver.get(a3).add(101);
//		Utils.indicesOfTakesOver.put(a4, new ArrayList<>());
//		Utils.indicesOfTakesOver.get(a4).add(21);
//		Utils.indicesOfTakesOver.get(a4).add(61);
		// S1
//		[[0 ; 15] {16}, [21 ; 24] {4}, [26 ; 37] {12}, [41 ; 44] {4}, [51 ; 66] {16}, [76 ; 91] {16}]
//		ScheduLeak.initInstance(s).busyIntervals.add(new Interval(0, 15));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(21, 24));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(26, 37));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(41, 44));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(51, 66));
//		ScheduLeak.getInstance().busyIntervals.add(new Interval(76, 91));
		
		ScheduLeak.getInstance().run();
	}
	
}
