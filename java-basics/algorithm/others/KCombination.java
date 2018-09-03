/******************************************************************************
 *  Compilation:  javac KCombination.java
 *  Execution:    java KCombination x y
 *
 *  Prints the K Combination of a set.
 *
 *  % java KCombination 5 3
 *  abc
 *  abd
 *  abe
 *  acd
 *  ace
 *  ade
 *  bcd
 *  bce
 *  bde
 *  cde
 *
 ******************************************************************************/
class KCombination {

    public  static void comb(String s, int k) {
        comb(s, "", k);
    }
    private static void comb(String s, String prefix, int k) {
        if (k == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < s.length(); i++) {
                comb(s.substring(i + 1), prefix + s.charAt(i), k - 1);
            }
        }
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, n);

        comb(elements, k);
        System.out.println();
    }
}