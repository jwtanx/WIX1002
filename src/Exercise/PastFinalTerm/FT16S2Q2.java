/*
 * 2. Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14. 
Sample output. 
Enter a number between 0 and 1000: 932
The sum of the digits is 14
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT16S2Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int num = s.nextInt();
        
        int sum = 0;
        
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("The sum of the digits is " + sum);
        
    }
}
