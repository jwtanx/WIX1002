/*
 * Generate a random integer within 0 to 5 and display the integer in word.

        eg. OUTPUT: 2 is two.     
 */
package Lab3;

/**
 *
 * @author User
 */

import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int num = r.nextInt(6);
        
        switch(num){
            
            case 0:
                System.out.printf("%d is zero.", num);
            break;
            
            case 1:
                System.out.printf("%d is one.", num);
            break;
            
            case 2:
                System.out.printf("%d is two.", num);
            break;
            
            case 3:
                System.out.printf("%d is three.", num);
            break;
            
            case 4:
                System.out.printf("%d is four.", num);
            break;
            
            case 5:
                System.out.printf("%d is five.", num);
            break;
            
        }
        System.out.println("\nDone on 30 Sept 2019, 9:45P.M.");
    }
}
