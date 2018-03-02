
import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//variables for sides of rectangles
		double rec1w = 4;
		double rec1h = 40;
		double rec2w = 3.5;
		double rec2h = 35.9;
		
		
		//print calculations
		System.out.println("Rectangle 1: ");
		System.out.println("Area: " + area(rec1w, rec1h));
		System.out.println("Perimeter: " + perimeter(rec1w, rec1h));
		
		System.out.println("%nRectangle 2: ");
		System.out.println("Area: " + area(rec2w, rec2h));
		System.out.println("Perimeter: " + perimeter(rec2w, rec2h));
		
	}
	
	//methods to do calculations
	public static double area(double x, double y) {
		double calculation = x * y;
		return calculation;
	}
	public static double perimeter(double x, double y) {
		double calculation = x + x + y + y;
		return calculation;
	}

}
