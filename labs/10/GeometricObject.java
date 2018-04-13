package hrlp;


public class GeometricObject {

	//method to calculate area
	public static double getArea(double a, double b) {
		double area = (a*b)/2;
		return area;
	}

	//method to calculate perimeter
	public static double getPerimeter(double a, double b, double c) {
		double perimeter = a + b + c;
		return perimeter;
	}
	
	//method to change numbers to string
	public static String toString(double a, double b, double c) {
		String numberAsString1 = Double.toString(a);
		String numberAsString2 = Double.toString(b);
		String numberAsString3 = Double.toString(c);
		return "Triangle: side1 =" + numberAsString1 + " side2 =" + numberAsString2 + " side 3=" + numberAsString3;
	}
	
	
}