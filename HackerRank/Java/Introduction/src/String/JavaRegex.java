package String;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{

    String ipAddress ="(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    /*
     form= "A.B.C.D", range= 0-255, leading zeros allowed, length of A||B||C||D <=3
     \d = digits 0-9
     \\d{1,2} = only 1 or 2 digit numbers
     (0|1)\\d{2} = any 3 digit number starting with 0 or 1
     2[0-4]\\d = numbers between 200 and 249
     25[0-5] = numbers between 250 and 255.
    */
    public String pattern = ipAddress + "\\." + ipAddress + "\\." + ipAddress + "\\." + ipAddress;
}