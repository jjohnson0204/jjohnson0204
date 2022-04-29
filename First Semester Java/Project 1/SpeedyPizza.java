package comProj4;
//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: Build a receipt for a pizza shop
* Input: cashier name, quantity for each pizza type
* Output: display cashier name, display of input values entered by user and total for values, 9 digit confirmation number (random) 
* Plan:
* 1. User runs the program
* 2. Have user input name and 3 integers.
* 3. Calculate the price individually for each pizza type and its total.
* 4. Display a receipt showing input and output details. 
*
* @version: 1.0 February 25, 2022
* @author: Jaye / Johnson
*/
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class SpeedyPizza 
{
	public static void main(String[] args)
	{
		//declaration of variables for pizza prices
		final double meatLovers = 10.99;  
		final double veggieLovers = 9.50;
		final double cheeseThree = 9.99;
		//initialize the scanner class
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	  	//request usersName or terminate program with typing q or Q
		System.out.println("Hello cashier, please enter your name or (\"q\" or \"Q\") to exit program:  ");
		String cashierName = scan.nextLine();
		if(cashierName.equals("q") || cashierName.equals("Q"))
		{
			System.exit(0);
		}
		//set usersName to upper case
		String upperCaseName = cashierName.toUpperCase();
		//request integers from user.
		System.out.print ("How many meat lovers: ");
		int meatLoversQty = scan.nextInt();
		System.out.print ("How many veggie lovers: ");
		int veggieLoversQty = scan.nextInt();
		System.out.print ("How many 3 cheese: ");
		int cheeseQty = scan.nextInt();
		//formulas to get pizza totals
		int meat= (int) (meatLoversQty * meatLovers);
		int veggie= (int)(veggieLoversQty * veggieLovers);
		int cheese= (int)(cheeseQty * cheeseThree);
		// Declaring money as a NumberFormat object and use the
		// getCurrencyInstance method to assign it a value
		NumberFormat money = NumberFormat.getCurrencyInstance();
	   	// convert all 0 input integers to string and readout no order.
		String veggieLoversString = (veggieLoversQty == 0? "No Order": Integer.toString(veggieLoversQty));
		String meatLoversString = (meatLoversQty == 0? "No Order": Integer.toString(meatLoversQty));
		String cheeseThreeString = (cheeseQty == 0? "No Order": Integer.toString(cheeseQty));
		System.out.println("\t\t\t\t\t" + upperCaseName);// print out cashier name in upper-case.
		System.out.println("");
		System.out.println("\t\t// ----------- // -----------~----------- \\\\ -----------\\\\");// implement banner line
		System.out.println("");
		System.out.println("\t\t\t\t\t   # of Sales\t\tPrice\t\tTotal"); // first line in table
		System.out.println("");
		//set length of the first column to 8 in order to keep tabs in-line for next 3 lines of code
		//print for string if user input is 0, if not print integer and compute to plan for next 3 lines of code
		System.out.println("Meat lovers\t\t\t\t   " + meatLoversString + ( meatLoversString.length() < 8 ? "\t\t\t" : "\t\t") + money.format(meatLovers) + "\t\t" + money.format(meat));
		System.out.println("");
		System.out.println("Veggie lovers\t\t\t\t   " + veggieLoversString + ( veggieLoversString.length() < 8 ? "\t\t\t" : "\t\t") + money.format(veggieLovers) + "\t\t" + money.format(veggie));
		System.out.println("");
		System.out.println("3 Cheese\t\t\t\t   " + cheeseThreeString + ( cheeseThreeString.length() < 8 ? "\t\t\t" : "\t\t") + money.format(cheeseThree) + "\t\t" + money.format(cheese));
		System.out.println("");
		//formula for total of all the pizza
		int total = meat + veggie +cheese;
		System.out.println("\t\t\t\t\t   Total\t\t\t\t" + money.format(total));
		System.out.println("");
		//setup for random 9 digit confirmation code.
	    Random random = new Random();
	    for (int j=0; j<1; j++)
	    {
	    	int confirmationCode = random.nextInt(900000000) + 100000;
	    	System.out.println("\t\t\t\t\t   Confirmation code: " + confirmationCode);
	    }
	}
}
