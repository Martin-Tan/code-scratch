/******************************************************************************
 * 
 *  This Student class is showing how to compared customized class.
 * 
 *  This class should be only used by ImplementingComparable.java
 * 
 * 
 ******************************************************************************/

class Student implements Comparable<Student> {
	private String studentName;
	private int rollNO;
	private int studentAge;

	// No void for constructor
	public Student(String studentName, int studentAge, int rollNO) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.rollNO = rollNO;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return this.studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getStudentRollNO() {
		return this.rollNO;
	}

	public void setStudentRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	/**
	* 
	* The Override annotation is NOT required, but if you use it, the method override
	* MUST be implemented.
	* 
	* If you are going to use compareTo(Student instance), 
	* not the compareTo(Object instance), current class must implement from 
	* Comparable<Student> 
	* 
	**/
	@Override
	public int compareTo(Student comparedStudent) {
		return (this.studentAge) - comparedStudent.getStudentAge();
	}
	// public int compareTo(Object comparedStudent) {
	// 	int comparedAge = ((Student)comparedStudent).getStudentAge();
	// 	return this.studentAge - comparedAge;
	// }

	@Override
	public String toString() {
		return "name = " + this.studentName + ", age = " + this.studentAge + ", rollNO = " + this.rollNO;
	}
}