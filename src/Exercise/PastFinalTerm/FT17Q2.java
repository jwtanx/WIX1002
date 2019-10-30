/*
 * 2. Write a program that asks a user to enter the number of teams, their team names, and their scores based on the table below. Then, display the team names and their scores in descending order with the highest team score first.

Team                    Score 
Norwich                 24 
Newcastle United        42 
Blackburn Rovers        12 
Queens Park Rangers     20 
Birmingham              22

 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT17Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of team: ");
        int teamNumber = s.nextInt();
        s.nextLine();
        
        String[] teamName = new String[teamNumber];
        int[] score = new int[teamNumber];
        
        for(int i = 0; i < teamNumber; i++){
            
            System.out.printf("Enter team %d name: ", (i+1));
            teamName[i] = s.nextLine();
            System.out.printf("Enter team %d score: ", (i+1));
            score[i] = s.nextInt();
            s.nextLine();
            
        }
        
        // Sorting in descending order
        int tempScore;
        String tempTeam;
        int max = score[0];
        
        for(int i = 0; i < teamNumber; i++){
            for(int j = i + 1; j < teamNumber; j++){
                
                if(score[i] < score[j]){
                    
                    tempScore = score[i];
                    tempTeam = teamName[i];
                    
                    score[i] = score[j];
                    teamName[i] = teamName[j];
                    
                    score[j] = tempScore;
                    teamName[j] = tempTeam;
                    
                }
            }
        }
        
        System.out.println("List of the team with the highest team score first");
        for(int c = 0; c < teamNumber; c++){
            System.out.printf("%s (%d) |", teamName[c], score[c]);
        }
        
        System.out.println("\n\nDone @ 301019, 23:13");
        
    }
}
