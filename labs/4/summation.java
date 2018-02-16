
public class summation {

	public static void main(String[] args) {
		// display table
		System.out.println("i          m(i)");
		System.out.println("_______________");
		for (int i = 1; i <= 20; i += 1) {
			System.out.printf("%-10d%7.4f%n", i, mi(i));
		}
	}
	
	//method for calculating summation of i/i+1
	public static double mi(double integer) {
		double calculation = 0;
		for (double i = 1; i <= integer; i++) {
			calculation += i / (i + 1);
		}
		return calculation;
	}
}
