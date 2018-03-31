import java.util.ArrayList;

public class testcourse {

	public static void main(String[] args) {
		ArrayList<String> course1 = new ArrayList<String>();
		ArrayList<String> course2 = new ArrayList<String>();
		
		Course course = new Course("Data Structures");
		Course coursetwo = new Course("Database Systems");
		course1.add("abs");
		course1.add("abc");
		course1.add("bcd");
		
		course2.add("cde");
		course2.add("def");
		
		course1.remove("abs");
		
		System.out.println("number of students in course1: " + course1.size());
		System.out.println(course1.toString());
		System.out.println("Number of students in course2: " + course2.size());
		System.out.println(course2.toString());
		
	}

}