package pls;

import java.util.Random;
import java.util.Scanner;

public class win {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void win1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Congratulations! We got it past the House!");
		System.out.println("Now we're gonna send it over to the Senate and see if they vote on it. \nHow are you feeling, representative?");
		//fake variable to feel like the game is talking back to you
		String fake = input.nextLine();
		System.out.println("Great! me too. Let's wait for the Senate's vote.");
		
		//for loop to 'wait for senate vote'
		for(int i = 0; i < 3; i++) {
			System.out.println("");
		}
		
		//another random variable to determine if senate voted yes
		Random rand = new Random();

		int  n = rand.nextInt(100) + 10;
		// if/else depending on what the variable was 
		if (n < 75) {
			System.out.println("Oh no! You only got " + n + " votes! This means our bill isn't going to pass. \nThe bill is therefore 'killed' and will not be moved onto the President.\nThis is the end of I'm Just a Bill, thanks for playing!.");
		} else {
			//'moves to the president' if the variable comes out higher than 75
			System.out.println("We got " + n + " votes! Nice! That means we're moving onto the President for signing!");
			System.out.println("Now we just have to wait for his vote...");
			
			//random for president's vote
			Random rand1 = new Random();

			int  no = rand1.nextInt(100) + 1;
			if (no > 50) {
				System.out.println("Wow! The president signed our bill into law! \nCongratulations, Representative! \nThis is the end of 'I'm Just a Bill.' Thanks for playing!");
			} else {
				System.out.println("Oh no! The President decided to veto your bill, meaning that it won't become a law.\nThis is the end of 'I'm Just a Bill.' Thanks for playing!");
			}
	}
	
	}
}
