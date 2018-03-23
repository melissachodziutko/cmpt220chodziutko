
public class testcourse {

	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("abs");
		course1.addStudent("abc");
		course1.addStudent("bcd");
		
		course2.addStudent("cde");
		course2.addStudent("def");
		
		course1.dropStudent("abs");
		
		System.out.println("number of students in course1: " + course1.getNumberOfStudents());
		String [] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + ", ");
		}
		System.out.println();
		System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
		
		
	}

}
