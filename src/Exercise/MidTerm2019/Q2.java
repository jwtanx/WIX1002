/*
 * 2. Write a program that test your ability to guess a color. The program should randomly select the name of a color from the following list of words:

red, green, blue, orange, yellow

To select a select a word, the program can generate a random number. for example, if the number is 0, the selected word is red. Next the program should ask the user to enter a color that the computer has selected. After the user entered his or her guess, the program should display the name of the randomly selected color. The program should repeat 10 times and the display the number of times the user correctly guess the selected color.
Once you’re done : Adjust program to allow user to play as many times desired. 

 */
package Exercise.MidTerm2019;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q2 {
    public static void main(String[] args) {
        
        System.out.print("Guess The Color v1.0");
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        String[] colorList = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int score = 0;
        int color;
        String guess;
        int i = 0;
        
        do{
            color = r.nextInt(5);
            
            if(i < 10) System.out.print("\n\nGuess the color generated: ");
            else System.out.print("\n\nGuess the color generated [Type \"Quit\" to quit]: ");
            guess = s.next();
            
            if(guess.equalsIgnoreCase("Quit")) break;
            
            System.out.printf("The random color generated: %s\n", colorList[color]);
            
            for(int k = 0; k < colorList.length; k++){
                if(guess.equalsIgnoreCase(colorList[color])){
                    score++;
                    break;
                }
            }
            System.out.printf("Current score: %d", score);
            i++;
        }while(i < 10 || !guess.equalsIgnoreCase("Quit"));
        
        System.out.printf("\nYour total score: %d\n", score);
        
        System.out.println("Done @ 251019, 09:45");
    }
}
