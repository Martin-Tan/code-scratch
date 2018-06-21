/******************************************************************************
 *  Compilation:  javac LoopingHashMap.java
 *  Execution:    java LoopingHashMap
 *
 *  Looping HashMap by for and while.
 *	
 *  % java LoopingHashMap  
 *  For Loop:
 *  Key: 100, Value: AA
 *  Key: 103, Value: CC
 *  Key: 10, Value: BB
 *  
 *  While Loop:
 *  Key: 100, Value: AA
 *  Key: 103, Value: CC
 *  Key: 10, Value: BB
 *  
 ******************************************************************************/

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class LoopingHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> strHashMap = new HashMap<Integer, String>();

		strHashMap.put(100, "AA");
		strHashMap.put(10, "BB");
		strHashMap.put(103, "CC");

		// For Loop
		System.out.println("For Loop:");
		for (Map.Entry entry : strHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// While Loop
		System.out.println("\nWhile Loop:");
		Iterator iterator = strHashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entryNode = (Map.Entry)iterator.next();
			System.out.println("Key: " + entryNode.getKey() + ", Value: " + entryNode.getValue());	
		}
	}
}