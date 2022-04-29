package comProjP2;
/**
* Overview: creation of main class CashRegister
* Input: date, item name, price, and quantity
* Output: invoice
* Plan:
* 1. Get the date from the user
* 2. Convert the month enter from int to string
* 3. Build switch for month string
* 4. Get name of item being purchased
* 5. Get the price
* 6. Get the quantity
* 7. Sum the array of shopping cart
* 8. Print out receipt 
*
* @version: 1.0 April 19, 2022
* @author: Jaye / Johnson
*/
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) 
	{
		// declaration of variables   
		char si;
		String Items[] =new String[100];
		float Unitprice[]=new float[100];
		int Quantitys[]=new int[100];
		String month=new String();
		int dd=0,mm=0,yy=0;
		// initialize the scanner class
		Scanner scan = new Scanner(System.in);
		int i=0;
		   
	    do{ // do once 0 means customer doesn't want to buy
		    if(i==0){
			    System.out.println("Date of purchase(dd mm yy):");
			    i=1;
			} // if they do want to buy start the program
	  		else
	  			System.out.println("Please enter date in this format (dd mm yy):");
				dd=scan.nextInt();
				mm=scan.nextInt();
				yy=scan.nextInt();
		}
	    while((0>=dd||dd>=31)||(mm<=1||mm>=12)||(yy<0));// while day :less than 31 but greater than 0, month: 1-12 only, year:
		int j=0;    
	    do{
		switch (mm) // creates a switch to for month integer input to convert to string output
		{
			case 1: // January
				month="JAN";
				break;
			case 2:// February
				month="FEB";
				break;
			case 3: // March
				month="MAR";
				break;
			case 4: // April
				month="APR";
				break;
			case 5: // May
				month="MAY";
				break;
			case 6: // June
				month="JUN";
				break;
			case 7: // July
				month="JUL";
				break;
			case 8: // August
				month="AUG";
			case 9: // September
				month="SEP";
				break;
			case 10: // October
				month="OCT";
				break;
			case 11: // November
				month="NOV";
				break;
			case 12: // December
				month="DEC";
				break;
			default:
		}
		String Item=new String();
		System.out.println("Enter the item name:");
		Item=scan.next();
		i=0;
		float Price=0;
		do{
		if(i==0)
		    { System.out.println("Enter the Unit Price:");i=1;}
		else
		System.out.println(" Please Enter valid Unit Price:");
		Price=scan.nextFloat();
		}while(Price<0);
		System.out.println("Enter the Quantity:");
		int Quantity=scan.nextInt();
		System.out.println("Do you want to continue(y/n):"); // y: keep shopping or n: get invoice
		si=scan.next().charAt(0);
		scan.close(); // end of scanner use
		
		//storing data in array
		  
		Items[j] =Item;
		Unitprice [j]=Price;
		Quantitys[j]=Quantity;
		j++;
	}
	    while(si=='y');
	    
	    
	  //generating invoice id 5 digit
	  int n=0;
	  n=(int)((Math.random()*9000)+10000);
	  int k=0;
	  float Total=0;
	  for(k=0;k<j;k++)
	  Total=Total+(Unitprice[k]*Quantitys[k]);
	  float Tax=(float)0.06*Total;
	
	//INVOICE
	  System.out.println("");
	  System.out.println("=====================================================================");
	  System.out.println(" Invoice # Invoide Date");
	  System.out.format(" "+n+"     "+month+"-"+dd+"-%02d",yy);
	  System.out.println();
	  System.out.println("=====================================================================");
	  System.out.println(" \\\\\\\\\\DESCRIPTION///// ");
	  System.out.println("=====================================================================");
	  System.out.println("Product Unitprice Quantity Cost");
	  System.out.println("=====================================================================");
	  for(k=0;k<j;k++){
	      System.out.print(Items[k]);
	      for(int h=0;h<18-Items[k].length();h++)
	          System.out.print(" ");
	      System.out.println("$"+Unitprice[k]+" "+Quantitys[k]+" "+"$"+Quantitys[k]*Unitprice[k]);
	     
	  }
	  System.out.println("=====================================================================");
	  System.out.println("***Come Again!!!***");
	  System.out.println();
	  System.out.format(" Subtotal:%5.2f",Total);
	  System.out.println();
	  System.out.format(" Tax:%5.2f",Tax);
	  System.out.println();
	  System.out.format(" Total:%5.2f",(Tax+Total));
}
}