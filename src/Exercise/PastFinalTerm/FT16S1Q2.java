/*
 * 2. Write a program that plats the scissors rock and paper game. The program will let the user continuously play until either the user or the computer wins three times.
 */
package Exercise.PastFinalTerm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT16S1Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        int pScore = 0;
        int cScore = 0;
        int p, com;
        
        System.out.println("Rock Paper Scissor Game v1.0");
        
        while(pScore < 3 && cScore < 3){
            System.out.print("\nEnter   1.Paper   2.Scissor   3.Rock: ");
            String[] choice = {"Paper", "Scissor", "Rock"};
            
            p = s.nextInt();
            com = 1 + r.nextInt(3);
            
            System.out.printf("Player : %s ----- Computer : %s\n", choice[p-1], choice[com-1]);
            
            switch(p){
                case 1:
                    if(com == 1) {
                        System.out.println("Game ties");
                    }
                    else if(com == 2){
                        cScore++;
                        System.out.println("Computer wins " + cScore + " time(s)");
                    }
                    else if(com == 3){
                        pScore++;
                        System.out.println("Player wins " + pScore + " time(s)");
                    }
                break;
                
                case 2:
                    if(com == 1) {
                        pScore++;
                        System.out.println("Player wins " + pScore + " time(s)");
                    }
                    else if(com == 2){
                        System.out.println("Game ties");
                    }
                    else if(com == 3){
                        cScore++;
                        System.out.println("Computer wins " + cScore + " time(s)");
                    }
                break;
                
                case 3:
                    if(com == 1) {
                        cScore++;
                        System.out.println("Computer wins " + cScore + " time(s)");
                    }
                    else if(com == 2){
                        pScore++;
                        System.out.println("Player wins " + pScore + " time(s)");
                    }
                    else if(com == 3){
                        System.out.println("Game ties");
                    }
                break;
            }
        }
        
        System.out.println("\nDone @ 311019, 19:00");
        
    }
}
