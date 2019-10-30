/*
 * 3. Write a program that asks a user to enter an integer value, n. Based on this integer value, the program should generate a set of random values within the range of 0-10000. Store these values in an array. Then, create FOUR methods to perform the following actions. 
- Display the set of integers in the array. 
- Get the minimum number. 
- Display the approximation of each integer value to the nearest hundred.  
- Display each integer in the array in a reverse order.

 */
package Exercise.PastFinalTerm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT17Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter the number of random integers : ");
        int n = s.nextInt();
        int[] randnum = new int[n];
        int min;
        int temp;
        
        for(int i = 0; i < n; i++){    
            randnum[i] = r.nextInt(10001);    
        }
        
        min = randnum[0];
        
        // Display the set of integers in the array.
        for(int num : randnum) System.out.print(num + "  ");
        
        // Find the min num.
        for(int i = 0; i < n; i++){
           if(randnum[i] < min) min = randnum[i];
        }
        System.out.print("\nMinimum Number : " + min);
        
        // Displaying appox number to the nearest hundred
        System.out.print("\nThe approximation of the intger to the nearest hundred : ");
        for(int i = 0; i < n; i++){
            
            temp = randnum[i];
            
            temp /= 100;
            temp *= 100;
            
            System.out.print(temp + "  ");
        }
        
        // Display each integer in the array in a reverse order.
        int reversed;
        int digit;
        System.out.print("\nThe random integer in reversed order : ");
        
        for(int i = 0; i < n; i++){
            
            temp = randnum[i];
            reversed = 0;
            
            while(temp > 0){        // OR while(temp != 1)
                
                digit = temp % 10;
                reversed = (reversed * 10) +  digit;
                temp /= 10;
                if (reversed == 0) System.out.print("0");
                
            }
            
            System.out.print(reversed + "  ");
        }
        
        System.out.println("\n\nDone @ 311019, 00:50");
        
    }
}
