package comProj7;
/**
* Overview: creation of main class Account
* Input: n/a
* Output: n/a
* Plan:
* 1. Creation of Account class to be demo'd
* 2. Account constructor built with instant variables id and balance to force encapsulation
* 3. Create getters and setters for id, balance and interestRate
* 4. Create to methods withdraw, deposit and closeAccount with their formulas
*
* @version: 1.0 March 21, 2022
* @author: Jaye / Johnson
*/
public class Account 
{
	// declare variables
	private long id;
	private double balance;
	private double interestRate;
	


	//constructor without arguments
	public Account()
	{
		this.id = -1; // set id to default to -1
		this.balance = 5; // set balance default to $5
		this.interestRate = 0; // set interestRate default to 0%
	}
	//constructor with arguments id and balance
	public Account(long id, double balance) 
	{
		this.id = id;
		this.balance = balance;
		this.interestRate = 0;
	}
	//methods withdraw, deposit and closeAccount
	public void withdraw(double amount) 
	{
		if(this.balance - amount >= 0) // subtracts money from balance only if balance stays above $0 ( not go negative)
			this.balance = this.balance - amount; // sets new balance
		else
			System.out.println("Insufficient funds");
	}
	public void deposit(double amount)
	{
		this.balance = this.balance + amount; // adds money to balance
	}
	public void closeAccount ()
	{
		this.balance=0;
		System.out.println("ID: " + id + " is CLOSED with a $" + balance + " balance.");
	}
	//getters and setters
	//ID	
	public long getId() {
	return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//Balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//InterestRate
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public static void main(String[] args) 
	{
	
	}
}
