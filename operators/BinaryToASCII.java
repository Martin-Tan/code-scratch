/******************************************************************************
 *  Compilation:  javac BinaryToASCII.java
 *  Execution:    java BinaryToASCII x
 *  
 *  Prints the ASCII code of a string.
 * 
 *  % java BinaryToASCII a
 *  The binary string of your input is 01100001
 *  The ASCII Code of a is 97
 *
 *  % java BinaryToASCII aA
 *  The binary string of your input is 0110000101000001
 *  The ASCII Code of a is 97
 *  The ASCII Code of A is 65
 *
 *
 ******************************************************************************/

import java.util.Arrays;

public class BinaryToASCII {
	public static void main(String[] args) {
		// First convert input string to binary string.
		char[] charArray = args[0].toCharArray();
		StringBuilder stringArray = new StringBuilder();
		int ASCIICharLength = 8;
		for (int i = 0; i < charArray.length; i++) {
			String charBinaryString = Integer.toBinaryString(charArray[i]);

			// Fill the ignored left zero positions.
			// 1100001 to 01100001
			if (charBinaryString.length() < ASCIICharLength){
				int filledZeroLength = ASCIICharLength - charBinaryString.length();
				char[] filledZero = new char[filledZeroLength];
				Arrays.fill(filledZero, '0');
				String prefix = new String(filledZero);

				charBinaryString = prefix.toString() + charBinaryString;
			}

			stringArray.append(charBinaryString);
		}

		String argBinaryString = stringArray.toString();
		System.out.println("The binary string of your input is " + argBinaryString);

		// Second, convert binary string to ASCII char.
		StringBuilder ASCIIStringArray = new StringBuilder();
		for (int i = 0; i < argBinaryString.length(); i += 8) {
			String subBinaryString = argBinaryString.subSequence(i, i +8).toString();
			int ASCIICodeNumber = Integer.parseInt(subBinaryString, 2);
			System.out.println("The ASCII Code of "+ ((char) ASCIICodeNumber) +" is " + ASCIICodeNumber);
		}
	}
}