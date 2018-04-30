//package pls;

import java.util.Scanner;

public class charactersinstring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ask user for string and letter
		System.out.print("enter a string and letter: ");
		String[] strng = input.nextLine().split("[ ]");

		// # of times letter is in string
		System.out.println(strng[1] + " occurs " + count(strng[0], strng[1].charAt(0)) + " times");
	}

	//counts number of times letter shows up in string
	public static int count(String strng, char a) {
		return count(strng, a, strng.length() - 1);
	}

	//RHM
	private static int count(String strng, char x, int high) {
		if (high < 0) {			
			return 0;
		}
		else if (strng.charAt(high) ==  x) {
			return 1 + count(strng, x, high - 1); 
		}
		else {
			return count(strng, x, high - 1); 
		}
	}
}