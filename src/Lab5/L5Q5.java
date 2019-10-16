/*
 * 5. Write a program that generates 20 random integers within the range from 0 to 100. Sort the array in descending order. Then,accepts an integer input from the user. Then, search the array using this number. Compare the performance of linear search and binary search. 
 */
package Lab5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L5Q5 {
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        int[] num = new int[20];
        int temp;
        
        for(int i = 0; i < num.length; i++) num[i] = r.nextInt(101);
        
        //Arrays.sort(num);
        System.out.print("The generated number before sorted:\n");
        
        for(int n : num) System.out.print(n + " ");
        
        for(int a = 0; a < num.length; a++){
            for(int j = a + 1; j < num.length; j++){
                if(num[a] < num[j]){
                    temp = num[a];
                    num[a] = num[j];
                    num[j] = temp;
                }
            }
        }
        
        System.out.println("\n\nAfter sorted with descending order:");
        for(int n : num) System.out.print(n + " ");

        System.out.print("\n\nEnter an integer to find: ");
        int num2find = s.nextInt();
        
        // Linear search
        for(int c = 0; c < num.length; c++){
            if(num2find == num[c]){
                System.out.printf("%d found\nLinear Search - %d loop(s)\n", num2find, c+1);
                break;
            }
            else if(c == num.length-1 && num2find != num[c]){
                System.out.printf("\n%d not found using linear search.\n", num2find);
            }
        }
        
        // Binary search
        int loop = 0, low = 0, high = num.length-1, middle;
        boolean found = false;
        //Arrays.sort(num);
        
        while(low <= high){
            middle = (high + low) / 2;
            loop++;
            
            if(num2find == num[middle]) {
                found = true;
                break;
            }
            else if(num2find < num[middle]) low = middle + 1;
            else if(num2find > num[middle]) high = middle - 1;
            
        }
        
        System.out.printf(found ? "\n%d found\nBinary Search - %d loop(s)" : "\n%d not found using binary search.", num2find, loop, num2find);
        
        System.out.println("\n\nDone @ 161019, 22:18");
    }
}
