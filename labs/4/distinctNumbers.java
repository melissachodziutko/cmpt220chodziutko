//package dcfvf;

import java.util.Scanner;

public class distinctNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] distinctNumbers = new int[10]; 
		int distincts; 				
		int totalCountOfNumbers = 0;

		// prompt the user to enter ten numbers
		System.out.print("Enter in ten numbers and this program will list off how many distinct numbers there are: ");
		for (int i = 0; i < 10; i++) {
			distincts = input.nextInt();

			// test if the numbers are distinct
			if (differentNums(distinctNumbers, distincts)) {
				distinctNumbers[totalCountOfNumbers] = distincts;
				totalCountOfNumbers++;	
			}
		}

		// display the number of distinct numbers
		System.out.println("the # of distinct numbers is " + totalCountOfNumbers);
		System.out.print("the distnct numbers are");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}

	//method determines distinctness, true if it is, false if it's a repeat
	public static boolean differentNums(int[] array, int distincts) {
		for (int i = 0; i < array.length; i++) {
			if (distincts == array[i]) 
				return false;
		}
		return true;
	}
}