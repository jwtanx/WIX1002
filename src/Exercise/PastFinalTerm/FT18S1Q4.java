/*
 * 4. In a diving contest, five judges are invited to give score. However, only three scores are taken into consideration. The lowest and the highest scores are dropped. Example, if the scores are 5.5 5.5 6.5 6.5 7.0; one of the 5.5 and 7.0 are dropped. Then, the final score is calculated based on the sum of the three scores multiply the degree of difficulty. Q4.txt file contains the scores of all players. Each line consists of player nickname, five judges’ scores and the degree of difficulty. Write a program that display the final score for each player and determine the winner. 

Sample output:
Ahmad score: 40.95
David score: 44.0
Mutu score: 47.25
Fairuz score: 40.95
Mutu is the winner
 */
package Exercise.PastFinalTerm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FT18S1Q4 {
    public static void main(String[] args) {
        
        
        File data = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT18S1Sources/FT18S1Q4Data.txt");
        
        String[] name = null;
        int[] difficulty = null;
        double[] totalScore = null;
        double[][] score = null;
        int line = 0;
        
        try{
            // Get the number of players
            Scanner s = new Scanner(new FileInputStream(data));
            
            while(s.hasNextLine()){
                s.nextLine();
                line++;
            }
            name = new String[line];
            difficulty = new int[line];
            totalScore = new double[line];
            score = new double[line][5];
            
            s.close();
            
            // Extract the data
            s = new Scanner(new FileInputStream(data));
            
            for(int i = 0; i < line; i++){
                name[i] = s.next();
                for(int c = 0; c < 5; c++){
                    score[i][c] = s.nextDouble();
                }
                difficulty[i] = s.nextInt();
            }
            
            s.close();
        } catch (FileNotFoundException fnf){
            System.err.println("File not found!");
        }
        
        // Search the highest score and the lowest score.
        for(int i = 0; i < line; i++){
            
            double highest = 0, lowest = 0;
            
            for(int c = 0; c < score[i].length; c++){
                
                // Add up all the five scores
                totalScore[i] += score[i][c];
                
                if(c == 0){
                    highest = score[i][c];
                    lowest = score[i][c];
                } else {
                    
                    if(score[i][c] > highest){
                        highest = score[i][c];
                    }
                    
                    if(score[i][c] < lowest){
                        lowest = score[i][c];
                    }
                }
            }
            
            // Subtract the total score with the highest and lowest score then multiply it with
            // difficulty to get the total score
            totalScore[i] = (totalScore[i] - highest - lowest) * difficulty[i];
        }
        
        
        // Displaying the total score by each players
        for(int i = 0; i < line; i++){
            
            System.out.printf("%s score: %.2f\n", name[i], totalScore[i]);
            
        }
        
        // Getting the highest score player
        int highestScoreIndex = 0;
        for(int i = 0; i < line; i++){
            
            if(i == 0){
                highestScoreIndex = i;
            }
            else {
                if(totalScore[i] > totalScore[highestScoreIndex]){
                    highestScoreIndex = i;
                }
            }
            
        }
        
        // Displays the winner
        System.out.printf("\n%s is the winner", name[highestScoreIndex]);
        
        
    }
}
