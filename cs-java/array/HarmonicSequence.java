/******************************************************************************
 *  Compilation:  javac HarmonicSequence.java
 *  Execution:    java HarmonicSequence n
 *  
 *  This is program takes a command-line argument n and prints a table of
 *  the the harmonic sequence of n.
 * 
 *  % java HarmonicSequence 5
 *  1
 *  1 + 1/2
 *  1 + 1/2 + 1/3
 *  1 + 1/2 + 1/3 + 1/4
 *  1 + 1/2 + 1/3 + 1/4 + 1/5
 *
 ******************************************************************************/

public class HarmonicSequence {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] harmonic = new String [n];
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                harmonic[0] = "1";
            } else {
                harmonic[i] = harmonic[i - 1] + " + 1/" + Integer.toString(i + 1); 
            }

            System.out.println(harmonic[i]);
        }
    }
}