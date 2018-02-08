
public class kilo {
	public static void main(String[] args) {
		// declare variable for pounds/kilo conversion
		double poundsToKilo = 2.2;

		// display table
		System.out.println(
			"Kilograms    Pounds     |     Pounds      Kilograms");
		for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
			System.out.printf("%-10d%7.1f", k, (k * poundsToKilo));
			System.out.print("       |     ");
			System.out.printf("%-5d%10.2f%n", p, (p / poundsToKilo));
		}
	}
}
