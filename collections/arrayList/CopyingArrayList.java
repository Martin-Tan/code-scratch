/******************************************************************************
 *  Compilation:  javac CopyingArrayList.java
 *  Execution:    java CopyingArrayList
 *
 *  Showing the different ways of coping an ArrayList.
 *	
 *  % java CopyingArrayList  
 *
 *  Cloned and remove the first element from the cloned ArrayList.
 *  Original ArrayList.
 *  [Superman, Spiderman, Wonder Woman]
 *  [Superman, Wonder Woman]
 *  
 *  reference the original ArrayList and remove the first element from the linked ArrayList.
 *  Original ArrayList.
 *  [Superman, Wonder Woman]
 *  [Superman, Wonder Woman]
 *  
 ******************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CopyingArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Superman");		
		arrList.add("Spiderman");		
		arrList.add("Wonder Woman");

		/*********************** Clone ********************************/
		// Copy an ArrayList by method clone().
		ArrayList<String> clonedArrList = new ArrayList<String>();
		clonedArrList = (ArrayList<String>)arrList.clone();
		// AddAll will do the same thing.
		//copiedArrList.addAll(arrList);
		clonedArrList.remove(1);

		System.out.println("Cloned and remove the first element from the cloned ArrayList.");
		System.out.println("Original ArrayList.");
		System.out.println(arrList);
		System.out.println(clonedArrList);

		/*********************** Link ********************************/
		ArrayList<String> linkedArrList = new ArrayList<String>();
		linkedArrList = arrList;

		// copiedArray must have the same size with the resource.
		//Collections.copy(copiedArrList, arrList);

		linkedArrList.remove(1);

		System.out.println("");
		System.out.println("reference the original ArrayList "
			+ "and remove the first element from the linked ArrayList.");
		System.out.println("Original ArrayList.");
		System.out.println(arrList);
		System.out.println(linkedArrList);
	}
}