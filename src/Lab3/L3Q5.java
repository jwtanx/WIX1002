/*
 * Cramer’s rule is used to solve the linear equations.
        ax + by = e, cx + dy = f;
        
        x = (ed-bf)/(ad-bc) 
        y = (af-ec)/(ad-bc)

Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x
and y. If ad – bc is equal to 0. Display "The equation has no solution"

 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L3Q5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Cramer’s rule is used to solve the linear equations.\n" +
"        ax + by = e, cx + dy = f;\n" +
"        \n" +
"        x = (ed-bf)/(ad-bc) \n" +
"        y = (af-ec)/(ad-bc)");
        
        System.out.print("\nEnter value for 'a': ");
        int a = s.nextInt();
        
        System.out.print("\nEnter value for 'b': ");
        int b = s.nextInt();
        
        System.out.print("\nEnter value for 'c': ");
        int c = s.nextInt();
        
        System.out.print("\nEnter value for 'd': ");
        int d = s.nextInt();
        
        System.out.print("\nEnter value for 'e': ");
        int e = s.nextInt();
        
        System.out.print("\nEnter value for 'f': ");
        int f = s.nextInt();
        
        try{
            
            if(((a*d) - (b*c)) == 0 ){
                throw new ArithmeticException();
            }else{
                double x = ((e*d) - (b*f))/((a*d) - (b*c)); 
                double y = ((a*f) - (e*c))/((a*d) - (b*c));
                
                System.out.printf("x = %.2f\ny = %.2f\n", x, y);
            }
            
        }catch (ArithmeticException ae){
            System.out.println("The equation has no solution.");
        }
        
        System.out.println("\nDone on 30 Sept 2019, 11:22P.M.");
        
    }
}
