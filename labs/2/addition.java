import java.util.Scanner;

public class addition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// generate three random numbers 
		int numberOne = (int)(Math.random() * 10);
		int numberTwo = (int)(Math.random() * 10);
		int numberThree = (int)(Math.random() * 10);

		// prompt user to enter the sum of the numbers
		System.out.print(
			"what is " + numberOne + " + " + numberTwo + " + " + numberThree + "? ");
		int answer = input.nextInt();
		
		System.out.println(numberOne + " + " + numberTwo + " + " + numberThree + " = " + answer + " is " +
			(numberOne + numberTwo + numberThree == answer));
	}
}