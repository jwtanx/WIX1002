/*
 * 5. Define a class Game. The class has a constructor that accept player name. Besides, the class contains a method move that roll the dice. Create a Tester class to test the program with two players and the player that reach 100 or more win the game.   
 */
package Lab8;

import java.util.Random;
import java.util.Scanner;

public class GameTesterClass {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String name;
        boolean run = true;

        System.out.print("Player 1 enter name: ");
        name = s.nextLine();
        Game player1 = new Game(name);

        System.out.print("Player 2 enter name: ");
        name = s.nextLine();
        Game player2 = new Game(name);
        
        System.out.println();
        
        int comchoice = r.nextInt(2) + 1;

        while (run) {

            if (comchoice == 1) {
                player1.addScore();
                System.out.println(player1.toStringCurrentScore());
                if (player1.getScore() >= 100) {
                    run = false;
                    System.out.println(player1.toString());
                    break;
                }
                
                player2.addScore();
                System.out.println(player2.toStringCurrentScore() + "\n");
                if (player2.getScore() >= 100) {
                    run = false;
                    System.out.println(player2.toString());
                    break;
                }
                
            } else if (comchoice == 2) {
                player2.addScore();
                System.out.println(player2.toStringCurrentScore());
                if (player2.getScore() >= 100) {
                    run = false;
                    System.out.println(player2.toString());
                    break;
                }
                
                player1.addScore();
                System.out.println(player1.toStringCurrentScore() + "\n");
                if (player1.getScore() >= 100) {
                    run = false;
                    System.out.println(player1.toString() + "\n");
                    break;
                }
            }
        }        
    }
}
