/*
1. Define a class Shape. The class has a name, perimeter and area. The class has the accessor method and mutator for perimeter and area. Besides, the class also has a display method to display the name of the shape, perimeter and area in two decimal points. Derived a class name Rectangle from Shape. The class has the extra side length variables. The class has a method to accept input for both side length and a method to compute the perimeter and area.  Derived another class name Square from Shape.  The class has the extra side length variable. The class has a method to accept input for side length and a method to compute the perimeter and area.  Derived another class name Circle from Shape. The class has the extra diameter variable.    The class has a method to accept input for diameter and a method to compute the perimeter and area. Create a Tester class to test the program. 
*/
package Lab9;

import java.text.DecimalFormat;

public class Q1Shape {
    
    private String name;
    protected double perimeter, area;
    
    public Q1Shape(String name){
        this.name = name;
    }
    
    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

//    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("######.##");
        return "\nName = " + name + "\nPerimeter = " + df.format(perimeter) + "\nArea = " + df.format(area);
    }
    
    public void display(){
        System.out.printf("Shape: %s\nPerimeter: %.2f\nArea: %.2f\n", name, perimeter, area); 
    }
    
}
