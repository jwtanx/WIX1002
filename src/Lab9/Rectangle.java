package Lab9;

import java.util.Scanner;

public class Rectangle extends Shape{
    
    private double width, length;
    
    public Rectangle(){
        super("Rectangle");
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Width: ");
        width = s.nextDouble();
        System.out.print("Length: ");
        length = s.nextDouble();
    }
    
    //  perimeter and area in Shape Class is in protected in order to use
    public void compute() {
        perimeter = 2 * (width+length);
        area = width*length;
    }  
    
}
