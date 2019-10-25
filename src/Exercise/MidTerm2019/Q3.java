/*
 * 3.	Write a program that demonstrates the tossing game of a coin. The program should display the side that is initially facing up. Then, use a loop to toss the coin 20 times. Each time the coin it tossed, display the side that is facing up. The program should keep count of the number of times heads is facing up and the number of times tails is facing up, and display those values after the loop finishes.
 */
package Exercise.MidTerm2019;

import java.util.Random;

/**
 *
 * @author User
 */
public class Q3 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        System.out.println("Coin Flip v1.0\n");
        
        int coin;
        int head = 0, tail = 0;
        
        for(int i = 0; i < 20; i++){
            coin = r.nextInt(2);
            
            if(coin == 0){
                System.out.println("No. " + (i+1) + "\tHead");
                head++;
            }
            else{
                System.out.println("No. " + (i+1) + "\tTail");
                tail++;
            }
        }
        
        System.out.println("\nNumber of times head is facing up: " + head);
        System.out.println("Number of times head is facing up: " + tail);
        
        System.out.println("\nDone @ 251019, 10:05");
    }
}
