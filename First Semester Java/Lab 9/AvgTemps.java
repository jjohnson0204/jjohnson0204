package comProj9;
/**
* Overview: creation of main class AvgTemps
* Input: temperatures for the month of November
* Output: the above average, below average and the average of temperature input
* Plan:
* 1. Ask for temperatures
* 2. Store temperatures in an array
* 3. Compute the above, below and average of them
* 4. Print info out to user
*
* @version: 1.0 April 21, 2022
* @author: Jaye / Johnson
*/
import java.util.Scanner;

public class AvgTemps {

	public static void main(String[] args) {

        double temp = 1.0, sum = 0, avg;
        StringBuilder t = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        int c = 0;
        
        while(temp != 0.0) {
        	System.out.print("\nEnter a temperature (0.0 to exit): "); // allows user to enter temperatures until 0.0 is entered
            temp = scan.nextDouble();
            if(temp != 0.0) {
            	t.append(temp).append(" ");
                c = c + 1;
                sum = sum + temp;
            }
        }
        scan.close(); // scanner no longer needed
        avg = sum / c;
        System.out.println("\nThe calculated average is " + avg + "\n");

        String[] tmp = t.toString().split(" ");

        for (int i = 0; i < c; i++) {
            if (Double.parseDouble(tmp[i]) > avg) { // above average
                System.out.println("The temperature " + tmp[i] + " is higher than the average!!");
            } else if (Double.parseDouble(tmp[i]) < avg) { // below average
                System.out.println("The temperature " + tmp[i] + " is lower than the average!!");
            } else { // the average
                System.out.println("The temperature " + tmp[i] + " is equal to the average!!");
            }

        }
    }
}
