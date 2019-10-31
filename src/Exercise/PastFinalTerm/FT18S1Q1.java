/*
 * 1. Correct the errors.
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT18S1Q1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num, sum = 0;
        do {
            System.out.print("Enter an integer number, -1 to quit: ");
            num = a.nextInt();
            
            if (num == -1) {
                break;
            }

            sum += num;
            if (num % 2 == 0) {
                System.out.println("The number is an even number");
            } else {
                System.out.println("The number is an odd number");
            }
        } while (num != -1);

        System.out.printf("The sum of all integer number(s) is : %5d\n", sum);
        
        System.out.println("\nDone @ 311019, 23:30");
    }
}
