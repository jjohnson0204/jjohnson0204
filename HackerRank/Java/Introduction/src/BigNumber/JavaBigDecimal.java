package BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        // create comparator as string
        Comparator<String> myComp = (o1, o2) -> {  // compares the 2 arguments for order
            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);
            return b.compareTo(a); // compare b to a
        };
        Arrays.sort(s,0,n,myComp); // (s, start 0 index, n, created comparator)
                                            // start from s 0 index n 0 index following comparator rule
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
