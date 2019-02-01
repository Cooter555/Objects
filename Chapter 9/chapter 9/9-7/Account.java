/*
Cooter Gale
1-24-18

account
_________
id int
balance double
annualInterestRate double
dateCreated date
____________
account(int id, int balance)
getMonthlyInterestRate()
withdraw()
deposite()

*/

class Account {
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private java.util.Date dateCreated;
	
	public Account() {
		this.dateCreated = new java.util.Date();
	}
	public Account(int newId, double newBalance) {
		this.id = newId;
		this.balance = newBalance;
		this.dateCreated = new java.util.Date();
	}
	public java.util.Date getDate(){
		return this.dateCreated;
	}
	public double getBalance() {
		return this.balance;
	}
	public int getId() {
		return this.id;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int newID){
		id = newID;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public static void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 1200);
	}
	public double withdraw(double ammount) {
		return balance = balance - ammount;
	
	}
	public double deposit(double quantity) {
		return balance = balance + quantity;
	}
}