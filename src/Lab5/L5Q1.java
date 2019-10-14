/*
1. Write a program to randomly generate N student scores (0-100). The program will prompt the user to enter N students and store the score in an array. Then, the program will display a list of score, the highest score, the lowest score and the average score.
 */
package Lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L5Q1 {
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        System.out.print("Number of students: ");
        int num = s.nextInt();
        
        double[] scorelist = new double[num];
        double score;
        double total = 0.0;
        double average = 0;
        double temp;
        
        for(int c = 0; c < num; c++){
            score = r.nextDouble()*100;
            score = Math.round(score * 100)/100.0;
            scorelist[c] = score;
        }
        
        double max = scorelist[0];
        double min = scorelist[0];
        
        System.out.print("\nBefore sorting: ");
        
        for(double i : scorelist){
            System.out.printf("%5.2f%%\t", i);
            
            if(i > max) max = i;
            if(i < min) min = i;
            total += i;
            average = total / scorelist.length;
        }
        
        //AFTER SORTING
        System.out.print("\nAfter  sorting: ");
        for(int j = 0; j < scorelist.length; j++){
            for(int k = j + 1; k < scorelist.length; k++){
                
                if(scorelist[j] > scorelist[k]){
                    
                    temp = scorelist[j];
                    scorelist[j] = scorelist[k];
                    scorelist[k] = temp;
                    
                }
            }
        }
        
        for(double sorted : scorelist){
            System.out.printf("%5.2f%%\t", sorted);
        }
        
        System.out.printf("\n\nMin\t:%10.2f%%", min);
        System.out.printf("\nMax\t:%10.2f%%", max);
        System.out.printf("\nTotal\t:%10.2f%%", total);
        System.out.printf("\nAverage\t:%10.2f%%", average);
        
        System.out.println("\n\nDone @ 151019, 07:05");
    }
}
