package String;

import java.util.Scanner;

class UsernameValidator {
    /*
     * ^ - start
     * [A-Za-z] - capital to lowercase
     * \\w = A word character: [a-zA-Z_0-9]
     * {7,29}
     * $ - end
     */
    public static final String regularExpression = "^[A-Za-z]\\w{7,29}$"; // result
}
public class ValidUsernameRegularExpression {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
