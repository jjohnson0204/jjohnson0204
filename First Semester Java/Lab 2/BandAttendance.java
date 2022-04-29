
//Jaye Johnson [jo1103776@email.ccbcmd.edu]

import java.util.Arrays;

/**
* Overview: Use of tab characters and + operators
* Input: None
* Output: Text Display * Variables: None
* Plan:
* 1. User runs the program
* 2. Should display 5 bands revenue for 2 venues and the total for both
*
* @version: 1.0 February 07, 2022
* @author: Jaye / Johnson
*/
public class BandAttendance 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Creation of the banner for band attendance
		System.out.println("////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("|=	     Band Attendance          =|");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////");
		for (String s : Arrays.asList("", "Name\t\tD.C\tL.A\tTotal", "----\t\t---\t---\t-----")) {
			System.out.println(s);
		}
		//Creation of column headers
		for (String s : Arrays.asList("", "Lincoln Park\t20,000\t30,000" + "\t" + (20000 + 30000), "The Beetles\t15,000\t20,000" + "\t" + (15000 + 20000), "Guns N' Roses\t25,000\t10,000" + "\t" + (25000 + 10000), "Aerosmith\t29,000\t32,000" + "\t" + (29000 + 32000), "AC/DC\t\t16,000\t24,000" + "\t" + (16000 + 24000))) {
			System.out.println(s);
		}
		//Data for band, revenue and totals
	}
}
