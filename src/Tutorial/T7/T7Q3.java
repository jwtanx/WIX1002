/*
 * 3. Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence. 
 */
package Tutorial.T7;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class T7Q3 {
    
    public static String to8Bits(String str){
        
        char[] clist = str.toCharArray();
        String bin = "";
        String temp;
        
        // First version
        /*
        int bit2Add;
        for(int i = 0; i < clist.length; i++){
            temp = Integer.toBinaryString(clist[i]);
            
            if(temp.length() == 8){
                bin += (temp + " ");
            }
            else if(temp.length() < 8){
                bit2Add = 8 - temp.length();
                
                for(int c = 0; c < bit2Add; c++){
                    bin += "0";
                }
                
                bin += (temp + " ");
            }
            else{
                System.err.println("One of the character's ASCII code in your string exceed 8 bits");
                return null;
            }
        }

        */
        // Latest version
        for(int i = 0; i < clist.length; i++){
            temp = String.format("%08d", Integer.parseInt(Integer.toBinaryString(clist[i])));
            bin += temp + " ";
        }
        
        return bin;
    } 
    
    public static void main(String[] args) {
        
        try{
            
            PrintWriter pw = new PrintWriter(new FileOutputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Tutorial/T7/Files/T7Q3data.txt"));
            
            pw.print(to8Bits("This is a sentence!!!"));
            pw.close();
            
            Scanner in = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Tutorial/T7/Files/T7Q3data.txt"));
            String sentence = "";
            String tmp = "";
            while(in.hasNext()){
                
                tmp = in.next();
                // System.out.println(tmp);
                sentence += (char)Integer.parseInt(tmp, 2);
                
            }
            
            System.out.println("The sentence is \"" + sentence + "\"");
            in.close();
            
        } catch(IOException IO){
            System.err.println("Problem with file output!");
        }
    }
}
