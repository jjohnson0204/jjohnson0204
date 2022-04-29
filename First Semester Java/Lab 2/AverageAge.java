//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: Calculate user input ages average.
* Input: 3 ages from user.
* Output: Text Display * Variables: int val1, val2, val3 and double average.
* Plan:
* 1. User runs the program
* 2. Have user input 3 ages as int.
* 3. Calculate the average of the entered 3 ages.
* 4. Display the average to user in double format.
*
* @version: 1.0 February 05, 2022
* @author: Jaye / Johnson
*/
import java.util.Scanner;
public class AverageAge 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Declaring of variables
		int val1, val2, val3;
		double average;
		//Building of scanner
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		//Get three ages from the user
		System.out.println("Enter three ages and I will compute their average.");
		System.out.println("Enter the first age: ");
			val1 = scan.nextInt();
		System.out.println("Enter the second age: ");
			val2 = scan.nextInt();
		System.out.println("Enter the third age: ");
			val3 = scan.nextInt();
		//Formula for average
		average = (val1 + val2 + val3)/3;
		//Display average out to user
		System.out.println("The average is " + average + "");
	}
}

