import java.util.Scanner;

public class smallestInt {

	public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        
	        //prompt user for ten numbers to calculate the smallest number
	        double[] number = new double[10];
	        System.out.print("Enter ten numbers: ");
	        for (int i = 0; i < 10; i++) {
	            number[i] = input.nextDouble();
	        }
	       System.out.print("the smallest number is: " + smallest(number));
	    }
	    
	    //method to calculate the smallest into the erray
	 public static double smallest(double[] array) {
     	double min = array[0];
     	for (int i = 0; i < 10; i++) {
     	//if array at i is smaller than min, set min to array at i
     		if (array[i] < min) {
     			min = array[i];
     		}
     	}
     	return min;
	}
}

 
		  
 