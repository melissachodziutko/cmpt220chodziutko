import java.util.Scanner;

public class sort {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//promt user for the three integers
		System.out.print("enter in three integers to sort them from smallest to largest");
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		int numberThree = input.nextInt();
		
		sort(numberOne, numberTwo, numberThree);
	}
	
	//method to sort out the numbers
	public static void sort(int numberOne, int numberTwo, int numberThree) {
		//create temporary variable
		int temp;
		
		//reassign numbers until they have been properly sorted
		if (numberTwo < numberOne && numberTwo < numberThree){
			temp = numberOne;
			numberOne = numberTwo;
			numberTwo = temp;
		} else if (numberThree < numberOne && numberThree < numberTwo){
			temp = numberOne;
			numberOne = numberThree;
			numberThree = temp;
		} else if (numberThree < numberTwo) {
			temp = numberTwo;
			numberTwo = numberThree;
			numberThree = temp;
		}
		
		// display result
		System.out.println("the sorted numbers are " + numberOne + ", " + numberTwo + ", " + numberThree);
	}
}
