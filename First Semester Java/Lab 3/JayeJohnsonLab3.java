package comProj3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: Get user input, calculate and print receipt.
* Input: username, weight in ounces, price per pound
* Output: welcome message with user name, display of input values total for values, 2 confirmation number (random) 
* Plan:
* 1. User runs the program
* 2. Have user input name and 2 intergers.
* 3. Calculate the price of the weight x price
* 4. Display a receipt showing input and output details. 
*
* @version: 1.0 February 21, 2022
* @author: Jaye / Johnson
*/
public class JayeJohnsonLab3 
{

	public static void main(String[] args) 
	{
		//declaration of variables
		final double OUNCES_PER_POUND = 16.0;
		double pricePerPound;  
		double weightOunces;  
		double weight;      
		double totalPrice;
		//initialize the scanner class
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	  	//request usersName
		System.out.println("Enter your name: ");
		String usersName = scan.nextLine();
		//set usersName to upper case
		String upperCaseName = usersName.toUpperCase();
		//request intergers from user.
		System.out.print ("Enter the item's weight in (ounces): ");
		weightOunces = scan.nextDouble();
		System.out.print ("Enter the price per pound: ");
		pricePerPound = scan.nextDouble();
	 	// Convert ounces to pounds and compute the total price
		weight = weightOunces / OUNCES_PER_POUND;
		totalPrice = pricePerPound * weight;
		// Declaring money as a NumberFormat object and use the
		// getCurrencyInstance method to assign it a value
		NumberFormat money = NumberFormat.getCurrencyInstance();
		// Declaring fmt as a DecimalFormat object and instantiate
		// it to format numbers with at least one digit to the left of the
		// decimal and the fractional part rounded to two digits.
		DecimalFormat fmt = new DecimalFormat("0.##");
		// setup for username in all caps and replace space with period.
		String string = upperCaseName;
		char ch = '.';
	    string = string.replace(' ', ch);
	   	// Print the label using the formatting objects
		// Format for the weight in pounds and money for the prices
		System.out.println("\\\\\\ Welcome " + string + " " + "///");// print out welcome message with uppercase and period replace for space.
		System.out.println("===============================");
		System.out.println("  Unit Price: " + "\t" + money.format(pricePerPound) + " per pound");
		totalPrice = (pricePerPound * (weightOunces/16)); //calculates total
		weight = weightOunces/16; //converts ounces to pounds
		System.out.println("  Weight: " + "\t " + fmt.format(weight) + " pounds"); //prints total weight
		System.out.println("===============================");
		System.out.println("  TOTAL: " + "\t" + money.format(totalPrice)); //prints final total
		System.out.println();
		//setup for random 2 digit confirmation code.
	    Random random = new Random();
	    for (int j=0; j<1; j++)
	    {
	    	int confirmationCode = random.nextInt(90) + 10;
	    	System.out.println("Confirmation Code: " + confirmationCode);
	    }
	}
}
