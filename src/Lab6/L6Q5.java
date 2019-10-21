/*
 * 5. Write a Java method that accepts three parameters, the method will compare whether the third parameter value is equal to the multiplication of parameter 1 and parameter 2. Then, write a Java multiplication game for any random number within 0 – 12. 
 */
package Lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q5 {
    
    static boolean checkMulti(int a, int b, int c){
        
        boolean checkMulti = false;
        
        if(a * b == c) checkMulti = true;
        
        return checkMulti;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        
        while(true){
            int a = r.nextInt(13);
            int b = r.nextInt(13);

            System.out.println("Enter negative number to quit: ");
            System.out.printf("%d x %d = ", a, b);
            int c = s.nextInt();
            if(checkMulti(a, b, c) == true) score++;
            if(c < 0) break;

        }
        
        System.out.println("Your score is " + score);
        
        System.out.println("\nDone @ 211019, 10:43");
        
    }
}
