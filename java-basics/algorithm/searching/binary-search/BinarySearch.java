/******************************************************************************
 *  Compilation:  javac BinarySearch.java
 *  Execution:    java BinarySearch args
 *
 *  Finding values from a list by using Binary Search.
 *
 *  % java java BinarySearch whiteList.txt < values.txt
 *  Sorted white list: [12, 34, 56, 77, 88, 90, 103, 182, 200, 392]
 *  Can't find value: 1
 ******************************************************************************/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;

public class BinarySearch {
    public static void main(String[] args) throws FileNotFoundException {
        int[] whiteList = readAllInts(args[0]);
        Arrays.sort(whiteList);

        System.out.println("Sorted white list: " + Arrays.toString(whiteList));

        // Read integers from command line.
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            // Read key, print if not in whiteList.
            int key = scanner.nextInt();
            if (!rank(key, whiteList)) {
                System.out.println("Can't find value: " + key);
            }
        }
    }

    public static boolean rank(int element, int[] list) {
        int left = 0;
        int right = list.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (element < list[mid]) {
                right = mid - 1;
            } else if(element > list[mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    // Read all integers from a text file.
    protected static int[] readAllInts(String fileName) throws FileNotFoundException {
        if (fileName == null) throw new IllegalArgumentException("argument is null");
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(new BufferedInputStream(fileInputStream), "UTF-8");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}