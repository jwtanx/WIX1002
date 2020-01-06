/*
1. Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a sample run: 
Sample output. 
Enter a number in pounds 55.5 
55.5 pounds is 25.197 kilograms
*/
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT16S2Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number in pounds ");
        double pound = s.nextDouble();
        
        double kg = pound * 0.454;
        System.out.println(pound + " pounds is " + kg + " kilograms");
        
    }
}
