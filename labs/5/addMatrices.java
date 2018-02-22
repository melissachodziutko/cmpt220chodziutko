import java.util.Scanner;

public class addMatrices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declare matrices
		int[][] matrix = new int[3][3];
		int[][] matrix2 = new int[3][3];
		
		
		//prompt user for first matrix
		System.out.println("enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		
		//prompt user for second matrix
		System.out.println("enter " + matrix2.length + " rows and " + matrix2[0].length + " columns: ");
		for(int row = 0; row < matrix2.length; row++) {
			for(int column = 0; column < matrix2[row].length; column++) {
				matrix2[row][column] = input.nextInt();
			}
		}
		
		//add up first matrix
		int total = 0;
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
		}
		
		//add up second matrix
		int total2 = 0;
		for(int row = 0; row < matrix2.length; row++) {
			for(int column = 0; column < matrix2[row].length; column++) {
				total2 += matrix2[row][column];
			}
		}
		
		//print out the total of both matrices
		System.out.print(total + total2);
	}

}