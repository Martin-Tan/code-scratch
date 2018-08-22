/******************************************************************************
 *  Compilation:  javac RemovingTrailingSpaces.java
 *  Execution:    java RemovingTrailingSpaces
 *
 *  Removing the trailing spaces of a String.
 *	
 *  % java RemovingTrailingSpaces  
 *  Removed trailing spaces: 
 *  /News is information about current events./
 *  
 ******************************************************************************/

class RemovingTrailingSpaces {
	public static String trimTrailingBlanks(String str) {
		int length = str.length();
		for (; length > 0; length--) {
			if (!Character.isWhitespace(str.charAt(length - 1))) {
				break;
			}
		}

		return str.substring(0, length);
	}
	
	public static void main(String[] args) {
		// Define a String with two spaces at the end.
		String exampleString = "News is information about current events.  ";

		System.out.println("Removed trailing spaces: ");
		System.out.println("/" + trimTrailingBlanks(exampleString) + "/");
	}
}