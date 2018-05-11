/******************************************************************************
 *  Compilation:  javac ConstructorDefaultValue.java
 *  Execution:    java ConstructorDefaultValue
 *  
 *  Set constructor with default value.
 * 
 *  % java ConstructorDefaultValue
 *  The value of a is "This is a default string."
 *
 *
 ******************************************************************************/

class ConstructorDefaultValue {
    // Contructor with default arg value.
    public ConstructorDefaultValue() {
        this("This is a default string.");
    }

    public ConstructorDefaultValue(String a) {
        System.out.println("The value of a is \"" + a + "\"");
    }
    
    public static void main(String[] args) {
        ConstructorDefaultValue constructor = new ConstructorDefaultValue();
    }
}