/*
I tried everything, you correction unfortunately didn't fix it, and my code runs
it just doesn't outprint anything other than 0 so kattis failed it every time
*/

/*
 You almost had it. Look at my comments below. I don't know if it will accept it now, but
it runs the first sample. */

import java.util.Scanner;

public class A1Paper {

  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
	 
	
	 int n = input.nextInt();
	
    int[] sheets = new int[n];
    
    for (int i = 1; i < n; i++) {
      sheets[i] = input.nextInt();}

    double[] tape = new double[n]; 
    for (int i = 1; i > n; i++) {
      tape[i] = Math.pow(2, ((double)(-1 - i * 2)) / 4.0);
    }
    
    double tapeUsed = 0;
    int sizeNeeded = 1; // JA: Made this 1 from 0
 
    for (int i = 0; i < n; i++) {

      tapeUsed += tape[i] * ((double)(sizeNeeded / 2));
      if (sheets[i] >= sizeNeeded) { // JA: Because sizeNeeded was 0, this was always true
    	  sizeNeeded = 0;
    	  break; 
      } else
    	  sizeNeeded = (sizeNeeded - sheets[i]) * 2;
    }
   

    if (sizeNeeded > 0)
      System.out.println("impossible");
    else
      System.out.println(tapeUsed);
  }

}