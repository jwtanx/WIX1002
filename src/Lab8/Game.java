/*
 * 5. Define a class Game. The class has a constructor that accept player name. Besides, the class contains a method move that roll the dice. Create a Tester class to test the program with two players and the player that reach 100 or more win the game.   
 */
package Lab8;

import java.util.Random;

public class Game {
    
    private String name;
    private int score;
    private Random r = new Random();
    
    public Game(){
        name = "";
        score = 0;
    }
    
    public Game(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    
    public void addScore(){
        
        score += (1 + r.nextInt(6));
        
    }
    
    public String toString(){
        return "Player " + name + " wins with score " + score + "!";
    }
    
    public String toStringCurrentScore(){
        return "Player " + name + " current score " + score;
    }
}
