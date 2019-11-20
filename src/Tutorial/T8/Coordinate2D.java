/*
 * 3. Create a class that used to represent the 2 dimension coordinate system. The class consists of constructors, instance variables, accessor and mutator method and an output method that display the x-coordinate and y-coordinate. 
 */
package Tutorial.T8;

public class Coordinate2D {
    
    private int x, y;
    
    public Coordinate2D(){
        x = 0;
        y = 0;
    }
    
    public Coordinate2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate x : " + x + "\n" +
               "Coordinate y : " + y + "\n";
    }
}