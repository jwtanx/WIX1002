/*
 * 1. The program in the Q1.java file contains many errors. Correct all errors.
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT17Q1 {

    public static void main(String[] args) {
        int N;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        for (int i = 1; i < N; i++) {
            System.out.print(getTriangular(i) + "  ");
        }
        System.out.println();
    }

    public static int getTriangular(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1;
        }
        return sum;
    }
}
