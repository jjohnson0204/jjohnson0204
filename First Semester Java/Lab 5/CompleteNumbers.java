package comProj5;
//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: usage of nested loops
* Input: n/a
* Output: message stating how many perfect numbers are between 1-30000
* Plan:
* 1. User runs the program
* 2. Message stating how many perfect numbers are between 1-30000
* 3. List of the perfect numbers found in the range is printed 
*
* @version: 1.0 March 9, 2022
* @author: Jaye / Johnson
*/
public class CompleteNumbers 
{
	public static void main(String[] args) 
	{
		int count= 0;
		int Sum = 0;
		int Minimum= 1; // start of range
		int Maximum= 30000; // end of range
		int i,Number;
		String perfectNumbers = ""; // formatted output for complete numbers as an array template
		
		for(Number = Minimum; Number <= Maximum; Number++) // (i=1;i<=30000;i++)
		{
			for(i = 1, Sum =0; i < Number; i++)  
			{
				
				if(Number % i == 0)  
				{
					Sum += i; 
				}
			}
			if (Sum == Number) 
			{
				count++;// counts the find for complete numbers
				perfectNumbers += String.format("%d \t", Number ); // will print out each perfect number found with a tab spacing
			}
        }
		System.out.println("There are "+count+" complete numbers in the range 1-30000:");// prints message with count
		System.out.format(perfectNumbers);// prints perfect numbers found in table row format
		
	}
}

