/*
 * 4. Write a Java method that implements Euclidean Algorithm to return the greatest common divisor of two positive integers. Then, write a program to get the GCD for (24, 8) and (200, 625).
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q4 {
   
    static int GCD(int a, int b){
        
        // Algorithm
        // GCD(a, b)
        // int quotient = a / b;
        // int remainder = a % b;
        // a = (b * quotient) + remainder
        // dividend = divisor * quotient + remainder
        
        int GCD, remainder;
        int dividend = a, divisor = b;
        
        do{
            remainder = dividend % divisor;
            if(remainder == 0) break;
            
            dividend = divisor;
            divisor = remainder;
            
        }while(remainder != 0);
        
        GCD = divisor;
        return GCD;
        
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("GCD(24, 8) = " + GCD(24, 8));
        System.out.println("GCD(200, 625) = " + GCD(200, 625));
        
        System.out.print("Type number for a & b separately GCD(a, b): ");
        int a = s.nextInt();
        int b = s.nextInt();
        
        System.out.printf("\nGCD(%d, %d) = %d", a, b, GCD(a,b));
        
        System.out.println("\n\nDone @ 211019, 10:09");
        
    }
}
