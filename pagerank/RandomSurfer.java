/******************************************************************************
 *  Compilation:  javac RandomSurfer.java
 *  Execution:    java RandomSurfer trials
 *  Dependencies:  stdlib.jar
 *
 *  % java Transition < tiny.txt | java RandomSurfer 1000000
 *   0.27309 0.26586 0.14616 0.24722 0.06767
 *   
 *  % java Transition < tiny.txt | java RandomSurfer 1000000
 *   0.27336 0.26602 0.14600 0.24706 0.06757
 *
 ******************************************************************************/

public class RandomSurfer {
    public static void main(String[] args) {
        // number of moves
        int trials = Integer.parseInt(args[0]);

        // Transition matrix: p[i][j] = prob. that surfer moves from page i to 
        double[][] p = StdArrayIO.readDouble2D();

        // dimension of the transition matrix
        int n = p.length;

        // freq[i] = # times surfer hits page i
        int[] freq = new int[n];
 
        // simulate the random surfer, starting at a random state
        int state = StdRandom.uniform(n);
        for (int t = 0; t < trials; t++) {
            // The larger the probability is, the higher value of freq will be.
            // the discrete function depens on the value of the list, 0.02 < 0.1 < 0.5 < 1. (0 -- 1).
            state = StdRandom.discrete(p[state]);
            freq[state]++;
        }

        // Print page ranks. 
        for (int i = 0; i < n; i++) {
            StdOut.printf("%8.5f", (double) freq[i] / trials); 
        }
        StdOut.println(); 
    }
}