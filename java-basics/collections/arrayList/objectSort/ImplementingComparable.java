/******************************************************************************
 *  Compilation:  javac ImplementingComparable.java
 *  Execution:    java ImplementingComparable
 *
 *  Comparing customized classes.
 *	
 *  % java ImplementingComparable  
 *
 *  After sorted: 
 *  
 * [name = Anthony, age = 16, rollNO = 99, 
 *  name = Micheal, age = 18, rollNO = 101, 
 *  name = Owen, age = 19, rollNO = 102]
 *  
 ******************************************************************************/


import java.util.Collections;
import java.util.ArrayList;

class ImplementingComparable {
	public static void main(String[] args) {
		ArrayList<Student> arrList = new ArrayList<Student>();
		arrList.add(new Student("Micheal", 18, 101));
		arrList.add(new Student("Anthony", 16, 99));
		arrList.add(new Student("Owen", 19, 102));

		Collections.sort(arrList);

		System.out.println("After sorted: \n");
		System.out.println(arrList);
	}
}