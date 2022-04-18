package DataStructures;

import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // size of the array
        int[] a= new int[n]; // array a which can hold n amount of integers
        for(int i = 0; i < n; i++) { // ex: n= 10, n - 10,9,8...1 while i - 1,2,3...9
            a[i] = scan.nextInt(); // get integers and add to array until n hits end
        }
        scan.close();

        // Prints each sequential element in array a

        /*
        ******original for loop*****
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
         */
        for (int j : a) { // enhanced for loop
            System.out.println(j);
        }
    }
}
