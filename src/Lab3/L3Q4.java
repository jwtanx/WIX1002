/*
 * Write a simple two players dice game. Each player will roll the dice twice and the
player with the highest score wins the game.
 */
package Lab3;

import java.util.Random;

/**
 *
 * @author User
 */
public class L3Q4 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int a[] = new int[2];
        int b[] = new int[2];
        int asum = 0;
        int bsum = 0;
        
        for (int i = 0; i < 2; i++){
            
            a[i] = 1 + r.nextInt(6);
            asum += a[i];
            
            b[i] = 1 + r.nextInt(6);
            bsum += b[i];
            
        }
        
        System.out.println("Player\tRound 1\tRound2\tTotal");
        System.out.printf("1\t%d\t%d\t%d\n", a[0], a[1], asum);
        System.out.printf("2\t%d\t%d\t%d\n", b[0], b[1], bsum);
        
        if(asum > bsum)
            System.out.println("Player 1 wins!");
        else if(bsum > asum)
            System.out.println("Player 2 wins!");
        else
            System.out.println("It's a tie!");
        
        System.out.println("\nDone on 30 Sept 2019, 10:19P.M.");
    }
}
