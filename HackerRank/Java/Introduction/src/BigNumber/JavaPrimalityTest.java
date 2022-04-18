package BigNumber;


import java.io.IOException;
import java.util.Scanner;

public class JavaPrimalityTest {

    public static void main(String[] args) throws IOException {
        // changed from buffer to scanner class
        Scanner scanner = new Scanner(System.in);
        // if BigInteger is
        System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        scanner.close();
    }

    /* - first pass using the BufferReader
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        boolean result;
        BigInteger a = new BigInteger(n);
        result = a.isProbablePrime(100);
        if(result){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
     */
}
