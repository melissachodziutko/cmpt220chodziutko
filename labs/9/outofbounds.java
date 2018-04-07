package helpo;

import java.util.Scanner;

public class outofbounds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	//assign numbers to array
	     int i;
	        int[] ar1 = new int[100];
	        for(int i1 = 0; i1 <  ar1.length; i1++) {
	            ar1[i1] = (int)(Math.random() * 100);
	            System.out.print(ar1[i1] + "  ");
	        }
	        
	        
	        System.out.println("\nenter in a number 0-100 to find the number stored in the array at that location");
	        double number = input.nextDouble();
	        
		
		//print number if location is in bounds
	        if(number < 101) {
	        	System.out.println(ar1[(int) number]);
	        } else {
	        	System.out.println("That location does not exist");
	        }
	        
	    }
	

	}


