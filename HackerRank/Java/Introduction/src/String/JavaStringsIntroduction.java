package String;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // add lengths of A and B together
        System.out.println(A.length()+B.length());
        // compares A to B and strings out Yes or No
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        // capitalizes the fist string element in the array length of A and B and proceeds normally at element 1
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
    }
}