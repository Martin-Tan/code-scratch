/******************************************************************************
 * 
 *  This Student class is showing how to compared customized class by using
 *  Comparator.
 * 
 *  This class should be only used by ImplementingComparable.java
 * 
 * 
 ******************************************************************************/

import java.util.Comparator;

class StudentComparator {
	private String studentName;
	private int rollNO;
	private int studentAge;

	public static Comparator<StudentComparator> studentAgeComparator = new Comparator<StudentComparator>() {
		public int compare(StudentComparator firstStudent, StudentComparator secondStudent) {
			return firstStudent.getStudentAge() - secondStudent.getStudentAge();
		}
	};

	public static Comparator<StudentComparator> studentNameComparator = new Comparator<StudentComparator>() {
		public int compare(StudentComparator firstStudent, StudentComparator secondStudent) {
			return firstStudent.getStudentName().toUpperCase()
			.compareTo(secondStudent.getStudentName().toUpperCase());
		}
	};

	// No void for constructor
	public StudentComparator(String studentName, int studentAge, int rollNO) {
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

	public String toString() {
		return "name = " + this.studentName + ", age = " + this.studentAge;
	}
}