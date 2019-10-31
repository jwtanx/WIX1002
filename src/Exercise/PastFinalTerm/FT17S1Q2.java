/*
 * 2. (Financial application. Computing future tuition fee).
Write a program containing a method, computeFee, to compute the tuition fee for a particular year.
The method accepts both the initial tuition fee, and the rate of increment every year.
The method also accepts the year in which a particular tuition fee is to be determined.
Use repetition in your code. Get the values of the initial tuition fee, rate of increment and the year within your main method before passing it as arguments to computeFee. This method will return the computed tuition fee to the main method.

Sample output
Enter the initial tuition fee (i.e year 1): 100
Enter the yearly rate of increment (e g enter 5.2 for 5.2%): 5.2
Enter the year for which you wish to compute the tuition fee for: 3
Computed tuition fee for year 3 is 110.25

 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT17S1Q2 {
    
    public static double computeFee(double fee, double rate, int year){
        
        for(int i = 0; i < year - 1; i++){
            fee *= 1 + (rate/100);
        }
        
        return fee;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double fee = s.nextDouble();
        
        System.out.print("Enter the yearly rate of increment (e g enter 5.2 for 5.2%): ");
        double rate = s.nextDouble();
        
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = s.nextInt();
        
        System.out.printf("Computed tuition fee for year %d is %.2f", year, computeFee(fee, rate, year));
        
        System.out.println("\n\nDone @ 311019, 23:00");
        
    }
}
