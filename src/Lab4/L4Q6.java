/*
 * Write a program that generates a non-negative random integer. Display the number of
digits in the integer.
 */
package Lab4;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class L4Q6 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int num = -1;
        
        List<Integer> li = new ArrayList<Integer>();
        
        while(num < 0){
            num = r.nextInt();
            if(num < 0)
                li.add(num);
        }
        
        System.out.println("The non-negative random integer: " + num);   
        System.out.println("List of negative random integer: " + li);   
    }
}
