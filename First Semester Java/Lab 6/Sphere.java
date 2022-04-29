package comProj6;

//Jaye Johnson [jo1103776@email.ccbcmd.edu]
/**
* Overview: creation of main class Sphere
* Input: n/a
* Output: n/a
* Plan:
* 1. Creation of Sphere class to be demo'd
* 2. Sphere constructor built with instant variables id and radius to force encapsulation
* 3. Create getters and setters for id and radius
* 4. Create to methods volume and surface area with their formulas
* 5. Create a toString for id and radius 
*
* @version: 1.0 March 15, 2022
* @author: Jaye / Johnson
*/
public class Sphere 
{
	// declaring variables
    private String id;
    private double radius;
    // constructor sphere with id and radius encapsulated 
    public Sphere(String id, double radius) {
        this.id = id;
        this.radius = radius;
    }
    // creation of surface area method and formula
    public double SurfaceArea() {
        return 4*Math.PI * radius * radius; // A=4πr2 formula in its natural state
    }
    // creation of volume method and formula
    public double Volume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius; // V=4/3πr3 formula in its natural state
    }
    // setup the toString with id and radius
    @Override
    public String toString() {
        return "ID: " + id + ", Radius: " + radius;
    }
    // getters and setters for id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    // getters and setters for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}