//package hrlp;
//this entire code is a mess but i tried
public class circle {
	public static void main(String[] args) {
		// declare 3 circles
		Circle circle1 = new Circle(5, "red", true);
		Circle circle2 = new Circle(5, "green", false);
		Circle circle3 = new Circle(4, "green", false);

		// print results
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		System.out.println("Circle1 is " + (circle1.equals(circle2))); // JA

		System.out.println("Circle1 is " + (circle1.equals(circle3))); // JA
	}
}