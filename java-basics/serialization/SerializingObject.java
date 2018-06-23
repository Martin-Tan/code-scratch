/******************************************************************************
 *  Compilation:  javac SerializingObject.java
 *  Execution:    java SerializingObject
 *
 *  Serializing an Object and saving it to a file. 
 *	
 *  % java SerializingObject  
 *  Serialization done.
 *  
 ******************************************************************************/

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class SerializingObject {
	public static void main(String[] args) {
		Student studentObj = new Student(1, "Meghan Trainer");

		try{
			FileOutputStream fileOutputStream = new FileOutputStream("/tmp/student");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(studentObj);

			objectOutputStream.close();
			fileOutputStream.close();

			System.out.println("Serialization done.");
		}catch(IOException exception) {
			System.out.println(exception.getMessage());
		}
	}
}