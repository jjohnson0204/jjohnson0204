package DataStructures;

import java.util.Scanner;

public class Java2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) { // row loop
            for (int j = 0; j < 6; j++) { // column loop
                a[i][j] = sc.nextInt();
                if (i > 1 && j > 1) { // if i and j > 1
                    int sum = a[i][j] + a[i][j - 1] + a[i][j - 2]               // top of hourglass
                            + a[i - 1][j - 1]                                   // middle of hourglass
                            + a[i - 2][j] + a[i - 2][j - 1] + a[i - 2][j - 2];  // bottom of hourglass
                    // if sum > max set max equal to sum
                    if (sum > max)
                        max = sum;
                }
            }
        }
        sc.close(); // close scanner
        System.out.println(max); // print the result of max
    }
}
