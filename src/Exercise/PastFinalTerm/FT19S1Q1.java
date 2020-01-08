/*
 * 1
 */
package Exercise.PastFinalTerm;

import java.util.Random;
public class FT19S1Q1 {
    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers. The random numbers must be from 0 - 100");
    int num, odd = 0, even = 0; 
    Random r = new Random(); // 1 
    
    for (int i = 1; i <= 10 ; i++) { // 2, 9, 10
        num = r.nextInt(101); // 8 
        System.out.print(num + " ");
        
        if (isEven(num)) {
            ++odd;
        } else {
            ++even;
        }    
    }
    System.out.println("\nNumber of odd number: " + odd); 
    
    System.out.println("Number of even number: " + even); // 3 
    }
    public static boolean isEven(int a) { // 4, 5
        if (a % 2 == 0) // 6, 7
            return true;
        else 
            return false;
    } 
}
