/*
 2. Write a program that generates 10 non-duplicate random integers within the range from 0 to 20.
 */
package Lab5;

import java.util.Random;
import java.util.*;

/**
 *
 * @author User
 */
public class L5Q2 {
    public static void main(String[] args) {
        
        Random r = new Random();
        int num[] = new int[10];
        
        for(int i = 0; i < num.length; i++){
            num[i] = r.nextInt(21);
            
            if(i > 0){
                for(int c = 0; c < i; c++){
                    if (num[c] == num[i]){
                        System.out.println("Duplicated number: " + num[c]);
                        i--;
                    }
                }
            }
        }
        
        System.out.print("\nThe number generated: ");
        
        for(int n = 0; n < num.length; n++){
            if(n == num.length - 1) System.out.print(num[n]);
            else System.out.print(num[n] + ", ");
        }
        
        System.out.println("\n\nDone Updated @ 241019, 01:05");
    }
}
