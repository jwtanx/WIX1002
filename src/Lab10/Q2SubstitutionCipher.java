/*
2. Create an interface MessageEncoder that has a method encode(plainText) where plainText is the message to be encoded.  The method returns the cipher text. Create another method decode(). The method returns the plain text. Create a class SubstitutionCipher that implements the interface MessageEncoder. The constructor has parameters inputFileName, outputFileNam and shift. Define the method encode that shifted the letter by shifting the positive value and the method decode that shift the letter by shifting the negative value. The class read the plainText from inputFile and output the cipherText to outputFile. Besides, the class also can read the cipher text from inputFile and output the plain text to outputFile. Create a Tester class to test the program. 
 */
package Lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author User
 */
// can implements 
public class Q2SubstitutionCipher implements Q2MessageEncoder{
    
    private String directory = "C:\\Users\\User\\Documents\\NetBeansProjects\\WIX1002\\src\\Lab10\\Source\\";
    private String inputFileName, outputFileName;
    private int shift;

    public Q2SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = directory + inputFileName;
        this.outputFileName = directory + outputFileName;
        this.shift = shift;
    }
    
    public void encode(){
        
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream(outputFileName));
            Scanner s = new Scanner(new FileInputStream(inputFileName));
            
            System.out.println("Encoded: ");
            while(s.hasNextLine()){
                
                String str = s.nextLine();
                for(int i = 0; i < str.length(); i++){
                    
                    p.print((char)(str.charAt(i) + shift));
                    System.out.print((char)(str.charAt(i) + shift));
                    
                }        
                p.println();
                System.out.println();
            }
            p.close();
            s.close();
            
        } catch(FileNotFoundException fnf){
            System.err.println("File not found!");
        } catch(IOException ioe){
            System.err.println("");
        }
        
    }
    
    public void decode(){
        
        try{
            Scanner s = new Scanner(new FileInputStream(outputFileName));
            
            System.out.println("\nDecoded: ");
            
            while(s.hasNextLine()){
                
                String str = s.nextLine();
                
                for(int i = 0; i < str.length(); i++){
                    System.out.print((char)((int)str.charAt(i) - shift));
                }
                
                System.out.println();
            }
            
            s.close();
        } catch(FileNotFoundException fnf){
            System.err.println("File not found");
        }
        
        
    }
    
}
