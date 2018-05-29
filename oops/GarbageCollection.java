/******************************************************************************
 *  Compilation:  javac GarbageCollection.java
 *  Execution:    java GarbageCollection
 *
 *  $java GarbageCollection
 *  Garbage collection is performed by JVM
 *  Garbage collection is performed by JVM
 *
 *  System.gc() here is used to triggle the garbage collecting. 
 *
 ******************************************************************************/

class GarbageCollection {
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collection is performed by JVM");
    }

    public static void main(String[] args) {
        // Set an object to null
        GarbageCollection garbageCollection = new GarbageCollection();
        garbageCollection = null;
        
        // Copy a reference to another
        GarbageCollection instanceOne = new GarbageCollection();
        GarbageCollection instanceTwo = new GarbageCollection();
        instanceTwo = instanceOne;

        System.gc();
    }
}