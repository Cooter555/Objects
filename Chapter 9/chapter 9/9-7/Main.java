class Main {
	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		
		System.out.println("Your balance is: " + a1.getBalance() + ". Your monthly interest rate is: " + a1.getMonthlyInterest() + ". The date created is: " + a1.getDate() + ".");
	}
}