import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for list
		System.out.print("enter in the amount of numbers that will be in the list: ");
		int number = input.nextInt();

		// Prompt the user to enter in a list
		System.out.print("Enter in " + number + " numbers to the list: ");
		int[] array = new int[input.nextInt()];
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();

		// Displays whether the list is sorted or not.
		System.out.println("this list is " + (isSorted(array) ? "already " : "not ") + "sorted");

	}
	public static boolean isSorted(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[i + 1])
				return false;
		}
		return true;
	}

}
