import java.util.Scanner;

public class MyInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in a number: ");
		double number = input.nextDouble();
		
		System.out.println("The number you entered is: " + MyIntegerTwo.storage(number));
		
		System.out.println("Is it even?: " + MyIntegerTwo.isEven(number));
		
		System.out.println("Is it odd?: " + MyIntegerTwo.isOdd(number));
		
		System.out.println("Is it prime?: " + MyIntegerTwo.isPrime(number));
		
		
	}

}
