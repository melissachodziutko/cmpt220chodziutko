
public class AccountCalculations {
	public static void main(String[] args) {
		//declare account
		Account account = new Account(1122, 20000);


		//declare interest rate
		account.annualInterestRate(4.5);

		//declare withdraw
		account.withdraw(2500);

		//declare deposit
		account.deposit(3000);

		//print out information
		System.out.println("Account ID: " + account.id());
		System.out.println("Date created: " + account.datecreated());
		System.out.printf("Balance: $%.2f\n", account.balance());
		System.out.printf("Monthly interest: $%.2f\n", 
			account.getMonthlyInterest());
	}
}