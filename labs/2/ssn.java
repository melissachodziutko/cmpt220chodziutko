import java.util.Scanner;

public class ssn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for social security number
		System.out.print("Enter in a social security number to see if it is valid (should be in a xxx-xx-xxxx format): ");
		String ssn = input.nextLine();
		
		//create boolean to test validity
		boolean valid =
				((ssn.length()) == 11) &&
				(Character.isDigit(ssn.charAt(0))) &&
				(Character.isDigit(ssn.charAt(1))) &&
				(Character.isDigit(ssn.charAt(2))) &&
				(ssn.charAt(3) == '-') &&
				(Character.isDigit(ssn.charAt(4))) &&
				(Character.isDigit(ssn.charAt(5))) &&
				(ssn.charAt(6) == '-') &&
				(Character.isDigit(ssn.charAt(7))) &&
				(Character.isDigit(ssn.charAt(8))) &&
				(Character.isDigit(ssn.charAt(9))) &&
				(Character.isDigit(ssn.charAt(10)));
				
			System.out.print("This SSN is " + valid);

	}

}
