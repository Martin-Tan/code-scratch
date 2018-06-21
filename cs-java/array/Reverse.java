/******************************************************************************
 *  Compilation:  javac Reverse.java
 *  Execution:    java Reverse
 *  
 *  Prints a reversed array.
 * 
 *  % java Reverse
 *  [9, 8, 7, 6, 5, 4, 3, 2, 1]
 *
 ******************************************************************************/

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] deck = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = deck.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = deck[i];
			deck[i] = deck[n - 1 - i];
			deck[n - 1 - i] = temp;
		}

		System.out.println(Arrays.toString(deck));
	}
}
