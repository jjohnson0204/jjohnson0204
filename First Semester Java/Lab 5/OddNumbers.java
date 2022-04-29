package comProj5;
//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: usage of do-while loops
* Input: user enters integers
* Output: display sum of odd numbers entered
* Plan:
* 1. User runs the program
* 2. Have user inputs as many odd numbers they want for sum
* 3. Once and even number is entered, loop ends and sum is printed for odd numbers only 
*
* @version: 1.0 March 09, 2022
* @author: Jaye / Johnson
*/
import java.util.Scanner;

public class OddNumbers 
{
	public static void main(String[] args) 
	{
		// import scanner class and declare variables
		int userNumber; // odd numbers entered by user
		int sum = 0; //tallies the odd numbers entered
		Scanner scan = new Scanner(System.in);
		// instruction for program
		System.out.println("Enter odd numbers. Entering an even number will stop loop and sum of odd numbers will be provided.");
		do
		{
			// get odd numbers from user
			System.out.print("Enter odd numbers: ");
			userNumber = scan.nextInt();
			sum+=userNumber; // formula for sum tally
		}
		while (userNumber%2==1); // if even number is entered do the following
		{
			sum-=userNumber; // takes away the positive number from sum.
			System.out.println("An even number has been entered.");
			System.out.println("The sum of the odd numbers is " + sum + ".");
			scan.close(); // close the scanner
		}
	}
}
