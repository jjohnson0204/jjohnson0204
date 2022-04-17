package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.internal.org.jline.utils.Colors.s;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        //\b       match a word boundary
        //[a-z]+   match a word with one or more characters; the parentheses creates group
        //\b       match a word boundary
        //(?:      indicates a non-capturing group (which starts here)
        //\s+      match one or more white space characters
        //\1       is a back reference to the first (captured) group; so the word is repeated here
        //\b       match a word boundary
        //)+       indicates the end of the non-capturing group and allows it to occur one or more times
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(),m.group(1));
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
        in.close();
    }
}
