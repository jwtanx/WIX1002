/*
 * 1. Correct the errors
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT20S1Q1 {
    public static void main(String[] args) {
        
        System.out.println("This program changes all the odd numbers in the array into even numbers.");
        
        Scanner s = new Scanner(System.in); // 1
        
        int size = 5;
        int num[] = new int[size]; // 2
        System.out.print("Enter five integer numbers : ");
        
        for(int i = 0; i < size; i++){ // 3
            num[i] = s.nextInt(); // 4
        }
        
        convert(num); // 5
        
        System.out.print("The numbers are : ");
        
        for(int i = 0; i < size; i++){
            System.out.print(num[i] + " "); // 6
        }
        System.out.println();
        
    }
    
    public static void convert(int[] a){ // 7
        
        for(int i = 0; i < a.length; i++){ // 8
            if(a[i] % 2 == 1){ // 9
                a[i] += 1; // 10
            }
        }
        
    }
    
}
