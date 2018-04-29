/******************************************************************************
 *  Compilation:  javac InversePermutation.java
 *  Execution:    java InversePermutation n
 *  
 *  Read in a permutation from the command line and print out the inverse
 *  permutation.
 * 
 *  % java InversePermutation 5 0 2 3 1 4
 *  [1, 4, 2, 3, 5, 0]
 *  
 *  % java InversePermutation 0 2
 *  Exception in thread "main" java.lang.RuntimeException: Input is not a permutation.
 *  at InversePermutation.main(InversePermutation.java:30)
 *
 ******************************************************************************/

import java.util.Arrays; 

public class InversePermutation {
    public static void main(String[] args) {
        int n = args.length;
        int[] inputArray = new int[n];

        // Read the permutation.
        for (int i = 0; i < n; i++) {
            inputArray[i] = Integer.parseInt(args[i]);
        }

        // Validate whether there are duplicated values.
        boolean[] exists = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (inputArray[i] < 0 || inputArray[i] >= n || exists[inputArray[i]]) {
                throw new RuntimeException("Input is not a permutation.");
            }

            exists[inputArray[i]] = true;
        }

        int[] flippedInputArray = new int[n];

        for (int i = 0; i < n; i++) {
            flippedInputArray[inputArray[i]] = i;
        }

        System.out.println(Arrays.toString(flippedInputArray));
    }
}