/******************************************************************************
 *  Compilation:  javac Calculator.java
 *  Execution:    java Calculator
 *
 *  Lambda expressions as functional interfaces.
 *  
 *  % java Calculator  
 *  40 + 2 = 42
 *  20 - 10 = 10
 *  10 - 20 = -10
 *  
 ******************************************************************************/

public class Calculator {
    interface IntegerMath {
        // Only one abstract method is allowed.
        int operation(int a, int b);

        // One ore more default or static methods are allowed.
        default IntegerMath swap() {
          return (a, b) -> operation(b, a);
        }
    }
    
    private static int apply(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " + apply(40, 2, addition));
        System.out.println("20 - 10 = " + apply(20, 10, subtraction));
        System.out.println("10 - 20 = " + apply(20, 10, subtraction.swap()));    
    }
}
