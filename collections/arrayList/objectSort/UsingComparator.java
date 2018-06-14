/******************************************************************************
 *  Compilation:  javac UsingComparator.java
 *  Execution:    java UsingComparator
 *
 *  Comparing customized classes by Comparator.
 *	
 *  % java UsingComparator  
 *
 *  After sorted: 
 *  
 *  Sorted by age:
 *  [name = Micheal, age = 18, name = John, age = 19, name = Anthony, age = 22] 
 *  
 *  Sorted by name:
 *  [name = Anthony, age = 22, name = John, age = 19, name = Micheal, age = 18] 
 *  
 ******************************************************************************/

import java.util.ArrayList;
import java.util.Collections;

class UsingComparator {
	public static void main(String[] args) {
		ArrayList<StudentComparator> arrList = new ArrayList<StudentComparator>();
		arrList.add(new StudentComparator("Micheal", 18, 101));
		arrList.add(new StudentComparator("Anthony", 22, 99));
		arrList.add(new StudentComparator("John", 19, 102));

		Collections.sort(arrList, StudentComparator.studentAgeComparator);
		System.out.println("Sorted by age:");
		System.out.println(arrList);
		
		System.out.println("");
		
		Collections.sort(arrList, StudentComparator.studentNameComparator);
		System.out.println("Sorted by name:");
		System.out.println(arrList);
	}
}