/*
 * Write a program that calculates the minimum, maximum, average and standard
deviation (s) of the exam score in a subject. The program will accepts the score and
quit if negative score is enter. A sample output is given below.


 */
package Lab4;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class L4Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int x;
        int N = 0;
        int sum = 0;
        int min, max;
        double average, sd;
        double sumOfXSq = 0;
        
        System.out.println("      ______________");
        System.out.println("     |        (ΣX)² ");
        System.out.println("s =  | ΣX² -  ----- ");
        System.out.println("     |          N   ");
        System.out.println("     | ------------ ");
        System.out.println("    \\/    N - 1    ");
        
        
        System.out.print("Enter a score [negative score to quit]:");
        x = s.nextInt();
        
        if(x < 0){
            System.exit(0);
        }
            
        System.out.println();
        min = x;
        max = x;
        sumOfXSq += Math.pow(x, 2);
        sum += x;
        N++;
        
        do{
            System.out.print("Enter a score [negative score to quit]:");
            
            x = s.nextInt();
            
            if(x < 0){
                break;
            }
            
            sumOfXSq += Math.pow(x, 2);
            sum += x;
            N++;
            
            System.out.println();
            
            if (x < min && x >= 0){
                min = x;
            }
            else if (x > max){
                max = x;
            }
            
        }while(x >= 0);
        
        average = (sum * 1.0) / N;
        
        double ans = (sumOfXSq - ((Math.pow(sum, 2))/N))/(N - 1);
        
        sd = Math.sqrt(ans);
        
        System.out.println(ans);
        System.out.printf("Minimum Score: %d\n",  min);
        System.out.printf("Maximum Score: %d\n", max);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.printf("Stand Deviation: %.2f\n", sd);
        
        
    }
}
