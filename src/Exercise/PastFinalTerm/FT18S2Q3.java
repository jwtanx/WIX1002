/*
 * 3. The text file, student.txt, contains 10 student names and their final exam marks. Those who did not sit for the exam will get -1 as their marks. Write a program that reads from the text file, the students' names, into a String array named names and the respective marks into an array of type double named marks. Search the marks array for the highest and lowest mark and identify the student who got the highest and lowest mark from the names array. Count the number of students who did not come for the exam. (The text file is available in your exam account directory.) 

Sample output: 
The student with the highest mark : Frankenstein Jr 97 
The student with the lowest mark : Chewbacca Chewy 10 
The number of students who were absent from the exam : 3

 */
package Exercise.PastFinalTerm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FT18S2Q3 {
    public static void main(String[] args) {
        
        File directory = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT18S2Sources");
        
        String[] names = new String[10];
        int[] marks = new int[10];
        
        try{
            Scanner s = new Scanner(new FileInputStream(directory + "/FT18S2Q3Student.txt"));
            
            for(int i = 0; i < 10; i++){
                String[] temp = s.nextLine().split(",");
                names[i] = temp[0];
                marks[i] = Integer.parseInt(temp[1]);
            }
            
            s.close();
            
        } catch(FileNotFoundException fnf){
            System.err.println("File not found!");
        } 
        
        int highest = 0;
        int indexOfHighest = 0;
        int lowest = 101;
        int indexOfLowest = 0;
        int numOfAbsent = 0;
        
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == -1){
                numOfAbsent++;
            } else {
                if(marks[i] > highest){
                    highest = marks[i];
                    indexOfHighest = i;
                }
                if(marks[i] < lowest){
                    lowest = marks[i];
                    indexOfLowest = i;
                }
            }
        }
        
        /*
        Sample output: 
        The student with the highest mark : Frankenstein Jr 97 
        The student with the lowest mark : Chewbacca Chewy 10 
        The number of students who were absent from the exam : 3
        */
        
        System.out.printf("The student with the highest mark : %s %d\n", names[indexOfHighest], marks[indexOfHighest]);
        System.out.printf("The student with the lowest mark : %s %d\n", names[indexOfLowest], marks[indexOfLowest]);
        System.out.println("The number of students who were absent from the exam : " + numOfAbsent);
        
    }
}
