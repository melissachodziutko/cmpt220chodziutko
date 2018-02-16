
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter in the amount of rows and columns you want of numbers");
		int n = input.nextInt();
		
		printMatrix(n);
		}
	
	
	//method to generate and print matrix
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int columns = 0; columns < n; columns ++) {
				// randomize and print 0s and 1s
				System.out.print((int)(Math.random() * 2));
			}
			// print a new line to start the next section
			System.out.println();
		}
	
	}

}
