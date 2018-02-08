
import java.util.Scanner;

public class primeOrEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for integers
		System.out.print("Enter in integers and I will count how many positive and negative numbers there are. The input ends when you enter 0.");
		int number = input.nextInt();
		
		//set all beginning variables to 0
		int negatives = 0;
		int positives = 0;
		int total = 0;
		int amountOfNumbers = 0;
		int avg = 0;
		
		//error checker
		if (number == 0) {	
			System.out.println("no numbers are entered except 0");
		}
		
		//if number is less than 0, add to negatives, over 0, add to positives, then add on to everything else when the block is done
		while (number != 0) {
			if (number < 0) {
			negatives++;
		} else {
			positives++;
		} 
		total += number;
		amountOfNumbers++;
		avg = total / amountOfNumbers;
		number = input.nextInt();
	}
		//print out final results
		System.out.println("the total number of negatives is " + negatives + " and the total number of positives is " + positives + " and the total of numbers is " + total + " and the average is " + avg);
	}

}
