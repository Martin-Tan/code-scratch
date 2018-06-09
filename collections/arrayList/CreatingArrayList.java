/******************************************************************************
 *  Compilation:  javac CreatingArrayList.java
 *  Execution:    java CreatingArrayList arg
 *
 *  Convert an Array to two List variables to see the difference between 
 *  a wrapper class and a new instance.
 *
 *  % java CreatingArrayList 
 *  [a, bc, ddd]
 *  [a, bb, ddd, eeee]
 *  
 *  [a, Newbb, ddd]
 *  [a, Newbb, ddd]
 *
 ******************************************************************************/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class CreatingArrayList {
	public static void main(String[] args) {
		String[] strArr = new String[] {"a", "bc", "ddd"};
		// Create an instance of ArrayList with an internal array.
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(strArr));
		
		arrList.add("eeee");
		arrList.set(1, "bb");

		System.out.println(Arrays.toString(strArr));
		System.out.println(arrList.toString());
		System.out.println();

		// java.util.Arrays$ArrayList cannot be cast to java.base/java.util.ArrayList
		//ArrayList<String> arrListWrapper = (ArrayList)Arrays.asList(strArr);
		List<String> listWrapper = Arrays.asList(strArr);
		
		// Can't use add/delete method here because it's a wrapper class 
		// with an array referenced to the original array.
		// listWrapper.add("eeee");

		// The operation of set method will reflect on the original array.
		listWrapper.set(1, "Newbb");

		System.out.println(Arrays.toString(strArr));
		System.out.println(listWrapper.toString());
		System.out.println();
	}
}