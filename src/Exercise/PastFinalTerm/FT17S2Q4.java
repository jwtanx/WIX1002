/*
 * 4. Zeller's congruence is used to calculate the day of the week. Given the following formula: 
         /    | 13(m + 1) |       |  K  |   |  J  |     \
    h = | q + | --------- | + K + | --- | + | --- | + 5J | mod 7
         \    |_    5    _|       |_ 4 _|   |_ 4 _|     /

Symbol  Description day of the week 
h       day of the week(0: Saturday, 1: Sunday, 2: Monday ... 6:Friday) 
q       day of the month
m       month (3: March, 4: April, . 12:December, January and February are counted as 13 and 14 of the previous year)
y       year 
J       century = year/100 
K       year of the century = year modulus 100 

A scientist would like to display the day of the week based on the records stored in a binary file (Q4.dat). Each record in the binary file contains q, m and y in order. Write a program to help the scientist to display the output. The program contains a class named DayofTheWeek. The class must contain the following: 

- Instance variables for the symbols above. 
- A constructor that contains q, m and y as arguments. 
- A method to ensure that the valid day of the month including determine whether the year is a leap year. A leap year is a calendar year containing one additional day in February 
- A method to determine whether the year is a loap year. A loap yoar is divisible by 4 but not by 100, In addition, a leap year is also divisible by 400 
- A method to display the day of the woek.

Write a tester class to read all the records from the binary file (Q4.dat) and assign the value to the DayOfTheWeek object. 

(Copy the Q4.dat file from your exam account directory. Save the tester class in Main.java file. Copy DayOfTheWeek.java and Main.java file to your exam account directory and rename the Main.java as (matricNumberQ4.java; example: WMA160001Q4.java].

Sample output: 
25/3/2017 is on Saturday 
29/2/2100 is invalid Input 
19/1/2017 is on Thursday 
31/9/2015 is invalid Input 
31/5/2017 is on Wediesday 
29/2/2016 is on Monday
 */
package Exercise.PastFinalTerm;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FT17S2Q4 {
    public static void main(String[] args) {
        
        
        File directory = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT17S2Sources");
        
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(directory + "/FT17S2Q4Dates.dat"));
            
            try{
                while(true){
                    int q = in.readInt();
                    int m = in.readInt();
                    int y = in.readInt();
                    FT17S2Q4DayOfTheWeek a = new FT17S2Q4DayOfTheWeek(q, m, y);
                    System.out.println(a.toString());
                }
            } catch (EOFException eof){
            }
            
            in.close();
        } catch (FileNotFoundException fnf){
            System.err.println("File not found!");
        } catch (IOException e){
            System.err.println("Problem with file");
        }
        
    }
}
