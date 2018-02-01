import java.util.Scanner;
public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the employee's last name: ");
		String name = input.next();
		System.out.println("Enter in number of hours worked: ");
		double hours = input.nextDouble();
		System.out.println("Enter in hourly pay rate: ");
		double pay = input.nextDouble();
		System.out.print("Enter in federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		System.out.print("Enter in state tax withholding rate: ");
		double stateTax = input.nextDouble();
	

		
		System.out.print("Employee Name: " + name +
				"\n Hours Worked: " + hours +
				"\n Hourly Pay Rate: " + pay +
				"\n Gross pay: " + (pay * hours) +
				"\n Deductions- " +
				"\n Federal Withholding (" + federalTax + "): " + (federalTax * (pay * hours)) +
				"\n State Withholding (" + stateTax + "): " + (stateTax * (pay * hours)) + 
				"\n Total Deductions: " + (((pay * hours) * federalTax) + ((pay * hours) * stateTax)) +
				"\n Total Pay: " + ((pay * hours) - ((pay * hours) * federalTax) + ((pay * hours) * stateTax)));

	}

}
