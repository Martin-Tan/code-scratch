/******************************************************************************
 *  Compilation:  javac NestedClass.java
 *  Execution:    java NestedClass
 *
 *  Tips:
 *  . static-inner-class can only have static properties and functions.
 *  . static-inner-class can only access static properties from its enclosing class.
 *  . inner-class can have static and no-static properties and functions.
 *  . inner-class can access static and no-static properties from its enclosing class.
 *  . Properties in nested classes is inheritance.
 *  
 ******************************************************************************/
class NestedClass {
    public String pubStr = "Public property";
    protected String proStr = "Protected property";
    private String priStr = "Private property";
    public static String staticPubStr = "Static public property";
    protected static String staticProbStr = "Static protected property";
    private static String staticPriStr = "Static private property";

    class InnerClass {
        protected String proStr = "Protected property in an inner class";
        
        public class depthInnerClass {
            protected String priStr = "Private property in an depth-inner-class";
            public void showProperties(){
                System.out.println("Access properties from an depth-inner-class function");
                System.out.println(priStr);
                System.out.println(proStr);
                System.out.println(staticPriStr);
                System.out.println();
            }
        }

        // Illegal static declaration in inner class, since this inner class must instantiated before accessing.
        // public static String staticPubStr = "Static public property in an inner class";
        public void showProperties(){
            System.out.println("Access properties from an inner-class function");
            System.out.println(priStr);
            // Cannot access no-static property referenced from a static context.
            //System.out.println(NestedClass.proStr);
            System.out.println(proStr);
            System.out.println(staticPriStr);
            System.out.println();
        }
    }

    protected static class StaticClass {
        protected static String staticProbStr = "Static protected property";
        private static String staticPriStr = "Static private property";

        public static void showProperties(){
            System.out.println("Access properties from a static function in a static-nested-class");
            //// Cannot access no-static property referenced from a static context.
            //System.out.println(priStr);
            System.out.println(staticPriStr);
            System.out.println();
        }
    }

    public void accessInsideClassProperties() {
            System.out.println("Access properties from a no-static function inside the enclosing class");
            //// Cannot access no-static property referenced from a static context.
            StaticClass.showProperties();
            System.out.println();
    }

    public static void staticFunction() {
        System.out.println("Only static properties can be accessed from a static function in the same class ");
        System.out.println(staticPubStr);
        System.out.println(staticProbStr);
        System.out.println(staticPriStr);
        System.out.println();
    }
}

class NestedClassScop {
    public static void outter() {
        System.out.println("Access properties out of a netsed class");
        System.out.println(NestedClass.staticPubStr);
        System.out.println();

        NestedClass nestedClass= new NestedClass();
        nestedClass.staticFunction();

        // Make an instance of an inner-class from outside.
        NestedClass.InnerClass innerClass = nestedClass.new InnerClass();
        innerClass.showProperties();

        nestedClass.accessInsideClassProperties();

        // Make an instance of a static-inner-class from outside.
        NestedClass.StaticClass.showProperties();

        // Access depth class
        NestedClass.InnerClass.depthInnerClass depthInnerClass = innerClass.new depthInnerClass();
        depthInnerClass.showProperties();

    }

    public static void main(String[] args) {
        // Access static function
        NestedClass.staticFunction();

        outter();
    }
}