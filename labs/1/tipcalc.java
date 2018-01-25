package m;

import java.util.Scanner;

public class tipcalc {

	public static void main(String[] args) {
		//declare scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for the cost of meal
		System.out.print("Enter in the cost of your meal: ");
		double price = input.nextDouble();
		
		//calculate cost of tip and then the total cost of the meal
		double tip = .15 * price;
		double cost = tip + price;
		
		//display tip and cost of meal
		System.out.println("The tip of the meal is " + tip + " And the total cost is " + cost);
		

	}

}
