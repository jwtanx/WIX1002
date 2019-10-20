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

    static int triNum(int n){
        
        int triangularNum = 0;
        
        for(int c = 1; c <= n; c++) triangularNum += c;
        
        return triangularNum;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter value for n to find its triangular number: ");
        int n = s.nextInt();
        
        for(int c = 1; c <= n; c++){
            if(c == n)System.out.print(c);
            else System.out.print(c + " + ");
        }
        
        System.out.printf(" = %d\n\n", triNum(n));
        
        System.out.println("Done @ 211019, 07:43");
        
    }
}
