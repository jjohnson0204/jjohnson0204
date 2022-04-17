package String;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be lexicographically the smallest substring of length 'k'
        // 'largest' must be lexicographically the largest substring of length 'k'
        for(int i = 0; i <= s.length() - k; ++i)
        {
            String subTemp = s.substring(i, i + k);
            if(subTemp.compareTo(smallest) < 0 || smallest.isEmpty())
            {
                smallest = subTemp;
            }
            if(subTemp.compareTo(largest) > 0 || smallest.isEmpty())
            {
                largest = subTemp;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
