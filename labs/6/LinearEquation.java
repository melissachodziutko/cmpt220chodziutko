public class LinearEquation {

		public static void main(String[] args) {

	}
	public double getX(double e, double d, double b, double f, double a, double c) {
		return (e * d - b * f) / (a * d - b * c);
	}
	public double getY(double e, double d, double b, double f, double a, double c) {
		return (a * f - e * c) / (a * d - b * c);
	}
}
