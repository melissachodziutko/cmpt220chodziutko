package hrlp;

public class Triangle extends GeometricObject {

	public static void main(String[] args) {
		double side1 = 1.0;
		double side2 = 1.0;
		double side3 = 1.0;
		
		double[] triangle = new double[3];
		triangle[0] = side1;
		triangle[1] = side2;
		triangle[2] = side3;
		
		System.out.println("triangle side1= " + triangle[0]);
		System.out.println("triangle side2= " + triangle[1]);
		System.out.println("triangle side3= " + triangle[2]);
		
		System.out.println("area of triangle: " + getArea(side1, side2));
		System.out.println("perimeter of triangle: " + getPerimeter(side1, side2, side3));
		
		System.out.println(toString(side1, side2, side3));
		
	}

}
