package pls;
//I know i have an endless loop somewhere in here but this is pretty dang close idk how to fix it

//I also commented what everything was supposed to do in case you have a solution
import java.util.Scanner;

public class numberOfOccurances {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt use for string
		System.out.print("Enter a string of characters: ");
		String s = input.nextLine();
		char[] strng = new char[s.length() - 1];
		for (int i = 0; i < strng.length; i++)
			strng[i] = s.charAt(i);
		char ch = s.charAt(s.length() - 1);

		// print # of timrs in list
		System.out.println(ch + "occurs " 
			+ count(strng, ch) + " times in the list ");
	}

	//counts how many of a character are in the array
	public static int count(char[] strng, char x) {
		return count(strng, x, strng.length - 1);
	}

	//RHM
	public static int count(char[] strng, char x, int high) {
		if (high < 0) {
			return 0;
		} else if (strng[high] == x) {
			return 1 + count(strng, x, high - 1); 
		} else {
			return count(strng, x, high - 1); 
		}
	}
}