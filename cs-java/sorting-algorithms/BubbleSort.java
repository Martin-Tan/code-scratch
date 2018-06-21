/******************************************************************************
 *  Compilation:  javac BubbleSort.java
 *  Execution:    java BubbleSort arg
 *
 *  Print a string with sorted order.
 *
 *  % java BubbleSort 32332211110
 *  Sorted string: 01111222333
 * 
 *  % java BubbleSort 321CBAcba
 *  Sorted string: 123ABCabc
 *
 ******************************************************************************/

public class BubbleSort {
    public static void main(String[] args) {
        char[] charArray = args[0].toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;

                    swapped = true;
                }
            }

            if (swapped == false){
                break;
            }
        }

        System.out.println("Sorted string: " + new String(charArray));
    }
}