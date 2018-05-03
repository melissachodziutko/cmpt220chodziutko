
import java.util.Scanner;

public class House {

public static void house1() {
	Scanner input = new Scanner(System.in);
	//beginning of game
	System.out.println("Welcome to the House, Representative!");
	System.out.println("Let's start with our bill. \nHere are some options that your constituents are asking for:");
	System.out.println("One constituent has asked for a bill to ban grass. \nWould you like to proceed with this idea, or hear others?\n(proceed, others)");
	String opt1 = input.nextLine();
	
	//switch to check if input matches any of the cases
	switch(opt1.toLowerCase()) {
	case "proceed": System.out.println("Are you... really sure? \nIt may be funny to pass a bill banning grass but... will the rest of the House support it to become a law?\n(propose bill, I will try something else)");
		String opt2 = input.nextLine();
		switch(opt2.toLowerCase()) {
		case "propose bill":
			break;
		case "i will try something else":
		}
	case "others": System.out.println("Cool! It's not a good bill, no one would support it.\nLet's see what other options we have...\nWe can either propose a bill to increase gun control or decrease gun control.\n(increase, decrease)");
		String opt3 = input.nextLine();
			switch (opt3.toLowerCase()) {
			case "increase": housebill.houseincrease();
				break;
			case "decrease": housebill.housedecrease();
				break;
			}
	}
}
}
