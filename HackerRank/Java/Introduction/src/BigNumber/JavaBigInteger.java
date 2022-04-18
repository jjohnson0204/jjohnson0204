package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;


public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create a and b strings
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        // create BigIntegers from a and b and do the add and multiply in the same line
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
        //close scanner
        scanner.close();
    }
}
