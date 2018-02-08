
import java.util.Scanner;

public class factorsOfIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("enter an integer to find its factors: ");
		int number = input.nextInt();
		int factoral = 2; 

		// find and print all the factors of the number in increasing order
		System.out.print("the factors in ascending order are: ");
		while (number / factoral != 1) {
			if (number % factoral  == 0) {
				System.out.print(factoral + ", ");
				number /= factoral; 
			}
			//otherwise add to the count until finished
			else
				factoral++;
		}
		System.out.println(number + ".");
	}
}
