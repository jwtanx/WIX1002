/*
 * Revision MidTerm 2016 Q3

3. Apositive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers less than 10000. Write a program to find all these four numbers.

 */
package Exercise.PastMidTerm;

/**
 *
 * @author User
 */
public class RMT16Q3 {

    public static void main(String[] args) {

        int sum;

        System.out.print("The perfect numbers:\n");

        for (int num = 1; num < 10001; num++) {

            sum = 0;

            for (int d = 1; d < num; d++) {

                if (num % d == 0) {
                    sum += d;
                }
            }

            if (sum == num) {

                System.out.print(sum + " = ");

                for (int d = num - 1; d > 0; d--) {

                    if (num % d == 0) {

                        if (d == 1) {
                            System.out.print(d);
                        } else {
                            System.out.print(d + " + ");
                        }
                    }

                }
                System.out.println();

            }
        }

        System.out.println("\n\nDone @ 311019, 08:55");

    }
}
