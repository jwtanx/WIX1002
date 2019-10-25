/*
 * 4.	Write a program that asks the user to enter the number of food orders that he or she has purchased on GrabFood this month and displays the number of points awarded. 
GrabFood is a food delivery service that awards points to its customers based on the number of food ordered each month. The points are awarded as follows:
•	If a customer purchases 0 order, he or she earns 0 points.
•	If a customer purchases 1 order, he or she earns 5 points.
•	If a customer purchases 2 orders, he or she earns 15 points.
•	If a customer purchases 3 orders, he or she earns 30 points.
•	If a customer purchases 4 or more orders, he or she earns 60 points.
Modify the program: Enhance the program to allow the user to enter in N months which will keep a summary of all the points earned.
Enhance the program to keep track of a specified month and points displaying in a matrix.

 */
package Exercise.MidTerm2019;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("GrabFood Point Calculator");
        int purchases;
        
        System.out.print("How many months: ");
        int numberOfMonth = s.nextInt();
        int[] point = new int[numberOfMonth];
        int total = 0;
        
        System.out.println();
        
        for(int n = 0; n < numberOfMonth; n++){
            
            System.out.printf("Number of purchases in month %d: ", (n+1));
            purchases = s.nextInt();

            if(purchases == 0) point[n] = 0;
            else if(purchases == 1) point[n] = 5;
            else if(purchases == 2) point[n] = 15;
            else if(purchases == 3) point[n] = 30;
            else if(purchases >= 4) point[n] = 60;
            
        }
        
        System.out.println("\n>>SUMMARY<<");
        System.out.println("Month\tPoint(s)");
        for(int p = 0; p < point.length; p++){
            System.out.println((p+1) + "\t" + point[p]);
            total += point[p];
        }
        
        System.out.println("\nYour total point(s): " + total);
        
        int monthToDisplay;
        
        do{
            System.out.print("\nWhich month to display the point [-1 to quit]: ");
            monthToDisplay = s.nextInt();
            
            if(monthToDisplay > point.length){
                System.out.println("Month not found!");
                continue;
            }
            if(monthToDisplay == -1) break;
            
            System.out.printf("The point for %d month: %d\n", monthToDisplay, point[monthToDisplay - 1]);
            
        }while(monthToDisplay != -1);
        
        System.out.println("\nDone @ 251019, 10:45");
    }
}
