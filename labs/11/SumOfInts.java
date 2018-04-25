package pls;

import java.util.Scanner;
public class SumOfInts {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			// prompt user for number
			System.out.print("enter a number to add the digits together: ");
			long n = input.nextLong();

			// Display the sum
			System.out.println(add(n));
		}

		//adds digits
		public static int add(long n) {
			return overload(n, 0);
		}

		//RHM
		private static int overload(long n, int add) {
			if (n == 0) {
				return add;
			}
			else {
				return overload(n / 10, add + (int)(n % 10));
			}
		}
	}
