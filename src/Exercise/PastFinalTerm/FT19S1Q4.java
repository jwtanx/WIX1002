/*
 * 4. Ahmad wrote a simple essay about My Ambition and save it in a text file name myAmbition.txt. Write a program for Ahmad to count and print the number of sentences, words and letter frequencies in the essay. A sentence is terminated with a full stop in the essay.

Sample output:

The essay is:
Living in the modern world, a person really
needs to know what he wants to do. In order to lead
a meaningful and colorful life, everyone needs
an ambitions. If one does not have an ambition,
he will be like a ship sailing on the 
wide sea blindly. That is why I have made up my 
mind to become a reporter since my childhood.

Number of sentences : 4
Number of words : 64
A : 20 B : 5 C : 4 D : 15 E : 32 F : 4 G : 3 H : 12 
I : 23 J : 0 K : 2 L : 16 M : 9 N : 24 O : 23 P : 4
Q : 0 R : 11 S : 10 T : 14 U : 3 V : 4 W : 7 X : 0
Y : 6 Z : 0

 */
package Exercise.PastFinalTerm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FT19S1Q4 {
    public static void main(String[] args) {
        
        int word = 0;
        int sentence = 0;
        int[] chars = new int[26];
        
        File directory = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT19S1Sources");
        
        try{
            Scanner s = new Scanner(new FileInputStream(directory + "/FT19S1Q4myAmbition.txt"));
            
            while(s.hasNextLine()){
                
                String line = s.nextLine();
                word += line.split(" ").length;
                
                for(int i = 0; i < line.length(); i++){
                    char ch = line.charAt(i);
                    if(Character.isLetter(ch)){
                        ch = Character.toUpperCase(ch);
                        chars[ch - 'A']++;
                    }
                    if(ch == '.'){
                        sentence++;
                    }
                }
                
            }
            
            s.close();
        } catch (FileNotFoundException fnf){
            System.err.println("File not found!");
        }
        
        System.out.println("Number of sentences : " + sentence);
        System.out.println("Number of words : " + word);
       
        for(int i = 0; i < chars.length; i++){
            
            System.out.printf("%c : %d ", (char)('A' + i), chars[i]);
            
            if((i+1) % 8 == 0){
                System.out.println();
            }
        }
        
    }
}
