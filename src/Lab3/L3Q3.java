/*
 * Write a program that calculates the total commission receives based on the table
below. The program will accept the sales volume and calculate the commission.
Display the commission in two decimal places.

Sales Volume                                            Commission
Less than or equal to 100                               5% of total sales
Greater than 100 and less than or equal to 500          7.5% of total sales
Greater than 500 and less than or equal to 1000         10% of total sales
Greater than 1000                                       12.5% of total sales

 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L3Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter sales volume: ");
        int vol = s.nextInt();
        double c;
        
        if(vol >= 0 && vol <= 100){
            c = vol * 5/100;
            System.out.printf("\n5%% commission of %d sales volume: %.2f\n", vol, c);
        }
        
        if(vol > 100 && vol <= 500){
            c = vol * 7.5/100;
            System.out.printf("7.5%% commission of %d sales volume: %.2f\n", vol, c);
        }
        
        if(vol > 500 && vol <= 1000){
            c = vol * 10/100;
            System.out.printf("10%% commission of %d sales volume: %.2f\n", vol, c);
        }
        
        if(vol > 1000){
            c = vol * 12.5/100;
            System.out.printf("12.5%% commission of %d sales volume: %.2f\n", vol, c);
        }
        
        System.out.println("\nDone on 30 Sept 2019, 10:03P.M.");
    }
}
