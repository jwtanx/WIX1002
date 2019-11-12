/*
 * 1d. Read from the binary file generated in 1c. Display the all the integer and the average.
 */
package Tutorial.T7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author User
 */
public class T7Q1D {
    public static void main(String[] args) {
        
        int num = 0, sum = 0, numOfNum = 0;
        int average;
        
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Tutorial/T7/Files/T7Q1Cinteger.dat"));
            
            try{
                while(true){
                    num = in.readInt();
                    System.out.print(num + " ");
                    sum += num;
                    numOfNum++;
                }
            } catch(EOFException EOF){
                
            }
            
            average = sum / numOfNum;
            System.out.println("\nAverage: " + average);
            
            in.close();
            
        } catch(FileNotFoundException FNF){
            System.err.println("File not found!");
        } catch(IOException IO){
            System.err.println("Problem with file!");
        }
        
    }
}
