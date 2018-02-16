package hrkr;

import java.util.Scanner;

public class statistics {
    public static void main(String[] args) {
        int length = 10;
        double[] inputArray = new double[length];
        
        
        //prompt user for 10 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("enter in 10 numbers to find the standard dev and mean: ");
        
        //put numbers in array 
        for (int i = 0; i < 10; i++) {
            inputArray[i] = input.nextDouble();
        }
        System.out.printf("the mean of the numbers is %.2f%n", meanCalc(inputArray));
        System.out.printf("The standard deviation of the numbers is is %.5f%n", devCalc(inputArray));
    }

    // calculate deviation of array
    public static double devCalc(double[] v) {
        double mean = meanCalc(v);
        double sum = 0;
        for (double i = 0; i < v.length; i++) {
            sum += Math.pow(i - mean, 2);
        }
        return Math.sqrt(sum / (v.length - 1));
    }

    // calculate mean of array
    public static double meanCalc(double[] e) {
        double sum = 0;
        for (double j = 0; j < e.length; j++) {
            sum += j;
        }
        return sum / e.length;
    }
}