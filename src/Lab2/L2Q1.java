/*
 *  Write a program that convert the temperature in degree Fahrenheit to degree Celsius. The program will display the degree Celsius in two decimal places.

Celsius = (Fahrenheit - 32) / 1.8

 */
package Lab2;

import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Fahrenheit: ");
        double Fahrenheit = s.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8;
        
        System.out.printf("\n%.2f°F = %.2f°C\n", Fahrenheit, Celsius);
    }
}
