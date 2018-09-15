/******************************************************************************
 *  Compilation:  javac MergeSort.java
 *  Execution:    java MergeSort arg
 *
 *  An example of Merge Sort.
 *  
 *  The Time Complexity of this algorithm is O(n log(n)), 
 *  Space Complexity is O(n).
 * 
 *  Create text list
 *  java Generator 20 2 abcdefghijklmn > 20-2-string-whitelist.txt
 *
 *  % java MergeSort 20-2-string-whitelist.txt
 *  [ie, mk, ag, he, md, la, jk, bg, jn, hd, 
 *   dm, he, fh, jh, kk, ca, if, ng, gi, cj]
 *  [ag, bg, ca, cj, dm, fh, gi, hd, he, he, 
 *   ie, if, jh, jk, jn, kk, la, md, mk, ng]
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

class MergeSort {
    public static String[] loadLinesFromFile(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        BufferedReader bufferedReader =
            new BufferedReader(new FileReader(file));

        String line;
        List<String> lines = new ArrayList<String>();
        while( (line = bufferedReader.readLine()) != null ) {
            lines.add(line);
        }

        return lines.toArray(new String[0]);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Comparable[] lines = loadLinesFromFile(args[0]);
        System.out.println(Arrays.toString(lines));

        lines = mergeSort(lines);

        System.out.println(Arrays.toString(lines));
    }

    // The merge sort
    public static Comparable[] mergeSort(Comparable[] arr) {
    	// If only one, don't need to split, then return .
        if (arr.length <= 1) {
            return arr;
        }

        // Split an array to two parts.
        int mid = arr.length / 2;

        Comparable[] left = new Comparable[mid];
        Comparable[] right = new Comparable[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < arr.length - mid; i++) {
            right[i] = arr[mid + i];
        }

        // Do merge operation recursively.
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge two parts.
        return merge(left, right);
    }

    // Merge two parts of an array.
    private static Comparable[] merge(Comparable[] left, Comparable[] right) {
    	// Create a new array with the length that equals to left + right.
        Comparable[] result = new Comparable[left.length + right.length];
        int i = 0, j = 0;
        for (int k = 0; k < result.length; k++) {
            if      (i >= left.length) result[k] = right[j++];
            else if (j >= right.length) result[k] = left[i++];
            else if (left[i].compareTo(right[j]) <= 0)  result[k] = left[i++];
            else                    result[k] = right[j++];
        }

        return result;
    }
}