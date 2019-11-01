/*
 * 1. Write a Java method that returns a triangular number. A triangular number is defined as 1+2+3+…+ n. Then, write a Java program to use the method to display the first 20 triangular numbers.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author User
 */

public class L6Q1 {

    public static int triNum(int n){
        
        int triangularNum = 0;
        
        for(int c = 1; c <= n; c++) triangularNum += c;
        
        return triangularNum;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter value for n such that n is the number of triangular numbers (Question wants n = 20): ");
        int n = s.nextInt();
        
        System.out.print("The triangular numbers are: ");
        for(int i = 1; i <= n; i++){
            if(i == n) System.out.printf("%d\n", triNum(i));
            else System.out.printf("%d, ", triNum(i));
        }
        
        for(int i = 1; i <= n; i++){
            System.out.printf("%d = ", triNum(i));
            
            for(int c = 1; c <= i; c++){
                if(c == i)System.out.println(c);
                else System.out.print(c + " + ");
            }
            
        }
        
        System.out.println("\nDone @ 211019, 07:43");
        
    }
}
