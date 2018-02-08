import java.util.Scanner;

public class recips {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter an integer
		System.out.print("enter an integer to see if it is a palindrome: ");
		int number = input.nextInt();

		// print out result with a ternary format because i cant figure out how to use an if/else statement
		System.out.println(number + (palindrome(number) ? " is a palindrome" : " is not a palindrome"));
	}

	// method determines if entered integer is a palindrome
	public static boolean palindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	// method reverses the number
	public static int reverse(int number) {
		String reverse = ""; 	// temporarily holds number
		String l = number + ""; // change the number to a string
		
		//reverse string
		for (int i = l.length() - 1; i >= 0; i--) {
			reverse += l.charAt(i);
		}
		return Integer.parseInt(reverse); // return the new reversed integer
	}
}
