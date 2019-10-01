/*
 * Write a program that asks users to enter the radius of a circle and a coordinate point
(x, y). Determine whether the point is inside or outside the circle centered at (0, 0).
 */
package Lab3;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class L3Q6 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        int r = s.nextInt();
        int x, y;
        double locus;
        
        s.nextLine();
        
        System.out.print("Enter your coordinate (x, y): ");
        
        /*
        String[] co = s.nextLine().split("\\W+");

        try{
            x = Integer.parseInt(co[0]);
            y = Integer.parseInt(co[1]);
            
            throw new ArrayIndexOutOfBoundsException();
            //throw new NumberFormatException();
            
        }catch(ArrayIndexOutOfBoundsException ai){
            
            x = Integer.parseInt(co[1]);
            y = Integer.parseInt(co[2]);
            
        }catch(NumberFormatException nf){
            x = Integer.parseInt(co[1]);
            y = Integer.parseInt(co[2]);    
        }
        */
        
        String[] co = s.nextLine().split("\\W+");       // <-- W to get all letters and numbers, w to get symbols
        
        // co[0] caught blank, hence start at co[1]
        x = Integer.parseInt(co[1]);
        y = Integer.parseInt(co[2]);

        locus = Math.sqrt(Math.pow((x - 0),2) + Math.pow((y - 0), 2));
        
        if (locus < r){
            System.out.printf("The point (%s, %s) is inside the circle centered at (0, 0).", co[1], co[2]);
        }else{
            System.out.printf("The point (%s, %s) is outside the circle centered at (0, 0).", co[1], co[2]);
        }
        
        System.out.println("\n\nDone on 1 Oct 2019, 7:29 A.M.");

    }
}
