/*
 * Write a program that accepts an integer from user. Then, display its entire factors in
increasing order.

    eg. Enter an Integer: 24
        The factors are: 1, 2, 3, 4, 6, 8, 12, 24
 */
package Lab4;

import java.util.*;

/**
 *
 * @author User
 */
public class L4Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int integer = s.nextInt();
        
        //int[] lis = new int[integer];
        
        List<Integer> li = new ArrayList<Integer>();
        
        for(int c = 1; c <= integer; c++){
            if(integer % c == 0){
                li.add(c);
            }
        }
        
        System.out.println("The factors are: " + li);
        
    }
}
