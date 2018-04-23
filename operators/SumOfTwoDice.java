/******************************************************************************
 *  Compilation:  javac SumOfTwoDice.java
 *  Execution:    java SumOfTwoDice
 *  
 *  Prints the binary string of a integer.
 * 
 *  % java SumOfTwoDice
 *  The sum of two dice is 5
 *
 *  % java SumOfTwoDice
 *  The sum of two dice is 11
 *
 ******************************************************************************/

import java.util.Random;

public class SumOfTwoDice {
	public static void main(String[] args) {
		int max = 6;
		int min = 1;
		int diceOnePoint = rollDice(min, max);
		int diceTwoPoint = rollDice(min, max);

		System.out.println("The sum of tow dice is " + (diceOnePoint +  diceTwoPoint));
	}

	public static int rollDice(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}
}