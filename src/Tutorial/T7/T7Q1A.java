/*
 * 1a. Store ten random integers within 0 to 1000 to a text file name integer.txt
 */
package Tutorial.T7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
//import java.util.Date;

/**
 *
 * @author User
 */
public class T7Q1A {

    public static void main(String[] args) {

        Random r = new Random();
        //Date date = new Date();

        try {
            
            File file = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Tutorial/T7/Files/T7Q1A.txt");
            
            /*
            if(file.exists()){
                file.delete();
            }
            
            file.createNewFile();
            */
            
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(file));
            
            //outputStream.println(date);

            for (int i = 0; i < 10; i++) {
                outputStream.print(r.nextInt(1001));
            }
            
            //outputStream.flush();
            outputStream.close();
            
        } catch (IOException e) {
            //e.printStackTrace();
            System.err.println("Problem with file");
        }

    }
}
