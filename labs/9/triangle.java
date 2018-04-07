package hrlp;

import java.util.Scanner;

public class triangle extends GeometricObject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter in 3 numbers as three sides of a triangle");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		//declare array to triangle sides
		double[] triangle = new double[3];
		triangle[0] = side1;
		triangle[1] = side2;
		triangle[2] = side3;
		
		//print triangle, area, and perimeter
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
		System.out.println("triangle side1= " + triangle[0]);
		System.out.println("triangle side2= " + triangle[1]);
		System.out.println("triangle side3= " + triangle[2]);
		
		System.out.println("area of triangle: " + getArea(side1, side2));
		System.out.println("perimeter of triangle: " + getPerimeter(side1, side2, side3));
		
		System.out.println(toString(side1, side2, side3));
		} else {
			System.out.println("Illegal triangle");
		}
		
	}

}