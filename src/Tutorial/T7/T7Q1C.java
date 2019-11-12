/*
 * 1c. Store ten random integers within 0 to 1000 to a binary file name integer.dat.
 */
package Tutorial.T7;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author User
 */

public class T7Q1C {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Tutorial/T7/Files/T7Q1Cinteger.dat"));
            
            for(int i = 0; i < 10; i++){
                out.writeInt(r.nextInt(1001));
            }
            
            out.close();
            
        } catch(IOException e){
            System.err.println("File not found!");
        }
        
    }
}
