/******************************************************************************
 *  Compilation:  javac IntegerToBinary.java
 *  Execution:    java IntegerToBinary x
 *  
 *  Prints the binary string of a integer.
 * 
 *  % java IntegerToBinary 0
 *  The integer value is: 0
 *  The binary value is: 0
 *
 *  % java IntegerToBinary 2147483647
 *  The integer value is: 2147483647
 *  The binary value is: 1111111111111111111111111111111
 *
 *  % java IntegerToBinary -1
 *  The integer value is: -1
 *  The binary value is: 11111111111111111111111111111111
 *
 ******************************************************************************/

public class IntegerToBinary {
	public static void main(String[] args) {
		int intArg = Integer.parseInt(args[0]);

		System.out.println("The int value is: " + intArg);
		System.out.println("The binary value is: " + Integer.toBinaryString(intArg));	
	}
}
