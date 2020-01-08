/*
 * 4a. Define a class named LinearEquation for a 2 x 2 system of linear equations:

ax + by = e
cx + dy = f

where   x = (ed - bf) / (ad - bc);
        y = (af - ec) / (ad - bc);

The class contains: 
- private data fields a, b, c, d, e, and f. 
- a constructor with the arguments for a, b, c, d, e, and f. 
- a method named toString() that returns the 2x2 linear equation. 
- a method named isSolvable() that returns true if ad - bc is not 0.
- methods namned computeX() and computeY() that returns the values for x and y as the solution for the equation.

b. Create a Q4Main class to test the program. It prompts the user to enter the values for a, b, c, d, e, and f as well as create a LinearEquation object. Display the linear equation. Depending on the values of ad-bc, compute and display the values for x and y or display the message 'the equation has no solution'. 

Sample output: 
Enter the values for a, b, c, d, e and f: 1 2 1 3 4 3<enter> 
The equation: 
1x + 2y = 4 
1x + 3y = 3 
x = 6 ; y = -1
*/
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT18S2Q4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("ax + by = e\ncx + dy = f");
        
        System.out.print("Enter the values for a, b, c, d, e and f: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        
        FT18S2Q4LinearEquation LinearEquation = new FT18S2Q4LinearEquation(a, b, c, d, e, f);
        System.out.println("The equation:");
        System.out.println(LinearEquation.toString());
        
        if(LinearEquation.isSolvable()){
            System.out.printf("x = %d ; y = %d\n", LinearEquation.computeX(), LinearEquation.computeY());
        } else {
            System.out.println("The equation has no solution.");
        }
        
    }
}
