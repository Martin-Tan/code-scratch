/******************************************************************************
 *  Compilation:  javac EnsureCapacity.java
 *  Execution:    java EnsureCapacity
 *
 *  Increasing the capacity of ArrayList mannully.
 *
 *  % java EnsureCapacity 
 * 	[a, b, c, d, beyonded the length, E]
 * 
 ******************************************************************************/

import java.util.ArrayList;

class EnsureCapacity {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>(4);
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("d");
		arrList.add("beyonded the length");

		arrList.ensureCapacity(10);

		arrList.add("E");

		System.out.println(arrList);
	}
}