package comProj7;
/**
* Overview: creation of main class Account
* Input: n/a
* Output: n/a
* Plan:
* 1. Creation of AccountDemo
* 2. Create new object Account
* 3. Set values for the Account Id, Balance, and InterestRate
* 4. Call withdraw to subtract from balance
* 5. Call deposit to add to balance
* 6. Print the Id and Balance to console
*
* @version: 1.0 March 21, 2022
* @author: Jaye / Johnson
*/
public class AccountDemo 
{
	public static void main(String[] args) 
	{
		// creation of object using default constructor
		Account account1 = new Account();
		// setup id value
		account1.setId(1234);
		// setup balance value
		account1.setBalance(4321);
		// setup interestRate value
		account1.setInterestRate(3.2);
		// withdraw $3210
		account1.withdraw(3210);
		// deposit $2345
		account1.deposit(2345);
		// print id and balance for account1
		System.out.println("ID: "+ account1.getId() + " Balance: $" + account1.getBalance());
		account1.closeAccount();

		
		
	}
}
