/******************************************************************************
 *  Compilation:  javac RemovingItem.java
 *  Execution:    java RemovingItem arg
 *
 *  Remove integer items from an ArrayList by index and item value.
 *
 *  % java RemovingItem 32332211110
 *  Number = 11
 *  Number = 22
 *  Number = 33
 *  Number = 44
 *  Number = 55
 *  The array list size is 5
 *  
 *  Removing two items
 *  Number = 11
 *  Number = 33
 *  Number = 44
 *  The array list size is 3
 *
 ******************************************************************************/

import java.util.ArrayList;

class RemovingItem {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(11);
        intList.add(22);
        intList.add(33);
        intList.add(44);
        intList.add(55);

        for (Integer number : intList) {
            System.out.println("Number = " + number);
        }
        System.out.println("The array list size is " + intList.size());


        System.out.println();
        System.out.println("Removing two items");
        intList.remove(1);
        // The valueOf returns an Integer object.
        intList.remove(Integer.valueOf(55));

        for (Integer number : intList) {
            System.out.println("Number = " + number);
        }
        System.out.println("The array list size is " + intList.size());
    }
}