package pls;

import java.util.Scanner;

public class politics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Political Systems! What's your name?");
		//stores name in this variable
		String temp = input.nextLine();
		
		//print out instructions of game
		System.out.println("Welcome " + temp + "! Let's learn how a bill becomes a law.\n");
		System.out.println("For the purposes of this game, we will be starting in the House of Representatives.\nYou can still learn about the Senate in the 'what is the difference' option.");
		System.out.println("[To respond to a question, type back exactly one of the options given in the parentheses. \nUnfortuantely, wrong responses will not be accepted and break this game.]");
		System.out.println("Start the game by responding with 'house' or learn more with 'what is the difference'.");
		System.out.println("(House, What is the difference)");
		//opt1 stores response
		String opt1 = input.nextLine();
		
		
		if (opt1.toLowerCase().equals("house")) {
			//go to class house1
			house.house1();
		} else if (opt1.toLowerCase().equals("senate")) {
			//broken code, doesn't work
			house.house1();
		} else if (opt1.toLowerCase().equals("what is the difference")) {
			//go to class whatis1
			whatis.whatis1();
		} //error handler if response doesn't match any of the above
		else {
			System.out.println("Try again. \nMake sure everything you type is spelled correctly and matches the parentheses. \n(house, what is the difference)");
			//second variable for same code above
			String opt2 = input.nextLine();
			if (opt2.toLowerCase().equals("house")) {
				//go to class house1
				house.house1();
			} else if (opt2.toLowerCase().equals("senate")) {
				//broken code for future fixing
				house.house1();
			} else if (opt2.toLowerCase().equals("what is the difference")) {
				//go to class whatis1
				whatis.whatis1();
			}
		}
		
		

	}

}