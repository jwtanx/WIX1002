/*
4. Create a Dice game. The first dice game allows the player to roll two dices each time. If both dice is equal, the player can roll again. The player score each time they roll the dices. Player that reaches 100 points or more wins the game. The second dice game allows the player to roll one dice each time. When the dice is 6, the player can roll one more time. However, if the player rolls 6 again in second attempt, the player won’t have any score. Player that reaches 100 point wins the game. If the player scores more than 100, the last score is not counted and the player needs to roll again in next turn. Create a Tester class to test the program.  
 */
package Lab9;

import java.util.Random;

public class Q4Dice {

    private int p1;
    private int p2;
    private Random r = new Random();

    public Q4Dice() {
        p1 = 0;
        p2 = 0;
    }

    // Dice Game 1
    public void diceGame1() {
        p1 = 0;
        p2 = 0;
        int choice = 1 + r.nextInt(2);
        int dice1, dice2;
        boolean run = true;

        switch (choice) {

            // Player 1 starts first
            case 1:
                System.out.println("Player 1 starts!");
                A:
                while (run) {

                    // Player 1
                    do {
                        dice1 = 1 + r.nextInt(6);
                        System.out.println("Player 1 Dice 1 : " + dice1);
                        dice2 = 1 + r.nextInt(6);
                        System.out.println("Player 1 Dice 2 : " + dice2);
                        p1 += dice1 + dice2;
                        System.out.println("Player 1 current score : " + p1 + "\n");

                        if (checkScoreForGame1(p1)) {
                            System.out.println("Player 1 wins the game with score " + p1);
                            run = false;
                            break A;
                        }

                        if (dice1 == dice2) {
                            System.out.println("Player 1 has chance to roll again.");
                        }

                    } while (dice1 == dice2);

                    // Player 2
                    do {
                        dice1 = 1 + r.nextInt(6);
                        System.out.println("Player 2 Dice 1 : " + dice1);
                        dice2 = 1 + r.nextInt(6);
                        System.out.println("Player 2 Dice 2 : " + dice2);
                        p2 += dice1 + dice2;
                        System.out.println("Player 2 current score : " + p2 + "\n");

                        if (checkScoreForGame1(p2)) {
                            System.out.println("Player 2 wins the game with score " + p2);
                            run = false;
                            break A;
                        }

                        if (dice1 == dice2) {
                            System.out.println("Player 2 has chance to roll again.");
                        }
                    } while (dice1 == dice2);
                }
                break;

            // Player 2 starts first
            case 2:
                System.out.println("Player 2 starts!");
                B:
                while (run) {

                    // Player 2
                    do {
                        dice1 = 1 + r.nextInt(6);
                        System.out.println("Player 2 Dice 1 : " + dice1);
                        dice2 = 1 + r.nextInt(6);
                        System.out.println("Player 2 Dice 2 : " + dice2);
                        p2 += dice1 + dice2;
                        System.out.println("Player 2 current score : " + p2 + "\n");

                        if (checkScoreForGame1(p2)) {
                            System.out.println("Player 2 wins the game with score " + p2);
                            run = false;
                            break B;
                        }

                        if (dice1 == dice2) {
                            System.out.println("Player 2 has chance to roll again.");
                        }
                    } while (dice1 == dice2);

                    // Player 1
                    do {
                        dice1 = 1 + r.nextInt(6);
                        System.out.println("Player 1 Dice 1 : " + dice1);
                        dice2 = 1 + r.nextInt(6);
                        System.out.println("Player 1 Dice 2 : " + dice2);
                        p1 += dice1 + dice2;
                        System.out.println("Player 1 current score : " + p1 + "\n");

                        if (checkScoreForGame1(p1)) {
                            System.out.println("Player 1 wins the game with score " + p1);
                            run = false;
                            break B;
                        }

                        if (dice1 == dice2) {
                            System.out.println("Player 1 has chance to roll again.");
                        }

                    } while (dice1 == dice2);
                }
                break;
        }
    }

    public boolean checkScoreForGame1(int score) {

        if (score >= 100) {
            return true;
        }

        return false;
    }

    // Dice Game 2
    /*
    The second dice game allows the player to roll one dice each time. When the dice is 6, the player can roll one more time. However, if the player rolls 6 again in second attempt, the player won’t have any score. Player that reaches 100 point wins the game. If the player scores more than 100, the last score is not counted and the player needs to roll again in next turn. Create a Tester class to test the program.  
     */
    public void diceGame2() {
        p1 = 0;
        p2 = 0;
        boolean run = true;

        while (run) {
            int choice = 1 + r.nextInt(2);
            int dice;
            switch (choice) {

                // Player 1 starts first
                case 1:
                    System.out.println("Player 1 starts!");
                    A:
                    while (run) {

                        // Player 1
                        dice = 1 + r.nextInt(6);
                        System.out.println("Player 1 Dice : " + dice);
                        p1 += dice;

                        if (p1 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p1 -= dice;

                        }

                        System.out.println("Player 1 current score : " + p1 + "\n");

                        if (checkScoreForGame2(p1)) {
                            System.out.println("Player 1 wins the game with score " + p1);
                            run = false;
                            break A;
                        }

                        if (dice == 6) {
                            System.out.println("Player 1 has chance to roll again.");
                            dice = 1 + r.nextInt(6);
                            System.out.println("Player 1 Dice : " + dice);
                            p1 += dice;

                            if (p1 > 100) {

                                System.out.println("More than 100, the score not counted.");
                                p1 -= dice;

                            }

                            System.out.println("Player 1 current score : " + p1 + "\n");

                            if (checkScoreForGame2(p1)) {
                                System.out.println("Player 1 wins the game with score " + p1);
                                run = false;
                                break A;
                            }

                            if (dice == 6 && p1 < 100) {
                                System.out.println("Player 1 Dice : " + dice);
                                System.out.println("Player 1 rolls " + dice + " again, hence previous score(6) is not counted.");
                                p1 -= 6;
                                System.out.println("Player 1 current score : " + p1 + "\n");
                            } 
                        }

                        if (p1 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p1 -= dice;
                            System.out.println("Player 1 current score : " + p1 + "\n");

                        }

                        if (checkScoreForGame2(p1)) {
                            System.out.println("Player 1 wins the game with score " + p1);
                            run = false;
                            break A;
                        }

                        // Player 2
                        dice = 1 + r.nextInt(6);
                        System.out.println("Player 2 Dice : " + dice);
                        p2 += dice;

                        if (p2 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p2 -= dice;

                        }

                        System.out.println("Player 2 current score : " + p2 + "\n");

                        if (checkScoreForGame2(p2)) {
                            System.out.println("Player 2 wins the game with score " + p2);
                            run = false;
                            break A;
                        }

                        if (dice == 6) {
                            System.out.println("Player 2 has chance to roll again.");
                            dice = 1 + r.nextInt(6);
                            System.out.println("Player 2 Dice : " + dice);
                            p2 += dice;
                            
                            if (p2 > 100) {

                                System.out.println("More than 100, the score not counted.");
                                p2 -= dice;

                            }

                            System.out.println("Player 2 current score : " + p2 + "\n");

                            if (checkScoreForGame2(p2)) {
                                System.out.println("Player 2 wins the game with score " + p2);
                                run = false;
                                break A;
                            }

                            if (dice == 6 && p2 < 100) {
                                System.out.println("Player 2 Dice : " + dice);
                                System.out.println("Player 2 rolls " + dice + " again, hence previous score(6) is not counted.");
                                p2 -= 6;
                                System.out.println("Player 2 current score : " + p2 + "\n");
                            } 
                        }

                        if (p2 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p2 -= dice;
                            System.out.println("Player 2 current score : " + p2 + "\n");

                        }

                        if (checkScoreForGame2(p2)) {
                            System.out.println("Player 2 wins the game with score " + p2);
                            run = false;
                            break A;
                        }

                    }
                    break;

                // Player 2 starts first
                case 2:
                    System.out.println("Player 2 starts!");
                    B:
                    while (run) {

                        // Player 2
                        dice = 1 + r.nextInt(6);
                        System.out.println("Player 2 Dice : " + dice);
                        p2 += dice;

                        if (p2 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p2 -= dice;

                        }

                        System.out.println("Player 2 current score : " + p2 + "\n");

                        if (checkScoreForGame2(p2)) {
                            System.out.println("Player 2 wins the game with score " + p2);
                            run = false;
                            break B;
                        }

                        if (dice == 6) {
                            System.out.println("Player 2 has chance to roll again.");
                            dice = 1 + r.nextInt(6);
                            System.out.println("Player 2 Dice : " + dice);
                            p2 += dice;
                            
                            if (p2 > 100) {

                                System.out.println("More than 100, the score not counted.");
                                p2 -= dice;

                            }

                            System.out.println("Player 2 current score : " + p2 + "\n");

                            if (checkScoreForGame2(p2)) {
                                System.out.println("Player 2 wins the game with score " + p2);
                                run = false;
                                break B;
                            }

                            if (dice == 6 && p2 < 100) {
                                System.out.println("Player 2 Dice : " + dice);
                                System.out.println("Player 2 rolls " + dice + " again, hence previous score(6) is not counted.");
                                p2 -= 6;
                                System.out.println("Player 2 current score : " + p2 + "\n");
                            } 
                        }

                        if (p2 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p2 -= dice;
                            System.out.println("Player 2 current score : " + p2 + "\n");

                        }

                        if (checkScoreForGame2(p2)) {
                            System.out.println("Player 2 wins the game with score " + p2);
                            run = false;
                            break B;
                        }

                        // Player 1
                        dice = 1 + r.nextInt(6);
                        System.out.println("Player 1 Dice : " + dice);
                        p1 += dice;

                        if (p1 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p1 -= dice;

                        }

                        System.out.println("Player 1 current score : " + p1 + "\n");

                        if (checkScoreForGame2(p1)) {
                            System.out.println("Player 1 wins the game with score " + p1);
                            run = false;
                            break B;
                        }

                        if (dice == 6) {
                            System.out.println("Player 1 has chance to roll again.");
                            dice = 1 + r.nextInt(6);
                            System.out.println("Player 1 Dice : " + dice);
                            p1 += dice;
                            
                            if (p1 > 100) {

                                System.out.println("More than 100, the score not counted.");
                                p1 -= dice;

                            }

                            System.out.println("Player 1 current score : " + p1 + "\n");

                            if (checkScoreForGame2(p1)) {
                                System.out.println("Player 1 wins the game with score " + p1);
                                run = false;
                                break B;
                            }

                            if (dice == 6 && p1 < 100) {
                                System.out.println("Player 1 Dice : " + dice);
                                System.out.println("Player 1 rolls " + dice + " again, hence previous score(6) is not counted.");
                                p1 -= 6;
                                System.out.println("Player 1 current score : " + p1 + "\n");
                            } 
                        }

                        if (p1 > 100) {

                            System.out.println("More than 100, the score not counted.");
                            p1 -= dice;
                            System.out.println("Player 1 current score : " + p1 + "\n");

                        }


                        if (checkScoreForGame2(p1)) {
                            System.out.println("Player 1 wins the game with score " + p1);
                            run = false;
                            break B;
                        }

                    }
                    break;
            }
        }
    }

    public boolean checkScoreForGame2(int score) {

        if (score == 100) {
            return true;
        }

        return false;
    }

}
