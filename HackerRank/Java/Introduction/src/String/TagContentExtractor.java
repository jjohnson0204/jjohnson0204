package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            // Similar to DuplicateWords.java find dupe tags and remove all html tags
            boolean isMatch = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            // Check for subsequences of input that match the compiled pattern
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                isMatch = true;
            }
            if ( ! isMatch) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
