
public class circle {
	/** Main method */
	public static void main(String[] args) {
		// Create a circle2d object
		circle2d c1 = new circle2d(2, 2, 5.5);

		// Display results
		System.out.println("circle1 area: " + c1.area()); 
		System.out.println("circle1 perimeter: " + c1.perimeter()); 
		System.out.println(
			"Does circle1 contain the point (3, 3)? " + c1.contains(3, 3)); 
		System.out.println(
			"Does circle1 contain the circle at 4 5 and radius 10.5" 
			+ c1.contains(new circle2d(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap the circle at 3 5 and radius 2.3" 
			+ c1.overlaps(new circle2d(3, 5, 2.3)));
	}
}