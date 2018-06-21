/******************************************************************************
 *
 *  Includes a jar package and print the sum of your input args.
 *
 *  Relative path in current directory
 *  Compilation:  javac -cp ".:stdlib.jar" IncludingJar.java
 *  Execution:    java -cp .:stdlib.jar IncludingJar n
 *
 *  Absolute path in external path.
 *  Compilation:  javac -cp ".:/path/to/stdlib.jar" IncludingJar.java
 *  Execution:    java -cp ".:/path/to/stdlib.jar" IncludingJar n
 *
 *  % java java -cp .:stdlib.jar IncludingJar 2
 *  1
 *  2
 *  Sum is 3
 ******************************************************************************/

public class IncludingJar { 
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = StdIn.readInt();
            sum = sum + value;
        }
        StdOut.println("Sum is " + sum);
    }
}
