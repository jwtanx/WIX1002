/*
 * 1.	Write a program that calculates and displays a person's body mass index (BMI). A person's BMI is calculated with the following formula: BMI = weight x 703 / height ^ 2. Where weight is measured in pounds and height is measured in inches. Display a message indicating whether the person has optimal weight, is underweight, or is overweight. A person's weight is considered optimal if his or her BMI is between 18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI value is greater than 25, the person is considered overweight.
 */
package Exercise.MidTerm2019;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q1 {
    public static void main(String[] args) {
        
        // BMI = weight x 703 / height ^ 2
        Scanner s = new Scanner(System.in);
        
        System.out.println("BMI Calculator v1.0");
        System.out.print("Enter your weight in pounds: ");
        double weight = s.nextDouble();
        
        System.out.print("Enter your height in inches: ");
        double height = s.nextDouble();
        
        System.out.println("\nCalculating your BMI...");
        double BMI = weight * 703 / Math.pow(height, 2);
        
        System.out.printf("BMI value: %.2f\n\n", BMI);
        
        if(BMI < 18.5) System.out.println("You are underweight. EAT MORE!");
        else if(BMI > 25) System.out.println("You are overweight. EXERCISE MORE!");
        else System.out.println("You BMI is optimal.");
        
        System.out.println("Done @ 251019, 09:25");
    }
}
