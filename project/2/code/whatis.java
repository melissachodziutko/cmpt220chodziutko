package pls;

import java.util.Scanner;

public class whatis {

	public static void whatis1(){
		Scanner input = new Scanner(System.in);
		//system out prints to explain some of the background of the game
		System.out.println("Glad you asked! \nThere are 435 representatives in the house, and you need majority of the House to vote 'yes' to move into the Senate.");
		System.out.println("The Senate has only 100 members and requires also majority of the representatives to vote 'yes' to move into the house.");
		System.out.println("So, with this new information, would you like to be elected into the House and start the game?\n(sounds good)");
		String response = input.nextLine();
		
		//switch remnant of old code that I'm too lazy to change because it still works, right?
		switch(response.toLowerCase()) {
		case "sounds good": house.house1();
		break;
		}
	}

}
