
import java.util.Scanner;

public class unicode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter a character
		System.out.print("Enter a character to translate into Unicode: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		// display unicode of character
		System.out.println("The Unicode of " + (s) + " is " + (int)ch);
	}
}