/*
 * 3. Create a class that used to represent the 2 dimension coordinate system. The class consists of constructors, instance variables, accessor and mutator method and an output method that display the x-coordinate and y-coordinate. 
 */
package Tutorial.T8;

public class Coordinate2DTesterClass {
    public static void main(String[] args) {
        
        Coordinate2D a = new Coordinate2D();
        
        // Using setX and setY
        a.setX(5);
        a.setY(10);
        System.out.println(a.toString());
        
        // Using constructor with argument
        a = new Coordinate2D(1, 2);
        System.out.println(a.toString());
        
        System.out.println("\nDone @ 201119, 21:31");
    }
}
