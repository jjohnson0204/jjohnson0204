package comProj8;

import java.util.Scanner;

/**
* Overview: creation of RandomNumArray
* Input: Integers
* Output: Occurrences if any for each number entered.
* Plan:
* 1. Get integer from user
* 2. Store in array
* 3. Loop over array for occurrences
* 4. Print out array with occurrences
* @version: 1.0 March 21, 2022
* @author: Jaye / Johnson
*/

public class ArrayRandomNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        int [] numbers = new int[100]; 
        int [] count = new int[10000];
        int i,temp = 0;
        System.out.println("Enter the integers between 1-10000 as many as you like (0) to exit: ");

        //Initialize numbers[] array with user input
        for(i=0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
            scan.close();
            //expected input will end when user enters zero
            if(numbers[i] == 0){
                break;
            }
        }//end of for loop

        //store numbers in temp to track occurances
        for(i = 0; i < numbers.length; i++){
                temp = numbers[i];
                count[temp]++; //this has issues
            }//end of for looop

        for(i=1; i < count.length; i++){

            if(count[i] > 0){
            	System.out.printf("%d occurs %d time\n",i, count[i]);
             }
         }//end of for loop
	}// end of main
}// end of RandomNumsArray
