/*
 * 1b. Read from the text file generated in a. Display all the integer and the largest integer.
 */
package Tutorial.T7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class T7Q1B {
    public static void main(String[] args) {
        
        try{
            
            File f = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Tutorial/T7/T7Q1A.txt");
            
            Scanner inputStream = new Scanner(new FileInputStream(f)); 
            
        } catch (IOException e){
            e.printStackTrace();
                    
        }
        
    }
}
