/*
 3. Write a program that randomly generate the seven day work hours (1-8 hours) for N employee. Then, display the work hours in seven days and the total hours for each employee.
 */
package Lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L5Q3 {
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        System.out.print("How many workers, N: ");
        int N = s.nextInt();

        int[][][] workingHour = new int[N][7][1];
        int[] workerTotalHour = new int[N];
        
        for(int n = 0; n < N; n++){
            for(int d = 0; d < workingHour[n].length; d++){
                for(int h = 0; h < workingHour[n][d].length; h++){
                    workingHour[n][d][h] = 1 + r.nextInt(8);
                    workerTotalHour[n] += workingHour[n][d][h];
                }
            }
        }
        
        for(int n = 0; n < N; n++){
            System.out.printf("Worker %d: ", n+1);
            for(int d = 0; d < workingHour[n].length; d++){
                for(int h = 0; h < workingHour[n][d].length; h++){
                    System.out.printf("\nDay %d working hour(s): %d", d+1, workingHour[n][d][h]);
                }
            }
            System.out.printf("\nTotal working hour(s): %d\n\n", workerTotalHour[n]);
        }
    }
}
