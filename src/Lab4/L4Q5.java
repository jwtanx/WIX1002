/*
 * Write a simple two players dice game. Each player will take turns to roll a dice. The
first players that reach more than 100 points win the game. If the player rolls a 6, the
player will score 6 points and has the chance to roll again.
 */
package Lab4;

import java.util.Random;

/**
 *
 * @author User
 */
public class L4Q5 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int p1;
        int p2;
        int p1sum = 0;
        int p2sum = 0;
        
        int choice = 1 + r.nextInt(2);
        
        if(choice == 1){
            
            System.out.println("Player 1 starts!\n");
        
            while(p1sum < 100 && p2sum < 100){
            
            do{ 
                if(p1sum >= 100 || p2sum >= 100){
                    break;
                } 
                p1 = 1 + r.nextInt(6);
                p1sum += p1;
                System.out.printf("Player 1 rolls: %d\tPlayer 1 updated scores: %d\n", p1, p1sum);
                
            }while(p1 == 6);
            
            do{
                if(p1sum >= 100 || p2sum >= 100){
                    break;
                } 
                p2 = 1 + r.nextInt(6);
                p2sum += p2;
                System.out.printf("Player 2 rolls: %d\tPlayer 2 updated scores: %d\n", p2, p2sum);
                
            }while(p2 == 6);
            }
            
        }else{
            
            System.out.println("Player 2 starts!\n");

            while(p1sum < 100 && p2sum < 100){
    
            do{
                if(p1sum >= 100 || p2sum >= 100){
                    break;
                } 
                p2 = 1 + r.nextInt(6);
                p2sum += p2;
                System.out.printf("Player 2 rolls: %d\tPlayer 2 updated scores: %d\n", p2, p2sum);
                  
            }while(p2 == 6);
            
            do{
                if(p1sum >= 100 || p2sum >= 100){
                    break;
                } 
                p1 = 1 + r.nextInt(6);
                p1sum += p1;
                System.out.printf("Player 1 rolls: %d\tPlayer 1 updated scores: %d\n", p1, p1sum);
                  
            }while(p1 == 6);
            }
        }
        
        if(p1sum >= 100){
            System.out.println("\nPlayer 1 wins with score: " + p1sum);
        }
        else if(p2sum >= 100){
            System.out.println("\nPlayer 2 wins with score: " + p2sum);
        }
        else if(p1sum == p2sum){
            System.out.println("\nIt's a tie with both score: " + p1sum);
        }
        
/*
============================================================
Old Wrong Version : While loop in while loop is not effcient
============================================================

        switch(choice){
            case 1:

                System.out.println("Player 1 starts!\n");
                
                while(p1sum < 100 && p2sum < 100){
                    
                    p1 = 1 + r.nextInt(6);
                    p1sum += p1;
                    System.out.printf("Player 1 rolls: %d\tPlayer 1 updated scores: %d\n", p1, p1sum);
                    
                    while(p1 == 6 && p1 < 100 && p2 < 100){
                        p1 = 1 + r.nextInt(6);
                        p1sum += p1;
                        System.out.printf("Player 1 rolls: %d\tPlayer 1 updated scores: %d\n", p1, p1sum);
                    }
                    
                    p2 = 1 + r.nextInt(6);
                    p2sum += p2;
                    System.out.printf("Player 2 rolls: %d\tPlayer 2 updated scores: %d\n", p2, p2sum);
                    
                    while(p2 == 6 && p1 < 100 && p2 < 100){
                        p2 = 1 + r.nextInt(6);
                        p2sum += p2;
                        System.out.printf("Player 2 rolls: %d\tPlayer 2 updated scores: %d\n", p2, p2sum);
                    }
                }
                break;
                
            case 2:
                
                System.out.println("Player 2 starts!\n");
                
                while(p1sum < 100 && p2sum < 100){
                    
                    p2 = 1 + r.nextInt(6);
                    p2sum += p2;
                    System.out.printf("Player 2 rolls: %d\tPlayer 2 updated scores: %d\n", p2, p2sum);
                    
                    while(p2 == 6 && p1 < 100 && p2 < 100){
                        p2 = 1 + r.nextInt(6);
                        p2sum += p2;
                        System.out.printf("Player 2 rolls: %d\tPlayer 2 updated scores: %d\n", p2, p2sum);
                    }
                    
                    p1 = 1 + r.nextInt(6);
                    p1sum += p1;
                    System.out.printf("Player 1 rolls: %d\tPlayer 1 updated scores: %d\n", p1, p1sum);
                    
                    while(p1 == 6 && p1 < 100 && p2 < 100){
                        p1 = 1 + r.nextInt(6);
                        p1sum += p1;
                        System.out.printf("Player 1 rolls: %d\tPlayer 1 updated scores: %d\n", p1, p1sum);
                    }
                }
                break;  
        }
        
        if(p1sum >= 100){
            System.out.println("\nPlayer 1 wins with score: " + p1sum);
        }
        else if(p2sum >= 100){
            System.out.println("\nPlayer 2 wins with score: " + p2sum);
        }
        else if(p1sum == p2sum){
            System.out.println("\nIt's a tie with both score: " + p1sum);
        }
        
        
        */
        
    }
}
