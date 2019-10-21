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
        
        System.out.print("[a * b = c] Enter a, b, c separately to check if c is the correct answer: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        System.out.printf("%d * %d = %d [%b]\n", a, b, c, checkMulti(a, b, c));
        if(checkMulti(a, b, c) == false) System.out.println("\nAnswer is " + a*b);
        
        System.out.println("\nMultiplication Game");
        a = r.nextInt(13);
        b = r.nextInt(13);
        
        System.out.printf("%d * %d = ", a, b);
        c = s.nextInt();
        System.out.printf("%d * %d = %d [%b]\n", a, b, c, checkMulti(a, b, c));
        if(checkMulti(a, b, c) == false) System.out.println("\nAnswer is " + a*b);
        
        System.out.println("\nDone @ 211019, 10:31");
        
    }
}
