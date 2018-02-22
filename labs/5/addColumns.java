import java.util.Scanner;

public class addColumns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[3][4];
		
		//prompt user to enter in 3 by 4 matrix
		System.out.println("enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		
		
		//add up columns
		for(int column = 0; column < matrix[0].length; column++) {
			int total = 0;
			for (int row = 0; row < matrix.length; row++) 
				total += matrix[row][column];
			
			//print out columns
			 System.out.println("the sum of column " + column + " is " + total);
		}
		
	}
	}

	
	

