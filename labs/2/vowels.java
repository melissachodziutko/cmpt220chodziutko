import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter a letter
		System.out.print("Enter a letter to see if it is a vowel or consonant: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		//find if it is a vowel or consonant, print "invalid" if not a letter
		if (Character.isLetter(ch))
		{
			switch(Character.toUpperCase(ch))
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(ch + " is a vowel."); break;
				default : System.out.println(ch + " is a consonant."); 
			}
		}
		else
			System.out.println("invalid input");
	}
}
