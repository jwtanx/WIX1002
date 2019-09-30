/*
 * Write a program that generates one random number. The range of the random number is 0 to 10000. Display the number and the sum of all the digits in the number
 */
package Lab2;

import java.util.Random;
public class L2Q5 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int num = r.nextInt(10001);
        
        System.out.println("Generated number: " + num);
        
        int sum = 0;
        
        while(num >= 1){
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Sum of each digits of the generated num: " + sum);
        
    }
}
