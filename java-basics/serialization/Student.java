import java.io.Serializable;

public class Student implements Serializable{
	private int rollNumber;
	private String name;

	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return this.rollNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}
}