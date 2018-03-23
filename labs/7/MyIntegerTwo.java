
public class MyIntegerTwo {

	public static void main(String[] args) {

	}
	
	//store variable
	public static double storage(double x) {
		double value = x;
		return value;
	}
	
	//boolean to test even
	public static boolean isEven(double x) {
		if((x%2)==0) {
			return true;
			
		}
		else {
		    return false;
		    }
		
	}
	
	//boolean to test if its odd
	public static boolean isOdd(double x) {
		if((x%2)==0) {
			return false;
			
		}
		else {
		    return true;
		    }
		
	}
	
	//boolean to test if it is prime
	public static boolean isPrime(double x) {
	    int i;
	    for (i = 2; i < x; i++) {
	        if (x % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	

}
