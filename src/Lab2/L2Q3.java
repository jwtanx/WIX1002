/*
 * Write a program that generates three random numbers. The range of the random
number is 10 to 50. Display the three numbers, sum of the numbers and the average in
two decimal places
 */
package Lab2;

import java.util.Scanner;
import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r  = new Random();
        
        int num, k = 3;
        double sum = 0, average;
        
        int gen[] = new int[k];
        
        for(int c = 0; c < k; c++){
            
            num = 11 + r.nextInt(40);
            
            gen[c] = num;
            
            sum += num;
            
        }
        
        average = sum / k;
        
        System.out.print("Generated number: ");
        
        for(int i = 0; i <= k - 2; i ++){
            System.out.print(gen[i] + ", ");
        }
        System.out.println(gen[k - 1]);
        
        System.out.printf("Sum: %.1f\n", sum);
        
        System.out.printf("Average: %.2f\n", average);
        
        
    }
}
