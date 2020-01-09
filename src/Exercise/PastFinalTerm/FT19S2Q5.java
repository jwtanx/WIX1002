/*
 * 5. Define a class named QuadraticEquation for a quadratic equation ax² + bx + c = 0. The class contains: 
- private data fields a, b, and c that represent three coefficients. 
- a constructor with the arguments for a, b and c. 
- three get methods for a, b and c. 
- a method named Discriminant() that returns the discriminant which is b²-4ac. 
- methods named calcRoot1() and calcRoot2() that return r1 and r2, the two roots of the equation. [Hint : use Math.sqrt(n) to find the square root of n] 
                 _________                    _________
          -b + \/b² - 4ac              -b - \/b² - 4ac
    r1 = ------------------      r2 = ------------------
                 2a                           2a

The methods calcRoot1 and calcRoot2 are useful only if Discriminant is positive. Both methods will return 0 if Discriminant is negative

b) Write a tester program that creates the quadraticEquation object and prompts the user to enter values for a, b and c; and displays the answer based on Discriminant If Discriminant is positive, display the value of r1 and r2. If Discriminant is 0, display the root. Otherwise, display the message "the equation has no roots." 

Sample output: 
Enter values for a, b and c: 1 1 1 <enter> 
The equation is : 1x(^2) +(1) x + (1) 
Discriminant : -3 
The equation has no roots 

Enter values for a, b and C: 1 0 -1 <enter> 
The equation is : 1x(^2) + (0)x (-1) 
Discriminant : 4 
The roots : -1 and 1

Enter values for a, b and c : 1 2 1 <enter> 
The equation is: 1x(^2) + (2)x + (1) 
Discriminant : 0 
Same roots: -1

 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT19S2Q5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter values for a, b and c: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        System.out.printf("The equation is : %dx(^2) + (%d)x + (%d)\n", a, b, c);
        
        FT19S2Q5QuadraticEquation calc = new FT19S2Q5QuadraticEquation(a, b, c);
        
        System.out.println("Discriminant : " + calc.Discriminant());
        if(calc.Discriminant() > 0){
            System.out.println("The roots : " + calc.calcRoot1() + " and " + calc.calcRoot2());
        } else if (calc.Discriminant() == 0){
            System.out.println("Same roots : " + calc.calcRoot1());
        } else if (calc.Discriminant() < 0){
            System.out.println("The equation has no roots");
        }
    }
}
