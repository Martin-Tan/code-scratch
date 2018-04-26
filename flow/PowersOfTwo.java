/******************************************************************************
 *  Compilation:  javac PowersOfTwo.java
 *  Execution:    java PowersOfTwo n
 *  
 *  This is program takes a command-line argument n and prints a table of
 *  the powers of 2 that are less than or equal to 2^n
 * 
 *  % java PowersOfTwo 5
 *  2 to the power of 0 is 1
 *  2 to the power of 1 is 2
 *  2 to the power of 2 is 4
 *  2 to the power of 3 is 8
 *  2 to the power of 4 is 16
 *  2 to the power of 5 is 32
 *
 ******************************************************************************/

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int powersOfTwo = 1;

        int i = 0;
        while(i <= n){
            System.out.println("2 to the power of " + i + " is " + powersOfTwo);
            powersOfTwo *= 2;
            
            i += 1; 
        }
    }
}
