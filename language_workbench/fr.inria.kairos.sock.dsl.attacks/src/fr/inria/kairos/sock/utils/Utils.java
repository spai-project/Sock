package fr.inria.kairos.sock.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.inria.kairos.sock.dsl.model.sock.Actor;

public class Utils {
	
	public static int lcm(List<Integer> integers) {
		Collections.sort(integers);
		final int[] lcm = new int[] {integers.get(integers.size() - 1)};
		while (true) {
			if (integers.stream().allMatch(integer -> lcm[0] % integer == 0)) {
				return lcm[0];
			} else {
				lcm[0]++;
			}
		}
	}
	
	public static int getSmallest(List<int[]> estimationsN, int indexActor) {
		int smallest = Integer.MAX_VALUE;
		for(int[] array : estimationsN) {
			if (array[indexActor] < smallest) {
				smallest = array[indexActor];
			}
		}
		return smallest;
	}
	
	public static final Map<Actor, List<Integer>> indicesOfTakesOver = new HashMap<>();
	
	private static final int enterTaskCost = 1;
	
	private static final int exitTaskCost = 1;
	
	private static final int flushTaskCost = 1;
	
	public static int computeRealProcessTime(Actor actor, Interval time) {
		 return actor.getProcessTime() + enterTaskCost + exitTaskCost
			+ (actor.getIsSensible() == 1 ? flushTaskCost : 0) + 
			(indicesOfTakesOver.containsKey(actor) && 
					indicesOfTakesOver.get(actor).stream().anyMatch(time::isWithin) ? 1 : 0);
	}
	
//	public static int computeRealProcessTime(Actor actor, Interval time) {
//		 return actor.getProcessTime() + enterTaskCost + exitTaskCost
//			+ (actor.getIsSensible() == 1 ? flushTaskCost : 0);
//	}
	
//	public static int computeRealProcessTime(Actor actor, Interval time) {
//		 return actor.getProcessTime();
//	}

}
