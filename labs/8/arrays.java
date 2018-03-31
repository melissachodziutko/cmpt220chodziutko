import java.util.ArrayList;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// create arraylist of integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// ask user for 5 numbers
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		// sort numbers
		sort(list);

		// Display list in increasing order
		System.out.println(list.toString());
	}

	//sort method
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}


}
