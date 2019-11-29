
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
