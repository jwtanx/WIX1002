/*
 * 3. Ahmad conducted an experiment and save the data in a text file named raw.txt. The text file consists of even number from 2 - 10. Write a Java program to create a frequency distribution table. A frequency distribution table summarizes values and their frequency. Then, find the mode of the data.

Sample output:
Frequency Distribution Table
2 : 9
4 : 9
6 : 13
8 : 10
10 : 9
The mode of the dataset is : 6
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


public class FT20S1Q3 {
    public static void main(String[] args) {
        
        File Directory = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT20S1Sources");
        
        String[] data = {};
        
        try{
            Scanner s = new Scanner(new FileInputStream(Directory + "/FT20S1Q3Raw.txt"));
            
            data = s.nextLine().split(" ");
            
            s.close();
        } catch (FileNotFoundException fnf){
            System.err.println("File not found!");
        }
        
        int[] convertData = new int[data.length];
        for(int i = 0; i < data.length; i++){
            convertData[i] = Integer.parseInt(data[i]);
        }
        
        int[] finalData = new int[11];
        
        for(int i = 0; i < convertData.length; i++){
            finalData[convertData[i]]++;
        }
        
        // Displaying the table
        System.out.println("Frequency Distribution Table");
        
        int mode = 0;
        for(int i = 0; i < finalData.length; i++){
            
            if(finalData[i] != 0){
                System.out.println(i + " : " + finalData[i]);
                
                if(finalData[i] > finalData[mode]){
                    mode = i;
                }
                
            }
            
        }
        
        System.out.println("The mode of the dataset is : " + mode);
        
// BEHIND THE SCENE BEHIND THE SCENE BEHIND THE SCENE BEHIND THE SCENE BEHIND THE SCENE BEHIND THE SCENE BEHIND THE SCENE BEHIND THE SCENE
        
        /* RANDOM GENERATOR
        Random r = new Random();
        int[] num = {2, 4, 6, 8, 10};
        int[] freq = {9, 9, 13, 10, 9};
        int[] sort = new int[50];

        for(int i = 0; i < 50;){
            int c = r.nextInt(5);
            
            if(freq[c] != 0){
                sort[i] = num[c];
                freq[c]--;
                i++;
            }
        }
        
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream("FT20S1Q3Raw.txt"));
            
            for(int a : sort){
                pw.print(a + " ");
            }
            
            pw.close();
        } catch (IOException ioe){
            System.err.println("Problem with files");
        }
        //*/
    }
}
