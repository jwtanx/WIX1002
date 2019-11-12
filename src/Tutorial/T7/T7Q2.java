/*
 * 2. Correct the error for the following statements.
        a. PrintWriter out = new PrintWriter(new FileOutputStream ("d:\data\matrix.txt"));

        b.  try {    
                PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
                out.close();
            } catch (FileNotFoundException e) {
                System.out.println("Problem with file output"); }  

        c.  int num;
            Scanner a = new Scanner(new FileInputStream("data.dat"));
            num = a.readInt();
            a.close();

        d.  ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
            o.print('A');
            o.close();
 */
package Tutorial.T7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author User
 */
public class T7Q2 {
    public static void main(String[] args) {
        
        // Q2A
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream ("d:/data/matrix.txt"));
            
            // ...
            
            out.close();
        } catch(IOException IO){
            System.err.println("Problem with file output!");
        }
        
        // Q2B
        try {    
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));

            // ...

            out.close(); 
                
        } catch (IOException IO) {
            System.out.println("Problem with file output"); 
        }
        
        // Q2C
        int num;
        try{
            
            ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
            try{
                while(true){
                    num = a.readInt();
                    System.out.println(num);
                }
            } catch(EOFException EOF){
                
            }
            
            a.close();
            
        } catch(FileNotFoundException FNF){
            System.err.println("File not found!");
        } catch(IOException IO){
            System.err.println("Problem with file output!");
        }
        
        // Q2D
        try{
            ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
            
            o.writeChar('A');
            o.close();
            
        } catch(IOException IO){
            System.err.println("Problem with file output!");
        }
    }
}
