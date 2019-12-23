/*
 * 3. Write a program that generates a random six-character string from the ASCII table and sort it in ascending and descending order. The string will be generated from the random numbers generated based on the ASCII table. The generated string has to be stored in a text file named data.txt. The program will then sort the string in ascending and descending order and display the output for both the sorted strings. The original string should also be displayed at the end of the program by reading the text file, data.txt, created earlier. The program should include: A string (6 letters) based on the random sequence from the ASCII table. The random number must in the range of values from the table below. Only alphabets are allowed. A text file to store and read the generated string. A sort method that accepts two arguments. The first argument is a character array that needs to be sorted. The second argument is a symbol to denote whether the sorting is ascending >'or descending'<' mode. The sorting mechanism used is Bubble Sort.

Sample output:
The string generated is: SsJeFu
String sorted in ascending order: FJSesu
String sorted in descending order: useSJF
Original string from file: SsJeFu

ASCII
A -> Z = 65 -> 90
a -> z = 97 -> 122
 */
package Exercise.PastFinalTerm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FT17S1Q3 {
    public static void main(String[] args) {
        
        Random r = new Random();
        int n = 6;
        
        char[] string = new char[n];
        
        // GENERATE
        for(int i = 0; i < string.length;){
            int num = 65 + r.nextInt(57);
            
            if (num > 90 && num < 97) {

            } else {
                string[i] = (char) num;
                i++;
            }
        }
        System.out.print("The string generated is: ");
        for(int i = 0; i < string.length; i++){
            System.out.print(string[i]);
        }
        
        // WRITE TO FILE
        File data = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT17S1Sources/Q3Data.txt");
        
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(data));
            
            for(int i = 0; i < string.length; i++){
                pw.print(string[i]);
            }
            
            pw.close();
        } catch (IOException ioe){
            System.err.println("Problem with file");
        }
        
        // ASCENDING ORDER
        for(int pass = 0; pass < string.length - 1; pass++){
            for(int i = 0; i < string.length - 1; i++){
                if(string[i] > string[i + 1]){
                    char temp = string[i];
                    string[i] = string[i + 1];
                    string[i + 1] = temp;
                }
            }
        }
        
        System.out.print("\nString sorted in ascending order: ");
        for(int i = 0; i < string.length; i++){
            System.out.print(string[i]);
        }
        
        // DESCENDING ORDER
        for(int pass = 0; pass < string.length - 1; pass++){
            for(int i = 0; i < string.length - 1; i++){
                if(string[i] < string[i + 1]){
                    char temp = string[i];
                    string[i] = string[i + 1];
                    string[i + 1] = temp;
                }
            }
        }
        System.out.print("\nString sorted in descending order: ");
        for(int i = 0; i < string.length; i++){
            System.out.print(string[i]);
        }
        
        // READ Original string from file
        System.out.print("\nOriginal string from file: ");
        try{
            Scanner sc = new Scanner(new FileInputStream(data));
            
            while(sc.hasNextLine()){
                
                System.out.println(sc.nextLine());
                
            }
            
            
            sc.close();
        } catch (FileNotFoundException fnf){
            System.err.println("File not found!");
        }
        
    }
}
