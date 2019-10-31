/*
 * 2. Abdullah is conducting an experiment using random number. After generating the random number, He divided the number into 3 groups based on the table below. Example, if the random number is 24, the group of the number is AA.

Last Digit of the Number        Group 
0-3                             AAA
4-6                             AA
7-9                             A

Write a program for Abdullah to display the frequency for each group. The program should request Abdullah to enter aN number. The program will then generate N random numbers within (50-150). After displaying all the random numbers generated, the program displays the frequency for each group. 

Sample output
Enter N number: 12
The random numbers are: 124 91 136 111 147 127 149 107 77 89 113 133
Group AAA : 4
Group AA : 2 
Group A : 6

 */
package Exercise.PastFinalTerm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT18S1Q2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter N number: ");
        int N = s.nextInt();
        int rnum;
        int lastDigit;
        // g1 = AAA; g2 = AA; g3 = A;
        int g1 = 0, g2 = 0, g3 = 0;

        System.out.print("The random numbers are: ");
        for (int i = 0; i < N; i++) {

            lastDigit = 0;

            rnum = 50 + r.nextInt(101);

            System.out.print(rnum + " ");

            lastDigit = rnum % 10;

            if (lastDigit <= 3) {
                g1++;
            } else if (lastDigit >= 4 && lastDigit <= 6) {
                g2++;
            } else if (lastDigit >= 7 && lastDigit <= 9) {
                g3++;
            }

        }

        System.out.println("\nGroup AAA : " + g1);
        System.out.println("Group AA : " + g2);
        System.out.println("Group A : " + g3);
        
        System.out.println("\nDone @ 310119, 23:59");
        
    }
}
