package comProj9;
/**
* Overview: creation of main class Crayon
* Input: show, view, end
* Output: a random crayon or list of crayons
* Plan:
* 1. Build array of crayons and define their attributes
* 2. Create show, view and end functions
* 3. End- exits program, Show -shows a random crayon and removes it from array, View - shows the array of crayons
* 4. Create the output in each function and ask what user would like to do next after every function is done
*
* @version: 1.0 April 21, 2022
* @author: Jaye / Johnson
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Crayon { // main class
	// variables
	public String color;
	public int length;
	public int sharpness;
	public Crayon(String string, int i, int j) {
		color = string;
		length = i;
		sharpness = j;		
	}
	public String toString () { // toString print for attributes 
		return color + " " + length + " " + sharpness;
	}

	public static void main(String[] args) {
		// creation of array of crayons 
		ArrayList<Crayon> crayons = new ArrayList<>();
	       crayons.add(new Crayon("Blue", 9, 4));
	       crayons.add(new Crayon("Yellow", 7, 1));
	       crayons.add(new Crayon("Red", 8, 3));
	       crayons.add(new Crayon("Black", 2, 3));
	       crayons.add(new Crayon("Green", 10, 5));
	       crayons.add(new Crayon("Orange", 4, 5));
	       crayons.add(new Crayon("Pink", 5, 5));
	       crayons.add(new Crayon("Brown", 6, 2));
	   // creation of random selection
       Random random = new Random();
       while(true)
       {
       try (Scanner scan = new Scanner(System.in)) {
		String choice;
		   System.out.println("\nShow - Show a crayon\nView - view all crayons\nEnd - End the program\nEnter your choice");
		   choice = scan.next();// get the users choice
		   if(choice.equalsIgnoreCase("end")) 
		   {
		       System.exit(0); // if user no longer wants to run application will exit program
		   }
		   else if(choice.equalsIgnoreCase("show"))
		   {
		       if(crayons.size()>0)
		       {
		           int rand = random.nextInt(crayons.size()); // will show a random crayon to user with its attributes
		           System.out.println(crayons.get(rand).toString()); // get a random crayon and print it out
		           crayons.remove(rand); // then remove it from the array
		       }
		   }
		   else if(choice.equalsIgnoreCase("view"))
		   {
		       for(int i=0; i<crayons.size(); i++)
		       {
		           System.out.println(crayons.get(i).toString()); // will show a list of all crayons with all there attributes
		       }
		       
		   }
	}
      
       }
      
	}

}
