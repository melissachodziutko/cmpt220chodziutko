import java.util.Scanner;

public class location {


	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

		System.out.print("enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();

		// create matrix from user input
		double[][] array = new double[rows][columns]; 
		System.out.println("enter array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		// location of largest number in array
		System.out.println("larget number is " + largest(array));
	}

	//method to return largest
	public static Location largest(double[][] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (array[i][j] > max){
				max = array[i][j];
				}
			}
		}
		return max;
	}

	}

}
