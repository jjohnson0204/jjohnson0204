package String;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        // checks to see if lengths are equal
        if ( a.length() != b.length() ) {
            return false;
        }
        // converts the string to all lowercase
        String a1=a.toLowerCase();
        String a2=b.toLowerCase();
        // converts the string in to char array
        char[] c1 = a1.toCharArray();
        char[] c2 = a2.toCharArray();
        // sorts the char array
        java.util.Arrays.sort(c1); // since  you can't add util to header in hacker rank
        java.util.Arrays.sort(c2); // since  you can't add util to header in hacker rank
        // resets to String and checks if equal.
        String str1 = new String(c1);
        String str2 = new String(c2);
        return str1.equals(str2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
