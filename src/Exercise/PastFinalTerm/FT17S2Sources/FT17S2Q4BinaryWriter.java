/*
 * 4. A scientist would like to display the day of the week based on the records stored in a binary file (Q4.dat). Each record in the binary file contains q, m and y in order.

25/3/2017 is on Saturday 
29/2/2100 is invalid Input 
19/1/2017 is on Thursday 
31/9/2015 is invalid Input 
31/5/2017 is on Wediesday 
29/2/2016 is on Monday

 */
package Exercise.PastFinalTerm.FT17S2Sources;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FT17S2Q4BinaryWriter {
    public static void main(String[] args) {
        
        File directory = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT17S2Sources");
        
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "/FT17S2Q4Dates.dat"));
            
//          25/3/2017
            out.writeInt(25);
            out.writeInt(3);
            out.writeInt(2017);
            
//          29/2/2100
            out.writeInt(29);
            out.writeInt(2);
            out.writeInt(2100);
            
//          19/1/2017
            out.writeInt(19);
            out.writeInt(1);
            out.writeInt(2017);
            
//          31/9/2015
            out.writeInt(31);
            out.writeInt(9);
            out.writeInt(2015);
            
//          31/5/2017
            out.writeInt(31);
            out.writeInt(5);
            out.writeInt(2017);
            
//          29/2/2016
            out.writeInt(29);
            out.writeInt(2);
            out.writeInt(2016);

            out.close();
        } catch (IOException ioe){
            System.err.println("Problem with file");
        }
    }
}
