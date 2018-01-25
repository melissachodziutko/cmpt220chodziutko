package m;

import java.util.Scanner;

public class MinutesToYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter the number of minutes
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		// calculate input to years and days
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		// print days/years
		System.out.println(minutes + " minutes is around " + years
			+ " years and " + days + " days");
	}
}
