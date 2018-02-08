public class pentagonals {

	public static void main(String[] args) {
	//variable for amount of integers to find
	int pentagonal = 101;
	//number of integers per line
	int numberPerLine = 10;
	
	//for loop to keep printing numbers, and new line creation whenever numerPerLine modulo 10 is 0
	for (int i = 1; i < pentagonal; i++) {
		if (i % numberPerLine == 0) {
			System.out.printf("%7d%n", getPentagonalNumber(i));
		} else { 
		System.out.printf("%7d", getPentagonalNumber(i));
		}
	}

	}
	
	//method to do the math of pentagonal number
public static int getPentagonalNumber(int n) {
	return (n * (3 * n - 1) / 2);
}
}
