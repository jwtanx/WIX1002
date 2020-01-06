/*
 * 3. Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid. Use the looping approach to solve the problem. Here is a sample run.

Sample output. 
Enter the number of lines: 7
        1
       212 
      32123
     4321234
    543212345 
   65432123456
  7654321234567
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT16S2Q3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int line = s.nextInt();

        for (int i = 1; i <= line; i++) {

            for (int j = line; j > 0; j--) {
                if (j <= i) {
                    System.out.print(j);

                    if (j == 1) {
                        for (int k = 2; k <= i; k++) {
                            System.out.print(k);
                        }
                        System.out.println();

                    }

                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
