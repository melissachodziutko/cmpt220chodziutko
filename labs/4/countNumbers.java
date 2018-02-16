
import java.util.Scanner;

public class countNumbers {

	public static void main(String[] args) {
		
		int[] numberInput = new int[100]; 
		
		System.out.print("Enter the integers between 1 and 100 to find out how many distinct numbers there are, the input ends when you enter in 0: ");
		countTotalNumbers(numberInput);

		// print results while adding to array
		   for (int i = 0; i < numberInput.length; i++) {
	            if (numberInput[i] > 0) {
	                String counted = (i + 1) + " occurs " + numberInput[i] + " time";
	                if (numberInput[i] > 1) counted += "s";
	                System.out.println(counted);
	            }
		  }    
	}

	//method to test for distinct numbers 
	public static void countTotalNumbers(int[] counter){
		Scanner input = new Scanner(System.in);
		//variable to temporarily hold user input
		int num; 
		do { num = input.nextInt();
			if (num >= 1 && num <= 100)	
				counter[num - 1]++;
		} while (num != 0);
	}
}