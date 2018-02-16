
public class footToMeter {
	public static void main(String[] args) {
		// display table
		System.out.println(
			"Feet        Meters      |     Meters      Feet");
		for (int f = 1, m = 20; f <= 10 && m <= 65; f += 1, m += 5) {
			System.out.printf("%-10d%7.3f", f, footToMeter(f));
			System.out.print("       |     ");
			System.out.printf("%-5d%10.3f%n", m, meterToFoot(m));
		}
	}
	//declare method to translate foot to meter
	public static double footToMeter(double foot) {
		double meter = .305 * foot;
		return meter;
	}
	
	//method to translate metr to foot
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
}
