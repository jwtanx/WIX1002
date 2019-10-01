/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial;

/**
 *
 * @author User
 */

import java.util.Scanner;
import java.util.Random;

public class T4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        /*
        1. Write statements for each of the following
            a. Find the largest integer n so that n^3 is less than 2000.
            b. Display the square number of the first twelve integers starting from 1.
            c. Display a 4-by-5 matrix using random number within 0 to 100.
            d. Compute the sum of numbers from 1 to a given number.
            e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
        */
        
    // Q1A
        System.out.println("\nQuestion 1a");
        
        int n = 0;
        
        while((Math.pow(n, 3)) <= 2000){
            n++;
        }
        
        if(Math.pow(n, 3) <= 2000){
            System.out.println("Largest integer n so that n^3 is less than 2000: " + n);
        }else{
            n--;
            System.out.println("Largest integer n so that n^3 is less than 2000: " + n);
        }
        
        
    // Q1B
        System.out.println("\nQuestion 1b");
        int terms;
        
        for(int i = 1; i <= 12; i++){
            terms = (int) Math.pow(i, 2);
            System.out.printf("%d^2 = %d\n", i, terms);
        }
        
    // Q1C
        System.out.println("\nQuestion 1c");
        
        System.out.print("/");
        for(int t = 1; t <= 20; t++){
            
            if(t % 4 == 0 && t != 4 && t != 16 && t != 20){
                System.out.printf("%2d|\n|", r.nextInt(101));
            }
            else if(t == 4){
                System.out.printf("%2d\\\n|", r.nextInt(101));
            }
            else if(t == 16){
                System.out.printf("%2d|\n\\", r.nextInt(101));
            }
            else if(t == 20){
                System.out.printf("%2d/", r.nextInt(101));
            }
            else{
                System.out.printf("%2d\t", r.nextInt(101));
            }
            
        }
        
    // Q1D    
        System.out.println("\n\nQuestion 1d");

        System.out.print("Enter a number(n) so that sum = addition from 1 to n: ");
        int num = s.nextInt();
        int sum = 0;
        
        for(int a = 1; a <= num; a++){
            sum += a;
            if(a == num){
                System.out.printf("%d", a);
            }else{
                System.out.printf("%d + ", a);
            }
            
        }
        System.out.println(" = " + sum);
    }
}
