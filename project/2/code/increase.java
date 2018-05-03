
import java.util.Scanner;
import java.util.Random;

public class increase {

	public static void option1() {
		Scanner input = new Scanner(System.in);
		//int for the loops later
		int i = 0;
		
		//print out more instructions of game
		System.out.println("Fantastic! I'll write this all up for you.");
		System.out.println("Your bill was granted floor time. \nYou have been asked to talk on behalf of your bill. \nWhat would you like to say? \n(There are no wrong responses, but you only get this one chance to impress your fellow House members!)");
		//fake variable to give illusion like game is talking to you
		String fake = input.nextLine();
		
		//continue game
		System.out.println("It seems like your fellow House representatives were impressed!\nBut can we get at least 2/3 of them to vote yes?");
		//for loop to print blank lines as if the game was waiting for the votes
		for (i = 0; i < 3; i++){
		System.out.println("");
	}
		//more for loop to 'wait for votes'
		System.out.println("The votes are coming in...");
		for (i = 0; i < 8; i++){
		System.out.println("");
	}
		
		
		//random variable to determine how many votes the bill got
		Random rando = new Random();

		int  nu = rando.nextInt(435) + 50;
		
		//nu stores the random number determined, if/else depending on how many votes
		if (nu < 327) {
			System.out.println("Oh no! We only got " + nu + " votes!");
			lose.lose1();
		} else {
			System.out.println("Wow! We got " + nu+ " votes!");
			win.win1();
		}
		
	}
	
}
