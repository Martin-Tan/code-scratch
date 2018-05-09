/******************************************************************************
 *  Compilation:  javac Transition.java
 *  Execution:    java Transition < input.txt
 *  Dependencies:  stdlib.jar
 *
 *  Prints the transition matrix.
 *
 *  % java Transition < tiny.txt
 *  5 5
 *  0.02000 0.92000 0.02000 0.02000 0.02000 
 *  0.02000 0.02000 0.38000 0.38000 0.20000 
 *  0.02000 0.02000 0.02000 0.92000 0.02000 
 *  0.92000 0.02000 0.02000 0.02000 0.02000 
 *  0.47000 0.02000 0.47000 0.02000 0.02000
 *
 ******************************************************************************/

public class Transition {
    public static void main(String[] args) {
        // Get page number
        int n = StdIn.readInt();
        int[][] links = new int[n][n];
        int[] outDegree = new int[n];

        // Accumulate link counts.
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            int j = StdIn.readInt();

            links[i][j]++;
            outDegree[i]++;
        }

        // Print matrix size.
        StdOut.println(n + " " + n); 

        // Print probability distribution for row i. 
        for (int i = 0; i < n; i++)  {

            // Print probability for column j. 
            for (int j = 0; j < n; j++) {
                double p = 0.90*links[i][j]/outDegree[i] + 0.10/n; 
                StdOut.printf("%7.5f ", p); 
            } 
            StdOut.println(); 
        } 

    }
}