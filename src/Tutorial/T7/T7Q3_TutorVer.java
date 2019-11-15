/*
 * 3. Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence. 
 */
package Tutorial.T7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class T7Q3_TutorVer {
    public static void main(String[] args) {
        
        String str = "This is a sentence!";
        String bin = "";
        
        byte[] bytes = str.getBytes(); // convert string to byte

        //System.out.println(Arrays.toString(bytes));
        
        for(byte b : bytes){
            int val = b;
            for(int i = 0; i < 8; i++){
                if((val&128) == 0){
                    bin += "0";
                }
                else{
                    bin += "1";
                }
                val <<= 1; //left shift bitwise operator; binary left shift operator
            }
        }

        try{
            
            PrintWriter p = new PrintWriter(new FileOutputStream("data.txt"));
            
            p.print(bin);
            
            p.close();
            
        } catch(IOException IO){
            System.err.println("Problem with file output!");
        }
        
        //to read it
        String str1 = "";
        
        try{
            Scanner s = new Scanner(new FileInputStream("data.txt"));
            
            for(int i = 0; i < bin.length()/8; i++){
                int a = Integer.parseInt(bin.substring(8*i, (i+1)*8), 2);
                str1 += (char) a;
            }
            
            s.close();
            
        } catch(FileNotFoundException FNF){
            System.err.println("File not found!");
        }
        
        System.out.println("The sentence: " + str1);
        
    }
}
