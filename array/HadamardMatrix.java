/******************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix
 *  
 *  Prints a Hadamard matrix of n. Assumes n is a power of 2.
 * 
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *  % java HadamardMatrix 8
 *  T T T T T T T T
 *  T F T F T F T F
 *  T T F F T T F F
 *  T F F T T F F T
 *  T T T T F F F F
 *  T F T F F T F T
 *  T T F F F F T T
 *  T F F T F T T F
 *
 ******************************************************************************/

import java.util.Arrays;

public class HadamardMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean [][] matrix = new boolean[n][n];

        // Set the initial value of the matrix;
        matrix[0][0] = true;

        // [i+k][j+k], expand the x and y to 2*k.
        for (int k = 1; k < n; k += k) {
            // Traverse the existing matrix.
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    matrix[i+k][j]   =  matrix[i][j];
                    matrix[i][j+k]   =  matrix[i][j];
                    matrix[i+k][j+k] = !matrix[i][j];
                }
            }
        }

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] ? "T " : "F ");
            }
            System.out.println();
        }
    }
}
