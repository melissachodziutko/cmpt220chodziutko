
public class elapsedTime {
	public static void main(String[] args) {
	//declare date object
		java.util.Date date = new java.util.Date();
		
		//get date for 10000,100000, etc
		for (long i = 10000; i <= 1e11; i *= 10) {
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}


