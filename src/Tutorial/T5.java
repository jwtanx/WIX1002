/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */


public class T5 {
    
static Random r = new Random();
static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        /*
        1. Write statements for each of the following
            a. Declare an array that used to store 12 floating point numbers.
            b. Initialize an array that used to store the value of A to E.
            c. Declare an array that used to store 100 students name.
            d. Declare an array for a table with 6 rows 2 columns that used to store integer
            value.
            e. Initialize an array with the following value:
                6   9
                2   5
                4   6
            f. After initialize the array, modify the value of the above array to
                6   9
                2   4
                3   7
        
            g. Display all the values of an array name contact in separate lines
        */
        
        //Q1A
        double[] floatArray = new double[12];
        
        //Q1B
        char[] A2E = {'A', 'B', 'C', 'D', 'E'};
        
        //Q1C
        String[] studentName = new String[100];
        
        //Q1D
        int[][] table = new int[6][2];
        
        //Q1E
        System.out.println("Before modifying");
        int[][] matrix = {{6, 9}, 
                          {2, 5}, 
                          {4, 6} };
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        //Q1F
        System.out.println("\nAfter modifying:");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(row == 1 && col == 1){
                    matrix[row][col] = 4;
                }
                if(row == 2 && col == 0){
                    matrix[row][col] = 3;
                }
                if(row == 2 && col == 1){
                    matrix[row][col] = 7;
                }
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        //Q1G
        String contact[] = {"Abu", "Ali", "Ah Peng", "Muthu"};
        System.out.println("\nName of contacts:");
        for(int g = 0; g < contact.length; g++) System.out.println(contact[g]);
        
        /*
        2. Correct the error for the following statements.
            a.
                String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
            b.
                int[] num = new num[10];
                for(int k=0; k<=num.length(); k++)
                    sum+=num;
            c.
                int [][]t = new int[3][];
                t[1][2] = 5;
            d.
                int i=4;
                int []score = new int[5];
                score [1] = 78;
                score[++i] = 100;
        */
        
        //Q2A
        String[] code = {"AAA", "AAB", "AAC", "AAD"};
        
        //Q2B
        int[] num = new int[10];
        int sum = 0;
        
        for(int k = 0; k < num.length; k++){
            num[k] = r.nextInt(100);
            sum += num[k];
        }
        
        System.out.println("\n" + sum);
        
        //Q2C
        int[][] t = new int[3][];
        t[1] = new int[10];
        t[1][2] = 5;
        System.out.println(t[1][2]);
        
        //Q2D
        int i = 4;
        int[] score = new int[6];
        score[1] = 78;
        score[++i] = 100;
        System.out.println(score[i]);
        
        
        //3. Determine the values of each element of array marks. Assume the array was declared as:
        System.out.println();
        int[] marks = new int[5];
        i = 0;
        int j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j-1] = marks[j] * marks [j];
        marks[j*3] = marks[i+1];
        marks[++j] = marks[i]%5; // <---    j -> 1+1 = 2
        marks[2*j] = marks[j-1];

        for(int a = 0; a < marks.length; a++){
            System.out.print(marks[a] + ", ");
        }

        //Answer
        //int[] marks = {12, 31, }
        //marks = {961, 31, 1, 31, 31};
        
        //4. Write the statements that display the number of occurrence of the word "the" (case
        //   sensitive) in a string array name sentence. 
        
        System.out.print("\n\nType a sentence: ");
        String userSen = s.nextLine();
        String[] sentence = userSen.split("\\W+");
        
        System.out.print("Enter the word you want to find its frequency in the sentence above: ");
        String word = s.next();
        
        System.out.print("\nSentence: ");
        for(String ss : sentence) System.out.print(ss + " ");
        int cnt = 0;
        
        for(int k = 0; k < sentence.length; k++){
            
            if(sentence[k].equals(word)) cnt++;
            
        }
        
        System.out.printf("\nThe number of occurance for the word \"%s\": %d\n", word, cnt);
        
        /* NOT SUGGESTED AS "thethe" the output of the count of "the" is 2
        int cnt = 0, index = 0;
        
        for(int k = 0; k < sentence.length; k++){
            index = 0;
            
            while((index = sentence[k].indexOf(word, index)) != -1){
                System.out.println(sentence[k]);
                index++;
                System.out.println("index: " + index);
                cnt++;
                System.out.println("count " + cnt);
            }
        }
        System.out.printf("\nThe number of occurance for the word \"%s\": %d\n", word, cnt);
        */
        
        /* WRONG UNDERSTANDING
        int numOfPossible = (int) Math.pow(2, word.length());
        
        System.out.println("\n\nThe number of possible sentive cases: " + numOfPossible);
        
        //String[] possibleCase = new String[numOfPossible];
        
        String[] possibleCase = {"THE", "THe", "The", "ThE", "the", "tHE", "tHe", "thE"};
        
        for(String words : possibleCase)System.out.print(words + ", ");
        
        System.out.println();
        */
        /*
        String[][] possibleCase = new String[numOfPossible][word.length()];
        for(int prow = 0; prow < possibleCase.length; prow++){
            for(int pcol = 0; pcol < possibleCase[prow].length; pcol++){
                for(int upperOrLower = 0; upperOrLower <= 1; upperOrLower++){
                    if(upperOrLower == 0) System.out.println(possibleCase[prow][pcol].toLowerCase());
                    if(upperOrLower == 1) System.out.println(possibleCase[prow][pcol].toUpperCase());
                }
            }
            System.out.println("");
        }
        */
        
        /*
        5. Write the statements that display the string array name sentence in reverse order.
        Each string element must be displayed in reverse order as well.
        */
        
        String[] sen = {"Abu is reading", "Ah Meng is sleeping", "racecar si racecar", "Muthu Toh"};
        String[] reversedList = new String[sen.length];
        String reverse = "";
        {
        for(int c = 0; c < sen.length; c++){
            System.out.println("\nSentence: " + sen[c]);
            
            System.out.print("Reversed: ");
            for(int k = 0; k < sen[c].length(); k++){
                reverse += sen[c].charAt(sen[c].length() - k - 1);
                System.out.print(sen[c].charAt(sen[c].length() - k - 1));
                
                // FOR SUBSTRING
                //reverse += sen[c].substring(sen[c].length() - (k + 1), sen[c].length() - k);
                //System.out.print(sen[c].substring(sen[c].length() - (k + 1), sen[c].length() - k));
            }
            
            System.out.println();
            reversedList[c] = reverse;
            reverse = "";
        }
        
        System.out.print("\n============\nReversed list: ");
        for(String x : reversedList) System.out.print(x + ", ");
        System.out.println();
        
        /*
        6. Write the statements that generate 1 random integer within 0 – 255. Convert the
        number to binary and store the bit into an 8 bit array. Then, display the binary
        number
        */
        
        int rnum = r.nextInt(256);
        int[] bit = new int[8];
        int re;
        
        System.out.println("\nThe random number: " + rnum);
        
        // Correct version based on theory
        for(int b = 0; b < bit.length; b++){
            re = rnum % 2;
            bit[b] = re;
            rnum /= 2;
        }
        
        System.out.print("The bit: ");
        
        for(int c = 0; c < bit.length; c++){
            System.out.print(bit[bit.length - c - 1]);
        }
        
        /* Wrong version
        for(int b = bit.length - 1; b >= 0; b--){
            re = rnum % 2;
            rnum /= 2;
            bit[b] = re;
        }
        
        for(int a : bit){
            System.out.print(a + " ");
        }
        */
        System.out.println("\n\nDone @ 151019, 05:45");
        }
    }
}
