package comProj4;

import java.util.Scanner;

//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: usage of cases and switches
* Input: user enters month and year in xx and xxxx format
* Output: month message, year message and statement stating how many days in that month and that year
* Plan:
* 1. User runs the program
* 2. Have user input 2 integers month and year
* 3. Print a message telling how many days were in that month for that year 
*
* @version: 1.0 February 28, 2022
* @author: Jaye / Johnson
*/
public class JayeJohnsonLab4 
{
	public static void main(String[] args) 
	{
		// declaration of variables
		int M; // M= Month
		int year;
		// initialize the scanner class
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// get month from user with error checking
		System.out.print("Enter a month January:1 - December:12");
		M = scan.nextInt();
		if (M<1 || M>12)
		{
			System.out.println("Error.... The number entered is less than 1 or greater than 12");
			System.out.print("Enter a month (January:1 - December:12): ");
		}
		
			
		//get the year from user
		System.out.print("Enter the year in 4 digit format (XXXX): ");
		year = scan.nextInt();
		switch (M) {
		case 1: // January
			System.out.println("\nJanuary in " + year + " is 31 days");
			break;
		case 2:// February
			if ((year % 4 == 0) && ((year % 100 ==0) && (year % 400 == 0)) || (year%100 != 0))
			{
				System.out.println("\n\"February in " + year + " is 29 days\"");
			}
			else
			{
				System.out.println("\n\"February in " + year + " is 28 days\"");
			}
			break;
		case 3: // March
			System.out.println("\n\"March in " + year + " is 31 days\"");
			break;
		case 4: // April
			System.out.println("\n\"April in " + year + " is 30 days\"");
			break;
		case 5: // May
			System.out.println("\n\"May in " + year + " is 31 days\"");
			break;
		case 6: // June
			System.out.println("\n\"June in " + year + " is 30 days\"");
			break;
		case 7: // July
			System.out.println("\n\"July in " + year + " is 31 days\"");
			break;
		case 8: // August
			System.out.println("\n\"August in " + year + " is 31 days\"");
			break;
		case 9: // September
			System.out.println("\nSeptember in " + year + " is 30 days");
			break;
		case 10: // October
			System.out.println("\n\"October in " + year + " is 31 days\"");
			break;
		case 11: // November
			System.out.println("\n\"November in " + year + " is 30 days\"");
			break;
		case 12: // December
			System.out.println("\n\"December in " + year + " is 31 days\"");
			break;
		default:
		}
	}
}
