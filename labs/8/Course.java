import java.util.ArrayList;

public class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	int max = 100;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
		}
	
	//locate student
	private int locateStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
	
	//then drop student
	public void dropStudent(String student) {
		int index = locateStudent(student);
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in this course");
		}
	}

	//delete student
	private void dropStudent(int index) {
		String[] a = new String[students.length - 1];
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			if (i == index) {
				j++;
			}
			a[i] = students[j];
		}
		this.students = a;
		numberOfStudents--;
	}

	//remove students
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}
}