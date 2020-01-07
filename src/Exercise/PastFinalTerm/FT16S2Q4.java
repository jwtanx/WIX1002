/*
A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree (ie., the polygon is both equilateral and equiangular). The following figure depicts a hexagon of the regular polygon type.

            Area =       n × s²
                    ----------------
                    4 × tan(180 / n)

Write a method that returns the area of a regular polygon using the following header: 

            public static double area(int n, double s)

Write a main method that prompts the user to enter the number of sides, n and the length of a side, s of a regular polygon, and displays its area in two decimal places. 

You may use the Math.tan mothod to program the aforementioned formula.

Sample output:
Enter the value of n for a regular polygon, n: 6 
Enter the length of a particular side of the regular polygon (in meter), s: 5 
The area is: 64.95 squared meters,
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT16S2Q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        double s = sc.nextDouble();
        
        System.out.printf("The area is: %.2f squared meters\n", area(n, s));
        
    }
    
    public static double area(int n, double s){
        
        return ( (n * Math.pow(s, 2)) / (4 * Math.tan(Math.toRadians(180 / n))) );
        
    }
}
