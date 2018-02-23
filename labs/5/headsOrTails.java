import java.util.Scanner;

public class headsOrTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for number
		System.out.print("Enter in a number from 0 to 511: ");
		int number = input.nextInt();
		
		//print out binary
		System.out.print(binary(number));
	}
	
	//method to convert to binary
	public static String binary(int n) {
		 if (n == 0) {
	           return "0";
	       }
	       String binary = "";
	       while (n > 0) {
	           int rem = n % 2;
	           binary = rem + binary;
	           n = n / 2;
	          
	       }
	       return binary;
	   }
	}
	//i know this isn't 100% what was asked but i tried my best i dont know how to convert the numbers to H or T :)

