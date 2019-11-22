/*
 * 5. Write a method that accepts an array of 4 non-duplicate digit (0-9), then do permutation on all digit in the array to produce all possible number. Then, write a Java program to randomly generate N non-duplicate digit in an array then print out all permutation.  
Sample Input: Generated numbers are 0, 7, 3, 9  
Sample Output: 739 7039 7309 7390 … <output too long> … 9073 973 793 739
 */
package Viva.Method;

import java.util.Random;
import java.util.Scanner;

public class Q5 {

    static Random r = new Random();
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter N : ");
        int n = s.nextInt();
        s.nextLine();
        
        int[] digit = new int[n];
        generateDigit(digit);
        permutateDigit(digit);
        
        System.out.print("\nRestart?(Y/N): ");
        char choice = s.nextLine().charAt(0);
        
        if(choice == 'Y' || choice == 'y'){
            main(args);
        }
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
        switch(digit.length){
            case 1:
                System.out.println(digit[0]);
                break;
            
            case 2:
                convertInt = "";

                for(int i = 0; i < 10; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) ){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(int i = 10; i < 99; i++){   // <-- Set 9900 since it is impossible to get 9900 
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) ){

                    System.out.println(i);
                }
                }
                break;
                
            case 3:
                convertInt = "";

                for(int i = 0; i < 100; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) &&
                    (convertInt.contains(String.valueOf(digit[2]))) ){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(int i = 100; i < 990; i++){   // <-- Set 9900 since it is impossible to get 9900 
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2])))  ){

                    System.out.println(i);
                }
                }
                break;
                
            case 4: 
                convertInt = "";

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

                for(int i = 1000; i < 9900; i++){   // <-- Set 9900 since it is impossible to get 9900 
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[3])))   ){

                    System.out.println(i);
                }
                }
                break;
                
            case 5: 
                convertInt = "";

                for(int i = 0; i < 10000; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) &&
                    (convertInt.contains(String.valueOf(digit[2]))) &&
                    (convertInt.contains(String.valueOf(digit[3]))) &&
                    (convertInt.contains(String.valueOf(digit[4])))){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(int i = 10000; i < 99000; i++){
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[3]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[4])))    ){

                    System.out.println(i);
                }
                }
                break;
                
            case 6: 
                convertInt = "";

                for(int i = 0; i < 100000; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) &&
                    (convertInt.contains(String.valueOf(digit[2]))) &&
                    (convertInt.contains(String.valueOf(digit[3]))) &&
                    (convertInt.contains(String.valueOf(digit[4]))) &&
                    (convertInt.contains(String.valueOf(digit[5])))    ){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(int i = 100000; i < 990000; i++){
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[3]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[4]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[5])))){

                    System.out.println(i);
                }
                }
                break;
                
            case 7: 
                convertInt = "";

                for(int i = 0; i < 1000000; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) &&
                    (convertInt.contains(String.valueOf(digit[2]))) &&
                    (convertInt.contains(String.valueOf(digit[3]))) &&
                    (convertInt.contains(String.valueOf(digit[4]))) &&
                    (convertInt.contains(String.valueOf(digit[5]))) &&
                    (convertInt.contains(String.valueOf(digit[6])))    ){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(int i = 1000000; i < 9900000; i++){
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[3]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[4]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[5]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[6])))    ){

                    System.out.println(i);
                }
                }
                break;
                
            case 8: 
                convertInt = "";

                for(int i = 0; i < 10000000; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) &&
                    (convertInt.contains(String.valueOf(digit[2]))) &&
                    (convertInt.contains(String.valueOf(digit[3]))) &&
                    (convertInt.contains(String.valueOf(digit[4]))) &&
                    (convertInt.contains(String.valueOf(digit[5]))) &&
                    (convertInt.contains(String.valueOf(digit[6]))) &&
                    (convertInt.contains(String.valueOf(digit[7])))   ){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(int i = 10000000; i < 99000000; i++){
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[3]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[4]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[5]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[6]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[7])))){

                    System.out.println(i);
                }
                }
                break;
                
            case 9: 
                convertInt = "";

                for(int i = 0; i < 100000000; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) &&
                    (convertInt.contains(String.valueOf(digit[2]))) &&
                    (convertInt.contains(String.valueOf(digit[3]))) &&
                    (convertInt.contains(String.valueOf(digit[4]))) &&
                    (convertInt.contains(String.valueOf(digit[5]))) &&
                    (convertInt.contains(String.valueOf(digit[6]))) &&
                    (convertInt.contains(String.valueOf(digit[7]))) &&
                    (convertInt.contains(String.valueOf(digit[8])))  ){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(int i = 100000000; i < 990000000; i++){
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[3]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[4]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[5]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[6]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[7]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[8])))){

                    System.out.println(i);
                }
                }
                break;
                
            case 10: 
                convertInt = "";

                for(int i = 0; i < 1000000000; i++){

                convertInt = "0" + String.valueOf(i);

                if( (convertInt.contains(String.valueOf(digit[0]))) &&
                    (convertInt.contains(String.valueOf(digit[1]))) &&
                    (convertInt.contains(String.valueOf(digit[2]))) &&
                    (convertInt.contains(String.valueOf(digit[3]))) &&
                    (convertInt.contains(String.valueOf(digit[4]))) &&
                    (convertInt.contains(String.valueOf(digit[5]))) &&
                    (convertInt.contains(String.valueOf(digit[6]))) &&
                    (convertInt.contains(String.valueOf(digit[7]))) &&
                    (convertInt.contains(String.valueOf(digit[8]))) &&
                    (convertInt.contains(String.valueOf(digit[9])))    ){

                    System.out.println(i);
                }
                convertInt = "";
                }

                for(long i = 1000000000L; i < 9900000000L; i++){
                if( (String.valueOf(i).contains(String.valueOf(digit[0]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[1]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[2]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[3]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[4]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[5]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[6]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[7]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[8]))) &&
                    (String.valueOf(i).contains(String.valueOf(digit[9])))    ){

                    System.out.println(i);
                }
                }
                break;
            }
    }
}
