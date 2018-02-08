
public class exponents {

	
	public static void main(String[] args) {
		//declare variable and set it to 0
		int number = 0;
		
		//while statement to find n^3, smaller than 12000
		while(Math.pow(number + 1, 3) < 12000) {
			number++;
		}
		System.out.println(number);

	}

}
