/*
 * Write a program that accepts an integer n from user and then sum the following
series.

 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L4Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a value n: ");
        int n = s.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            
            System.out.print("(");
            
            for(int term = 1; term <= i; term++){
                
                if(term != i)
                    System.out.print(term + "+");
                else
                    System.out.print(term);
                
                sum += term;

            }
            
            if (i != n)
                System.out.print(") + ");
            else
                System.out.println(")");
        }   
        
        System.out.println("= " + sum);     
        
    }
}
