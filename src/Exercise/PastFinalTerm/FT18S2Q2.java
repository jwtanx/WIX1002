/*
 * 2. Write a program that accepts from the user the unit weight of a bag of coffee in kilograms and the number of bags sold.
Display the tolal price of the sale after tax, computed as 

    totalPrice = unitWeight * numborOfBags * 5.99 
    totalPriceWithTax = totalPrice + totalPrice * 0.0725; 

where 5.99 is the cost per kilogram and 0.0725 is the sales tax.

Sample output 
Enter the number of bags sold: 32<enter> 
Enter the weight per bag (kilogram): 5<enter> 
Price per kilogram:     $5.99
Sales tax:              7.25%
Total price after tax:  $ 1027.88
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT18S2Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of bags sold: ");
        int numberOfBags = s.nextInt();
        
        System.out.print("Enter the weight per bag (kilogram): ");
        int unitWeight = s.nextInt();
        
        double totalPrice = unitWeight * numberOfBags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725; 
        
        System.out.println("Price per kilogram\t: $5.99");
        System.out.println("Sales tax\t\t: 7.25%");
        System.out.printf("Total price after tax\t: $%.2f\n", totalPriceWithTax);
        
    }
}
