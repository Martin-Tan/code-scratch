/******************************************************************************
 *  Compilation:  javac BinarySearch.java
 *  Execution:    java BinarySearch args
 *
 *  Print the processing of Binary Search.
 *  Generate whitelist by running 
 *  % java Generator 20 2 123456789 > int-whitelist.txt.
 *
 *  % java BinarySearch int-whitelist.txt 88
 *  keyword: 88
 *  [14, 19, 21, 24, 37, 38, 38, 39, 44, 44, 
 *   51, 53, 62, 65, 72, 73, 74, 76, 84, 88]
 *  [51, 53, 62, 65, 72, 73, 74, 76, 84, 88]
 *  [73, 74, 76, 84, 88]
 *  [84, 88]
 *  [88]
 *  Found it.
 *
 ******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class BinarySearch {
    public static int rank(int keyword, int[] arr) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while(lowIndex <= highIndex) {
            // Print out log.
            // End index can be greater than or equal to length of original array
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr, lowIndex, highIndex + 1)));

            int mid = lowIndex + (highIndex - lowIndex) / 2 ;

            if (keyword < arr[mid]) {
                highIndex = mid - 1;
            } else if (keyword > arr[mid]) {
                lowIndex = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int[] readInts(String filename) throws FileNotFoundException, IOException {
        List<Integer> arrList = new ArrayList<Integer>();

        File file = new File(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        while( (line = bufferedReader.readLine()) != null) {
            arrList.add(Integer.valueOf(line));
        }

        return arrList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String whiteListFilename = args[0];
        int keyword = Integer.parseInt(args[1]);
        int[] whiteListArr = readInts(whiteListFilename);
        System.out.println("keyword: " + keyword);

        Arrays.sort(whiteListArr);

        if (rank(keyword, whiteListArr) >= 0) {
            System.out.println("Found it.");
        } else {
            System.out.println("Not exist.");
        }

    }
}