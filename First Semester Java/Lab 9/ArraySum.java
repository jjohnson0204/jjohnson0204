package comProj9;
/**
* Overview: creation of main class ArraySum
* Input: the size of array matrix, the elements for each cell
* Output: the sum of rows, columns and total matrix
* Plan:
* 1. Get array matrix size
* 2. Create the 2D array
* 3. Ask user for elements for each row and column cell
* 4. Compute the sum of rows, columns and total for the matrix
* 5. Print them to user
*
* @version: 1.0 April 21, 2022
* @author: Jaye / Johnson
*/
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan=new Scanner(System.in);
        int sumTotal=0,sumRow; // sumTotal = sum of all rows, sumRow = sum of the row alone
        int rows,row,columns,col; // variables for individual and full (row/column)
        StringBuilder rowSums= new StringBuilder(); // easier to get things printed

        System.out.println("\nWhat is the size of your matrix? "); // user choice in size of rows and columns
        System.out.print("How many rows? ");
        rows=scan.nextInt();
        System.out.print("How many columns? ");
        columns=scan.nextInt();
        // array creation
        int[][] arr =new int[rows][columns];
        for(row=0;row<rows;row++)
        {
            sumRow=0;
            System.out.println("\nPlease enter your row "+(row+1)+"? "); // will repeat for each row needed
            for(col=0;col<columns;col++)
            {
                System.out.print("Column "+(col+1)+" - "); // will repeat for each column needed
                arr[row][col]=scan.nextInt();
                sumRow=sumRow+arr[row][col];
            }
            sumTotal=sumTotal+sumRow;
            rowSums.append("Your total for row ").append(row + 1).append(" is - ").append(sumRow).append("\n");
        }
        System.out.println("\n\n"+rowSums);
        System.out.println("\nYour total for the "+rows+" * "+columns+" matrix is "+sumTotal+"\n");
        scan.close();
    }// end main
}// end ArraySum class

