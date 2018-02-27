import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in the three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
				
		System.out.println((isValid(side1, side2, side3) ? area(side1, side2, side3) : " invalid inputs"));
	}
	
	
	//check if each side is bigger than the other
	public static boolean isValid(double side1, double side2, double side3) {
		boolean isValid = (side1 + side2 > side3) &&
						(side2 + side3 > side1) &&
						(side1 + side3 > side2); 
		return isValid;
				
	}
	
	//calculate area if isValid returns true
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2; // JA
		double area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
		return area;
	}
}
