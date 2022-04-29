package comProj7;
/**
* Overview: creation of main class PolygonFun
* Input: n/a
* Output: n/a
* Plan:
* 1. Creation of PolygonFun class to be demo'd
* 2. Create Polygon constructor with default values
* 3. Create Polygon constructor with a user-specified number of sides and length of sides with the xCoordinate
		and yCoordinate set to 0.
* 4. Create Polygon constructor with user-specified number of sides, length of sides, xCoordinate and
		yCoordinate
* 5. Create getters and setters for sides, sideLength, xCoordinate, yCoordinate
* 6. Create to methods getPerimeter() and getArea with their formulas
*
* @version: 1.0 March 21, 2022
* @author: Jaye / Johnson
*/
public class PolygonFun 
{
	// declare variables
	int sides;
	double sideLength;
	double xCoordinate;
	double yCoordinate;
	// default value constructor
	public PolygonFun()
	{
		this.sides = 3;
		this.sideLength = 1;
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}
	// constructor with user sides and sideLenth and x/y set to 0 defaulted
	public PolygonFun(int sides, double sideLength)
	{
		this.sides = sides;
		this.sideLength = sideLength;
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}
	// constructor with all user input variables
	public PolygonFun(int sides, double sideLength, double xCoordinate, double yCoordinate)
	{
		this.sides = sides;
		this.sideLength = sideLength;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	//getters and setters
	// sides
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	// sideLength
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	// xCoordinate
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	// yCoordinate
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	//creation of methods getPerimeter and getArea
	public double getPerimeter() 
	{
		return sides * sideLength;
	}
	public double getArea() 
	{
		return (Math.pow(sideLength,2)*(sides))/(4 * 180)/ (Math.atan(sides));
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
