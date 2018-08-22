/******************************************************************************
 *  Compilation:  javac StringReverse.java
 *  Execution:    java StringReverse
 *
 *  Reversing strings and having the compatibility with empty string.
 *
 *  % java StringReverse
 *  !dlroW olleH
 *  olleH !dlroW
 *
 ******************************************************************************/

class StringReverse {
    public static void main(String[] args) {
        println(reverse("Hello World!"));
        println(reverseByWord("Hello World!"));
    }

    public static void println(String value) {
        System.out.println(value);
    }

    public static void println(int value) {
        System.out.println(value);
    }

    // (new StringBuilder(str)).reverse().toString();
    public static String reverse(String str) {
        char[] strArray = str.toCharArray();
        int length = str.length();
        for(int i = (length - 1) >> 1; i >= 0; i--) {
            int j = length - i - 1;
            char left = str.charAt(i);
            char right = str.charAt(j);

            // Swap value;
            strArray[i] = right;
            strArray[j] = left;
        }

        return String.valueOf(strArray);
    }

    // Join array elements with a string.
    public static String implode(String glue, String[] strArray) {
        String result = "";

        for(int i = 0; i < strArray.length; i++) {
            result += reverse(strArray[i]);
            if (i < strArray.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static String reverseByWord(String str) {
        String[] strArray = str.split(" ");

        return implode(" ", strArray);
    }
}