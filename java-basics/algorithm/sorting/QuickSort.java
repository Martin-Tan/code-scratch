/******************************************************************************
 *  Compilation:  javac QuickSort.java
 *  Execution:    java QuickSort arg
 *
 *  Print a string with sorted order.
 *
 *  % java QuickSort 32332211110
 *  Sorted string: 01111222333
 *
 *  % java BubbleSort 321CBAcba
 *  Sorted string: 123ABCabc
 *
 ******************************************************************************/

public class QuickSort {
    public static void main(String[] args) {
        char[] charArr = args[0].toCharArray();
        quickSort(charArr, 0, charArr.length - 1);

        System.out.print("Sorted string: ");
        System.out.println(new String(charArr));
    }

    public static void quickSort(char[] arr, int start, int end) {
        // Step 1, partition;
        int index = partition(arr, start, end);

        // Step 2, processing the left part.
        if (start < index - 1) {
            quickSort(arr, start, index - 1);
        }

        // Step3, processing the right part.
        if (index < end) {
            quickSort(arr, index, end);
        }
    }

    public static int partition(char[] arr, int start, int end) {
        // Pick a pivot point.
        int pivot = arr[(start + end) / 2];

        // Go through the whole array.
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            // maybe the start is greater than end.
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    public static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}