import java.util.Scanner;

public class days {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt user for todays day
		System.out.print("Enter today’s day in numbers (like sunday = 0, monday = 1) : ");
		int day = input.nextInt();

		// prompt the user to enter the number of days elapsed
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();

		// calculate future day
		int future = (day + elapsed) % 7;

		System.out.print("Today is ");
		switch (day)
		{
			case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Saturday");
		}

		System.out.print(" and the future day is ");
		switch (future)
		{
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday");
		}
	}
}