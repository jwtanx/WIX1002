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
        
        int[][] matrix = new int[4][5];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = r.nextInt(101);
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        /*
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
        */
        
    // Q1D    
        System.out.println("\n\nQuestion 1d");

        System.out.print("Enter a number(n) so that sum = addition from 1 to n: ");
        //int num = s.nextInt();
        int num = 1 + r.nextInt(10);
        System.out.println(num);
        int sum = 0;
        
        System.out.println();
        
        for(int a = 1; a <= num; a++){
            sum += a;
            if(a == num){
                System.out.printf("%d", a);
            }else{
                System.out.printf("%d + ", a);
            }
            
        }
        System.out.println(" = " + sum);
        
    // Q1E
        System.out.println("\nQuestion 1e");
        
        int e1 = 1;
        int e2 = 25;
        double esum = 0;
        
        //FOR LOOP
        for(e1 = 1, e2 = 25; e1 <= 25; e1++, e2--){
            
            if (e1 == 25){
                esum += e1/(e2*1.0);
                break;
            }
            
            System.out.printf("%d/%d + ", e1, e2);
            esum += e1/(e2*1.0);
        }
        
        /* WHILE LOOP
        while(e1 <= 25 && e2 >= 1){
            System.out.printf("%d/%d + ", e1, e2);
            esum += e1/(e2*1.0);
            e1++;
            e2--;
            
            if (e1 == 25){
                esum += e1/(e2*1.0);
                break;
            }
        }
        */
        System.out.printf("%d/%d\n", e1, e2);
        System.out.printf("= %.2f\n", esum);
        
    // 2. Correct the error for the following statements
    
    // Q2A
        System.out.println("\nQuestion 2a");    
    
        sum = 0;
        for (int x = 0; x <= 10; x++){
            sum += x;
        }
        System.out.println("The sum: " + sum);
        
    // Q2B
        System.out.println("\nQuestion 2b"); 
        
        int x = 0;
        int y = 0;
        
        do{
            x += 2;
            y += x;
            System.out.println(x + " and " + y);
            
        }while (x < 100);

    // Q2C
        System.out.println("\nQuestion 2c");
        
        for (x = 1, y = 20; x < y; x++, y-=2){
            System.out.println(x + " " + y);
        }
        
    // Q2D
        System.out.println("\nQuestion 2d");

        int i = 1;
        
        while(i < 10){
            
            System.out.println(i);
            i++;
            
            if (i==10)
                System.out.println("Program End");
        }
        
    // 3. Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1,            fn = fn-1 + fn-2.

        System.out.println("\nQuestion 3");
        
        System.out.print("Enter fibonacci numbers: ");
        int fn = s.nextInt();
        s.nextLine();
        
        int[] fib = new int[fn];
        
        fib[0] = 1; fib[1] = 1;
        
        for(int c = 2; c < fib.length; c++){
            fib[c] = fib[c-1] + fib[c-2];
        }
        
        for(int fibonacci : fib){
            System.out.print(fibonacci + ", ");
        }
        
        /*
        int[] f = new int[11];
        
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        
        System.out.print(f[1] + ", " + f[2] + ", ");
        
        for(int c = 3; c <= 10; c++){
            f[c] = f[c-1] + f[c-2];
            
            if(c != 10){
                System.out.print(f[c] + ", ");
            }else{
                System.out.println(f[c]);
            }
        }
        */
        
    // 4. Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
        
        System.out.println("\n\nQuestion 4");
        
        System.out.print("Enter a sentence to reverse it: ");
        String sentence = s.nextLine();
        
        for(int count = 0; count < sentence.length(); count++){
            System.out.print(sentence.charAt(sentence.length() - count - 1));
        }
        
        /* USELESS VERSION
        System.out.print("Enter a sentence to reverse it: ");
        String b4sentence = s.nextLine();
        String[] sentence = b4sentence.split("");
        String[] reverse = new String[sentence.length];
        String temp4 = "";
        
        
        int first, last;

        for(first = 0, last = b4sentence.length() - 1; first < b4sentence.length(); first++, last--){
            temp4 = sentence[first];
            reverse[first] = sentence[last];
            reverse[last] = temp4;
        }
        
        System.out.print("Reversed of the string: ");
        
        for(int count = 0; count < b4sentence.length(); count++){
            System.out.print(reverse[count]);
        }
        */
        System.out.println("\n\nDone @ 011019, 16:29");
    }
}
