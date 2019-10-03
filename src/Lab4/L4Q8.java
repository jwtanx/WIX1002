/*
 * Write a program that generates the first n prime number. n is an random integer
within 0 to 100
 */
package Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author User
 */
public class L4Q8 {
    
    static Random r = new Random();
    
    static int n = r.nextInt(101);
    
    static boolean isPrime(int n) 
    { 
        
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 
      
    /* Driver program  */
    public static void main(String[] args)  
    { 
        List<Integer> li = new ArrayList<>();
        
        
        for(int c = 0; li.size() <= n; c++){
            if(isPrime(c))  
                //System.out.printf("[%d] ", c) ;
                li.add(c);
        }

        System.out.println("The random number n: " + n);
        
        System.out.print("The prime numbers are: " + li);
        System.out.println();
        
    } 
} 

