/*
 * 4. Write a program that display the number of characters, words and lines in a text file. Assume that each word is separated by one space character.
 */
package Lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L7Q4 {

    public static void main(String[] args) {

        int chars = 0;
        int words = 0;
        int lines = 0;

        try {

            File src = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/Source/L7Q3SRC.txt");

            // Lines
            Scanner s = new Scanner(new FileInputStream(src));
            while (s.hasNextLine()) {
                s.nextLine();
                lines++;
            }
            s.close();

            // Words
            s = new Scanner(new FileInputStream(src));
            while (s.hasNext()) {
                s.next();
                words++;
            }
            s.close();

            // Characters
            s = new Scanner(new FileInputStream(src));
            String str = "";
            
            while (s.hasNextLine()) {
                str += s.nextLine();
            }
            
            String temp = str.replaceAll(" ", "");
            chars = temp.length();
            
            s.close();

        } catch (FileNotFoundException FNF) {
            System.err.println("File not found!");
        }

        System.out.printf("Line: %d\nWord: %d\nChar: %d\n", lines, words, chars);
    }
}
