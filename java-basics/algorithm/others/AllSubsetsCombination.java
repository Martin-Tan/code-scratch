/******************************************************************************
 *  Compilation:  javac AllSubsetsCombination.java
 *  Execution:    java AllSubsetsCombination x
 *
 *  Prints the all combinations of a set.
 *
 *  % java AllSubsetsCombination 3
 *  
 *  a
 *  ab
 *  abc
 *  ac
 *  b
 *  bc
 *  c
 *
 ******************************************************************************/
class AllSubsetsCombination {

    public static void comb(String s) {
        comb("", s);
    }
    private static void comb(String prefix, String s) {
        System.out.println(prefix);
        for (int i = 0; i < s.length(); i++) {
            comb(prefix + s.charAt(i), s.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, n);

        comb(elements);
        System.out.println();
    }
}