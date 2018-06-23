/******************************************************************************
 *  Compilation:  javac PaddingString.java
 *  Execution:    java PaddingString
 *
 *  Complete the length of a String number by adding zero at the beginning.
 *	
 *  % java PaddingString  
 *  The number is 986
 *  Extend the number to the length of 2
 *  986
 *  Extend the number to the length of 10
 *  9860000000
 *  
 ******************************************************************************/
class PaddingString {
	public static String padLeftWithSpaces(String str, int spaceNumber) {
		return String.format("%1$" + spaceNumber + "s", str);
	}

	public static String padRightWithSpaces(String str, int spaceNumber) {
		return String.format("%1$-" + spaceNumber + "s", str);
	}

	public static String fullFillIntegerWithZero(String stringNumber, int fullLength) {
		return padLeftWithSpaces(stringNumber, fullLength).replace(' ', '0');
	}

	public static void main(String[] args) {
		String stringNumber = "986";
		System.out.println("The number is " + stringNumber);

		System.out.println("Extend the number to the length of 2");
		System.out.println(PaddingString.fullFillIntegerWithZero(stringNumber, 2));

		System.out.println("Extend the number to the length of 10");
		System.out.println(PaddingString.fullFillIntegerWithZero(stringNumber, 10));
	}
}