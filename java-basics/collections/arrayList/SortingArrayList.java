/******************************************************************************
 *  Compilation:  javac SortingArrayList.java
 *  Execution:    java SortingArrayList
 *
 *  Soring an ArrayList in ascending and descending orders.
 *
 *  % java SortingArrayList 
 * 
 *  ArrayList arranged in ascending order.
 *  [China, Greece, Peru, United Status]
 *  
 *  ArrayList arranged in descending order.
 *  [United Status, Peru, Greece, China]
 * 
 ******************************************************************************/

import java.util.ArrayList;
import java.util.Collections;

class SortingArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Peru");
		arrList.add("China");
		arrList.add("United Status");
		arrList.add("Greece");

		System.out.println("ArrayList arranged in ascending order.");
		Collections.sort(arrList);
		System.out.println(arrList.toString());

		System.out.println("\nArrayList arranged in descending order.");
		Collections.sort(arrList, Collections.reverseOrder());
		System.out.println(arrList.toString());
	}
}