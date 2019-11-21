/*
 * 5. Write a method that accepts an array of 4 non-duplicate digit (0-9), then do permutation on all digit in the array to produce all possible number. Then, write a Java program to randomly generate N non-duplicate digit in an array then print out all permutation.  
Sample Input: Generated numbers are 0, 7, 3, 9  
Sample Output: 739 7039 7309 7390 … <output too long> … 9073 973 793 739
 */
package Viva.Method;

import java.util.Random;

public class Q5 {

    static Random r = new Random();

    public static void main(String[] args) {

        int[] digit = new int[4];
        generateDigit(digit);
        permutateDigit(digit);
    }

    public static void generateDigit(int[] digit) {

        for (int i = 0; i < digit.length; i++) {
            digit[i] = r.nextInt(10);

            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (digit[j] == digit[i]) {
                        i--;
                    }
                }
            }
        }
    }
    
    public static void permutateDigit(int[] digit){
        
        String convertInt = "";
        for(int i = 0; i < 1000; i++){
            
            convertInt = "0" + String.valueOf(i);
            
            if( (convertInt.contains(String.valueOf(digit[0]))) &&
                (convertInt.contains(String.valueOf(digit[1]))) &&
                (convertInt.contains(String.valueOf(digit[2]))) &&
                (convertInt.contains(String.valueOf(digit[3])))   ){
                
                System.out.println(i);
            }
            convertInt = "";
        }
        
        for(int i = 1000; i < 9999; i++){
            if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                (String.valueOf(i).contains(String.valueOf(digit[3])))   ){
                
                System.out.println(i);
            }
        }
    }
    
    
}
