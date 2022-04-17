package String;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        // get tokens from s input
        String[] tokens = s.trim().split("[!,?.*_'@ ]+"); // eliminate all special characters and trim whitespaces
        int size = tokens.length; // get the size  from tokens length
        System.out.println(size); // prints token size
        for (String token : tokens) { // enhanced for loop
            System.out.println(token);// prints tokens
        }
    }
}
