/*
Write a program to calculate the monthly payment for car loan. The following are the inputs of the program. Output the monthly payment in two decimal places.

P The price of the car
D Down payment
R Interest Rate in %
Y Loan duration in year
M Monthly Payment
M = (P – D) * (1 + R*Y/100) / (Y *12)

 */
package Lab2;

import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double P, D, R, Y, M;
        
        System.out.print("\nCar price: $");
        P = s.nextDouble();
        
        System.out.print("\nDown payment: $");
        D = s.nextDouble();
        
        System.out.print("\nInterest rate(%): ");
        R = s.nextDouble();
        
        System.out.print("\nLoan Duration in a year: ");
        Y = s.nextInt();
        
        M = (P - D) * (1 + R*Y/100) / (Y *12);
        
        System.out.printf("\nYour monthly payment: $%.2f\n", M);
        
    }
}
