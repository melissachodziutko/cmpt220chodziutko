
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendr {
	public static void main(String[] args) {
	//declare calendar
		GregorianCalendar calender = new GregorianCalendar();
		
		//print current day, with / to separate
		System.out.print("Current MM/DD/YYYY: ");
		System.out.println(calender.get(Calendar.MONTH) + "/" +
			calender.get(Calendar.DAY_OF_MONTH) + "/" + calender.get(Calendar.YEAR));

		//elapsed time since jan 1st with 1234567898765L, with / to separate
		calender.setTimeInMillis(1234567898765L);
		System.out.print("\nelapsed time since jan 1 1970 with 1234567898765L: ");
		System.out.println(calender.get(Calendar.MONTH) + "/" +
			calender.get(Calendar.DAY_OF_MONTH) + "/" + calender.get(Calendar.YEAR));
	}
}
