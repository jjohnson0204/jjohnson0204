package comProj7;
/**
* Overview: creation of demo class PolygonFun
* Input: n/a
* Output: n/a
* Plan:
* 1. Creation of PolygonFunDemo
* 2. Create new object Polygon1
* 3. Create new object Polygon2
* 4. Create new object Polygon3
* 5. User runs program
* 6. Display all 3 constructors and how they are being used
*
* @version: 1.0 March 21, 2022
* @author: Jaye / Johnson
*/
public class PolygonFunDemo {

	public static void main(String[] args) 
	{
		// creating three PolygonFun objects using three different constructors
		PolygonFun object1 = new PolygonFun(); // use of all default values
		PolygonFun object2 = new PolygonFun(20, 100); // given values for sides and sidesLength using default 0 x and y coordinates
		PolygonFun object3 = new PolygonFun(5, 10, 25, 50); // given value for all 4 
		// displays information for object 1		  
		System.out.println("Polygon 1:\n---------\nNumber of sides = " + object1.getSides() + "\n" 	//number of sides
		+ "Length of each side = " + String.format("%.2f", object1.getSideLength()) + " units\n"	//length of each side
		+ "Co-ordinates = [ " + String.format("%.2f", object1.getxCoordinate()) + ", "				//coordinates 
		+ String.format("%.2f", object1.getyCoordinate()) + " ]\n"									//perimeter
		+ "Perimeter = " + String.format("%.2f", object1.getPerimeter()) + " units\n"				//area
		+ "Area = " + String.format("%.2f", object1.getArea()) + " sq. units\n");
		// displays information for object 2  
		System.out.println("Polygon 2:\n---------\nNumber of sides = " + object2.getSides() + "\n"
		+ "Length of each side = " + String.format("%.2f", object2.getSideLength()) + " units\n"
		+ "Co-ordinates = [ " + String.format("%.2f", object2.getxCoordinate()) + ", " + String.format("%.2f", object2.getyCoordinate()) + " ]\n"
		+ "Perimeter = " + String.format("%.2f", object2.getPerimeter()) + " units\n"
		+ "Area = " + String.format("%.2f", object2.getArea()) + " sq. units\n");
		// displays information for object 3  
		System.out.println("Polygon 3:\n---------\nNumber of sides = " + object3.getSides() + "\n"
		+ "Length of each side = " + String.format("%.2f", object3.getSideLength()) + " units\n"
		+ "Co-ordinates = [ " + String.format("%.2f", object3.getxCoordinate()) + ", " + String.format("%.2f", object3.getyCoordinate()) + " ]\n"
		+ "Perimeter = " + String.format("%.2f", object3.getPerimeter()) + " units\n"
		+ "Area = " + String.format("%.2f", object3.getArea()) + " sq. units\n");
		}
}
