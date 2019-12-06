/*
2. Define a class Organism. The class contains the initial size of the organism and the growth rate. Create a constructor to initialize the instance variables. Then, define a class Animal. Animal is an organism that has extra instance variable which is the amount of eating need. Create a constructor to initialize the instance variable and a method to display the Animal instance variables. 
 */
package Tutorial.T9;

import java.util.Random;

public class Q2TesterClass {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        Q2Animal a = new Q2Animal(Math.round(r.nextDouble()*1000)/100.00);
        
        System.out.println(a.toString());
        
    }    
}
