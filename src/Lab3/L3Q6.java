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
        double r = s.nextDouble();
        s.nextLine();
        int x, y, x1, y1;
        double locus;
        
        System.out.print("Enter center coordinate (x, y): ");
        String[] cco = s.nextLine().split("\\W+");       // <-- W to get all letters and numbers, w to get symbols
        // cco[0] caught blank, hence start at co[1]
        x = Integer.parseInt(cco[1]);
        y = Integer.parseInt(cco[2]);
        
        System.out.print("Enter your coordinate (x, y): ");
        String[] co = s.nextLine().split("\\W+");       // <-- W to get all letters and numbers, w to get symbols
        // co[0] caught blank, hence start at co[1]
        x1 = Integer.parseInt(co[1]);
        y1 = Integer.parseInt(co[2]);

        locus = Math.sqrt(Math.pow((x - x1),2) + Math.pow((y - y1), 2));

        if (locus < r){
            System.out.printf("The point (%s, %s) is inside the circle centered at (%d, %d).", x1, y1, x, y);
        }else{
            System.out.printf("The point (%s, %s) is outside the circle centered at (%d, %d).", x1, y1, x, y);
        }
/*        
===============
    SPHERE
===============
*/
        System.out.print("\n\nEnter the radius of the sphere: ");
        double sRadius = s.nextDouble();
        s.nextLine();
        double distance;
        
        System.out.print("Enter the center coordinate of the sphere (x, y, z): ");
        String[] centerCo = s.nextLine().split("\\W+");
        int scX = Integer.parseInt(centerCo[1]);
        int scY = Integer.parseInt(centerCo[2]);
        int scZ = Integer.parseInt(centerCo[3]);
        
        System.out.print("Enter the coordinate of a point (x, y, z): ");
        String[] sCo = s.nextLine().split("\\W+");
        int sX = Integer.parseInt(sCo[1]);
        int sY = Integer.parseInt(sCo[2]);
        int sZ = Integer.parseInt(sCo[3]);
        
        distance = Math.sqrt(Math.pow((sX-scX), 2) + Math.pow((sY-scY), 2) + Math.pow((sZ-scZ), 2));
        
        if(distance < sRadius){
            System.out.printf("The point (%d, %d, %d) is inside the sphere centered at (%d, %d, %d).", sX, sY, sZ, scX, scY, scZ);
        }else{
            System.out.printf("The point (%d, %d, %d) is outside the sphere centered at (%d, %d, %d).", sX, sY, sZ, scX, scY, scZ);
        }
        
        System.out.println("\n\nDone on 1 Oct 2019, 7:29 A.M.");
        System.out.println("Updated on 4 Oct 2019, 9:48 P.M.");

    }
}

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