/******************************************************************************
 *  Compilation:  javac Generator.java
 *  Execution:    java Generator
 *
 *  Generate random strings.
 *
 *
 *  % java Generator 10 3 abc
 *
 *  bba
 *  bcb
 *  cbb
 *  cba
 *  aba
 *  bac
 *  bbc
 *  abc
 *  bca
 *  aba
 ******************************************************************************/
import java.util.Random;

class Generator {
    public static String randomString(int length, String alpha) {
        char[] charArr = new char[length];

        // long seed = System.currentTimeMillis();
        // Random random = new Random(seed);
        // random.nextInt(strLength);
        int strLength = alpha.length();

        // Create random chars.
        for (int i = 0; i < length; i++) {
            charArr[i] = alpha.charAt((int)(Math.random() * strLength));
        }

        return new String(charArr);
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);
        String alpha = "abcdefghijklmnoplmnopqrstuvwxyz";

        if (args.length == 3) {
            alpha = args[2];
        }
        for (int i = 0; i < number; i++) System.out.println(randomString(length, alpha));
    }
}