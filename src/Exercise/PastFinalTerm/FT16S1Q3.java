/*
Write a program to generate n random integers within 0 - 1000 and store the integers in an array. Then, create FOUR methods to perform the following actions.
- Display each of the integers in the array.
- Display the maximum number.
- Round each of the integer to the nearest tenth and display.
- Display each of the integer in reverse in the array.

Sample:
Enter the number of the random integer: 6
The random integer : 594 353 875 250 95 511
Maximum Number : 875
The approximation of the integer to the nearest tenth : 590 350 880 250 100 510
The random integer in reverse order: 495 353 578 52 59 115

 */
package Exercise.PastFinalTerm;

import java.util.Random;
import java.util.Scanner;

public class FT16S1Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter the number of the random integer : ");
        int n = s.nextInt();
        
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){
            array[i] = r.nextInt(1001);
        }
        
        System.out.print("The random integer : ");
        
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        
        int max = 0;
        
        for(int i = 0; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        
        System.out.print("\nMaximum Number : " + max);
        
        System.out.print("\nThe approximation of the integer to the nearest tenth : ");
        
        for(int i = 0; i < n; i++){
            
            if(array[i] % 10 > 4){
                System.out.print((((array[i] / 10) + 1) * 10) + " ");
            } else {
                System.out.print(((array[i] / 10) * 10) + " ");
            }
        }
        
        System.out.print("\nThe random integer in reverse order : ");
        
        int[] reverse = new int[n];
        
        for(int i = 0; i < n; i++){
            
            int temp = array[i];
            
            while(temp > 0){
                
                reverse[i] = (reverse[i]*10) + (temp % 10);
                temp /= 10;
                
            }
            
            System.out.print(reverse[i] + " ");
        }
        
        System.out.println();
    }
}
