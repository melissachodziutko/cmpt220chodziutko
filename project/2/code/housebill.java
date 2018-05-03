

import java.util.Scanner;

public class bousebill {

	public static void houseincrease(){
		Scanner input = new Scanner(System.in);
		//prints to continue game
		System.out.println("Cool! Sounds good. \nLet's formulate a bill that will get enough votes to pass.");
		System.out.println("Here are some things I've thought about:");
		System.out.println("H.R. 007 - ");
		System.out.println("Issue a nation wide ban on guns, OR");
		System.out.println("Enforce strict background checks and proper training, and ban assault weapons.");
		System.out.println("(option one, option two)");
		String opt1 = input.nextLine();
		
		//if/elseif/else to match input to options
		if (opt1.toLowerCase().equals("option one")) {
			increase.option1();
		} else if (opt1.toLowerCase().equals("option two")) {
			increase.option1();
		}  else {
			//gives a second chance given the first run through the variable didnt match
			System.out.println("Try again. \nMake sure everything you type is spelled correctly and matches the parentheses. \n(option one, option two)");
			String opt2 = input.nextLine();
			if (opt2.toLowerCase().equals("option one")) {
				increase.option1();
			} else if (opt2.toLowerCase().equals("option two")) {
				increase.option1();
			} 
		}
		
	}
	public static void housedecrease() {
		Scanner input = new Scanner(System.in);
		//same code as above but instead decrease gun control
		System.out.println("Cool! Sounds good. \nLet's formulate a bill that will get enough votes to pass.");
		System.out.println("Here are some things I've thought about:");
		System.out.println("H.R. 007 - ");
		System.out.println("Remove all bans on guns, OR");
		System.out.println("Only require a background check.");
		System.out.println("(option one, option two)");
		String opt1 = input.nextLine();
		
		//same if/else idea as above
		if (opt1.toLowerCase().equals("option one")) {
			increase.option1();
		} else if (opt1.toLowerCase().equals("option two")) {
			increase.option1();
		}  else {
			System.out.println("Try again. \nMake sure everything you type is spelled correctly and matches the parentheses. \n(option one, option two)");
			String opt2 = input.nextLine();
			if (opt2.toLowerCase().equals("option one")) {
				increase.option1();
			} else if (opt2.toLowerCase().equals("option two")) {
				increase.option1();
			} 
		}
	}
	
}

