//package m;


import java.util.Scanner;

public class Velocity {

    public static void main(String[] Strings) {
      	//declare scanner
        Scanner input = new Scanner(System.in);

        //prompt user for v0, v1, and t
        System.out.print("Enter v0, v1, and t: ");
        
        //round the inputs
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        	//calculate acceleration
        double acceleration = (v1 - v0) / t;
        
        //print the answer
        System.out.print("The average acceleration is " + acceleration);

    }
}