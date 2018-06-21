/******************************************************************************
 *  Compilation:  javac ConstructorDefaultValue.java
 *  Execution:    java ConstructorDefaultValue
 *  
 *  Calls the constructor in parent class.
 * 
 *  % java Constructor
 *  Parent constructor.
 *  Child constructor.
 *  Count in parent class is 1
 *  Count in child class is 1
 *
 ******************************************************************************/

class ParentClass {
    protected int count;

    public ParentClass() {
        count = 1;
        System.out.println("Parent constructor.");
    }
}

class Constructor extends ParentClass {
    public Constructor() {
        // Constructors can not be inherited.
        super();
        System.out.println("Child constructor.");
        System.out.println("Count in parent class is " + super.count);
        System.out.println("Count in child class is " + this.count);
    }

    public static void main(String[] args) {
        new Constructor();
    }
}