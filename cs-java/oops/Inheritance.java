/******************************************************************************
 *  Compilation:  javac Inheritance.java
 *  Execution:    java Inheritance
 *  
 *  Constructor method should not have access modifer (public void);
 *  Compiler will automatically call the accessible no-args constructor in the 
 *  superclass.
 * 
 *  But, if there is super() in ANY constructor from the child class, the 
 *  default constructor from parent class will NOT be called by compiler. 
 *
 *  No matter what, there is alway a constructor from the parent class will
 *  be called.
 *   
/******************************************************************************/

class ParentClass {
    // Default constructor
    ParentClass() {
        System.out.println("Parent constractor");
    }

    ParentClass(String arg) {
        System.out.println("Parent constractor with arg " + arg);
    }
}

public class Inheritance extends ParentClass{
    Inheritance() {
        //super("\"This is arg\"");
        System.out.println("Sub class constractor");
    }

    Inheritance(String arg) {
        super("\"This is arg\"");
        System.out.println("Sub class constractor with arg " + arg);
    }

    public static void main(String[] args) {
        String arg = "\"This is arg\"";
        Inheritance inheritance = new Inheritance(arg);
    }
}