//its not printing smallest to largest but its a good attempt 

import java.util.Scanner;

public class ex105 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		int number = input.nextInt();

		// print out smallest integers from smallest to largest
		System.out.print("The smallest factors of " + number + " are: ");
		stackOfIntegers integers = new stackOfIntegers();

		smallestFactors(number, integers);

		while (!integers.empty()) {
			System.out.print(integers.removetop() + " ");
		}
		System.out.println();
	}

	//locate smallest and put them into stackofintegers
	public static void smallestFactors(int number, stackOfIntegers integers) {
		int i = 2; 
		while (number / i != 1){ 
			if (number % i == 0) {
				integers.smallest(i);
				number /= i;
			}
			else
				i++;
		}
		integers.smallest(number);
	}
}