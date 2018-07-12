/******************************************************************************
 *  Compilation:  javac LineScanner.java
 *  Execution:    java LineScanner
 *
 *  Scanning a file to see the moving of the cursor.
 *  
 *  % java LineScanner  
 *  String: line-3
 *  Double: 2.0
 *  Int: 1
 *  
 ******************************************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LineScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("text.txt"));
        // Find the first integer number and put the file cursor on that line.
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}