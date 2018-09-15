/******************************************************************************
 *  Compilation:  javac InsertionSort.java
 *  Execution:    java InsertionSort arg
 *
 *  An example of Insertion Sort.
 *  
 *  Insertion Sort is a brute-force sorting algorithm, O(n^2). Loop the list twice
 *  and always insert the minimal value to the right position at each iteration.
 *
 *  % java InsertionSort int-whitelist.txt
 *  keyword: 88
 *  [14, 15, 18, 21, 23, 45, 47, 48, 51, 55,
 *   56, 57, 66, 66, 72, 73, 77, 79, 92, 96]
 *
 ******************************************************************************/

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class InsertionSort {
    public static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++ ) {
            for (int j = i; j > 0; j --) {
            	// Put the minimum to the left.
             	if (a[j].compareTo(a[j - 1]) < 0) {
             		exchange(a, j -1, j);
             	} else {
             		break;
             	}
             } 
        }
    }

    public static String[] loadLinesFromFile(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        BufferedReader bufferedReader =
            new BufferedReader(new FileReader(file));

        String line;
        List<String> numbers = new ArrayList<String>();
        while( (line = bufferedReader.readLine()) != null ) {
            numbers.add(line);
        }

        return numbers.toArray(new String[0]);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[] numbers = loadLinesFromFile(args[0]);
        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}