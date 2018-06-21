/******************************************************************************
 * Compilation: javac ExclusiveOr.java
 * Execution: java ExclusiveOr a b
 *
 * Prints how exclusive or works
 *
 * % java ExclusiveOr 3 4
 * The result is: 1
 *
 * % java ExclusiveOr 0 100
 * The result is: 100
 *
 * *****************************************************************************/

import java.util.Arrays;
public class ExclusiveOr {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Convert int variables to binary strings.
        String binaryStringA = Integer.toBinaryString(a);
        String binaryStringB = Integer.toBinaryString(b);

        char[] arrA = binaryStringA.toCharArray();
        char[] arrB = binaryStringB.toCharArray();

        int difference = Math.abs(arrA.length - arrB.length);

        int maxLength = (arrA.length > arrB.length) ? arrA.length : arrB.length;
        char[] filledA = new char[maxLength];
        char[] filledB = new char[maxLength];

        char[] prefix = new char[difference];
        Arrays.fill(prefix, '0');
        if (arrA.length - arrB.length > 0) {
            filledA = arrA;
            filledB = mergeArray(prefix, arrB);
        } else {
            filledA = mergeArray(prefix, arrA);
            filledB = arrB;
        }

        System.out.println("A: " + Arrays.toString(filledA));
        System.out.println("B: " + Arrays.toString(filledB));

        char[] result = new char[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (filledA[i] == filledB[i]) {
                result[i] = '0';
            } else {
                result[i] = '1';
            }
        }

        System.out.println("\nO: " + Arrays.toString(result) + "\n");

        String resultString = new String(result);
        System.out.println("The result is: " + Integer.parseInt(resultString, 2));
    }

    public static char[] mergeArray(char[] left, char[] right) {
        int length = left.length + right.length;
        char[] data = new char[length];
        int count = 0;

        for (int i = 0; i < left.length; i++) {
            data[count] = left[i];
            count++;
        }

        for (int i = 0; i < right.length; i++) {
            data[count] = right[i];
            count++;
        }

        return data;
    }
}