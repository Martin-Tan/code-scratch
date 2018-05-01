/******************************************************************************
 *  Compilation:  javac RandomSeq.java
 *  Execution:    java RandomSeq n
 *  
 *  Prints n random real numbers between 0 and 1.
 * 
 *  % java RandomSeq 2
 *  0.026664120663851265
 *  0.21015018966856236
 *
 *  % java RandomSeq 4
 *  0.07038644396422766
 *  0.2967712568945936
 *  0.6779351449791376
 *  0.6652428436210117
 *
 ******************************************************************************/

public class RandomSeq {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
    }
}