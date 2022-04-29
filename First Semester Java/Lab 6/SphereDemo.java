package comProj6;

import java.util.Scanner;
//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: creation of the driver sphere class for demo
* Input: user enters 3 integers for 3 spheres
* Output: display the volume and surface area of 3 spheres
* Plan:
* 1. User runs the program
* 2. Have user inputs 3 radius integers
* 3. Once input is entered the console will display the volume and surface area for 3 spheres
*
* @version: 1.0 March 15, 2022
* @author: Jaye / Johnson
*/
public class SphereDemo
{
	public static void main(String[] args) 
	{
		// setup scanner for user input
		Scanner sc = new Scanner(System.in);
        // creation of object Sphere 1
        System.out.print("Enter Radius 1: ");
        double r1= sc.nextDouble();
        String ID1="s0";           
        Sphere s0 = new Sphere(ID1,r1);
        // creation of object Sphere 2
        System.out.print("\nEnter Radius 2: ");
        double r2= sc.nextDouble();
        String ID2="s2";
        Sphere s2 = new Sphere(ID2,r2);
        // creation of object Sphere 3
        System.out.print("\nEnter Radius 3: ");
        double r3= sc.nextDouble();
        String ID3="s3";
        Sphere s3 = new Sphere(ID3,r3);
        System.out.println("\n");
        // displaying Objects details for sphere s0, s2 and s3
        System.out.println("Here are the volumes and surface areas for each of the 3 Spheres\n");
        System.out.println("Sphere 1 (Volume: " + s0.Volume()+" & Surface Area: "+s0.SurfaceArea()+")");
        System.out.println("Sphere 2 (Volume: " + s2.Volume()+" & Surface Area: "+s2.SurfaceArea()+")");
        System.out.println("Sphere 3 (Volume: " + s3.Volume()+" & Surface Area: "+s3.SurfaceArea()+")\n\n");
        sc.close();	
	}
}
