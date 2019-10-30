/*
 * 2. Write a Java program that reads integers input from the user. The program should display all the integers from 1 to 9 where the input ends with number -1. The program will display the minimum number and the occurrence count for the minimum number.
 */
package Exercise.PastMidTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MT16Q2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Integer (-1 to quit): ");
        int num = s.nextInt();
        System.out.print(num + " ");
        int min = num;
        int count = 1;
        
        while(num != -1){
            num = s.nextInt();
            if(num == -1) break;
            
            else if(num > 0 && num <= 9){
                System.out.print(num + " ");
                
                if(num < min) {
                    min = num;
                    count = 1;
                } else if (num == min) {
                    count++;
                }
            } 
        }
        System.out.println("\nThe minimun number is " + min);
        System.out.println("The occurence count of " + min + " is " + count);
        
        System.out.println("\nDone @ 301019, 22:00");
    }
}
