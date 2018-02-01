import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Generate a random integer 0, 1, or 2
		int computer = (int)(Math.random() * 3);

		// prompt the user to enter a number 0, 1, or 2
		System.out.print("Welcome to Rock, Paper, and Scissors! Enter in a number to choose: rock (0), paper (1), scissors (2): ");
		int user = input.nextInt();

		System.out.print("The computer is ");
		switch (computer)
		{
			case 0: System.out.print("rock."); break;
			case 1: System.out.print("paper."); break;
			case 2: System.out.print("scissors.");
		}

		System.out.print(" You are ");
		switch (user)
		{
			case 0: System.out.print("rock"); break;
			case 1: System.out.print("paper"); break;
			case 2: System.out.print("scissors");
		}

		// print result
		if (computer == user)
			System.out.println(" too. It is a draw");
		else
		{
			boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
			if (win)
				System.out.println(". You win!");
			else
				System.out.println(". You lose :(");
		}
	}
}
