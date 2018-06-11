/******************************************************************************
 *  Compilation:  javac LoopingArrayList.java
 *  Execution:    java LoopingArrayList arg
 *
 *  Convert an Array to two List variables to see the difference between 
 *  a wrapper class and a new instance.
 *
 *  % java LoopingArrayList 
 *  Print ArrayList
 *  [first, second, third]
 *  
 *  For Loop for iterating ArrayList
 *  first
 *  second
 *  third
 *  
 *  Advanced For Loop
 *  first
 *  second
 *  third
 *  
 *  While Loop for iterating ArrayList
 *  first
 *  second
 *  third
 *  
 *  Looping ArrayList using Iterator
 *  first
 *  second
 *  third
 *
 ******************************************************************************/
import java.util.ArrayList;
import java.util.Iterator;
class LoopingArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("first");
		arrList.add("second");
		arrList.add("third");

		System.out.println("Print ArrayList");
		System.out.println(arrList.toString());


		System.out.println("\nFor Loop for iterating ArrayList");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		System.out.println("\nAdvanced For Loop");
		for (String value : arrList) {
			System.out.println(value);
		}

		System.out.println("\nWhile Loop for iterating ArrayList");
		int i = 0;
		while (arrList.size() > i) {
			System.out.println(arrList.get(i));
			i++;
		}

		System.out.println("\nLooping ArrayList using Iterator");
		Iterator iterator = arrList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}