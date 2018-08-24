/******************************************************************************
 *  Compilation:  javac HammingDistance.java
 *  Execution:    java HammingDistance x y
 *  
 *  Prints the hamming distance of two integer.
 *
 *  % java HammingDistance 1 4
 *  X's binary string is 001
 *  Y's binary string is 100
 *  Distance is 2
 *  
 *  % java HammingDistance 81 4
 *  X's binary string is 1010001
 *  Y's binary string is 0000100
 *  Distance is 4
 *
 ******************************************************************************/

class HammingDistance {
    public static int getHammingDistance(int x, int y) {
        int distance = 0;
        int xor = x ^ y;
        if (xor == 0){
            return distance;
        }

        while (xor != 0) {
            distance += xor & 1;
            xor = xor >> 1;
        }

        return distance;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        String binaryStringX = Integer.toBinaryString(x);
        String binaryStringY = Integer.toBinaryString(y);
        int maxLength = Math.max(binaryStringX.length(), binaryStringY.length());

        System.out.print("X's binary string is ");
        System.out.println(String.format("%" + maxLength + "s", binaryStringX).replace(' ', '0'));
        System.out.print("Y's binary string is ");
        System.out.println(String.format("%" + maxLength + "s", binaryStringY).replace(' ', '0'));
        System.out.print("Distance is ");
        System.out.println(getHammingDistance(x, y));
    }
}