package m;

	import java.util.Scanner;

	public class CelToFare {
		public static void main(String[] args) {
			// declare scanner
			Scanner input = new Scanner(System.in);

			// prompt user to enter celsius
			System.out.print("Enter a degree in Celsius: ");
			double celsius = input.nextDouble();

			// calculate celsius to fahrenheit
			double fahrenheit = 9.0 / 5 * celsius + 32;

			// print out results
			System.out.println(celsius + " celsius is " + fahrenheit
				+ " fahrenheit"); 
		}
	}
