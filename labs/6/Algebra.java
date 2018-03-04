import java.util.Scanner;

public class Algebra {


	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				//prompt user for input and assign input to variables
		System.out.println("enter in a, b, c, d, e, and f");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
	
	
		LinearEquation le = new LinearEquation();
		//print equation
		System.out.println(le.getY(e, d, b, f, a, c));
		System.out.println(le.getX(e, d, b, f, a, c));

	}

}
