/*
 * 3. Write the statements that replace each line of a text file with its reverse and save it to a new text file name reverse.txt. 
 */
package Lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L7Q3 {

    public static String[] reverse(String[] list) {

        String temp = "";

        for (int i = list.length - 1; i >= 0; i--) {
            for (int j = list[i].length() - 1; j >= 0; j--) {

                temp += list[i].charAt(j);

            }
            list[i] = temp;
            temp = "";
        }

        return list;
    }

    public static void main(String[] args) {

        int line = 0;

        try {

            File src = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/Source/L7Q3SRC.txt");
            File rev = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/L7Q3Reverse.txt");

            Scanner s = new Scanner(new FileInputStream(src));

            while (s.hasNextLine()) {
                s.nextLine();
                line++;
            }

            s.close();
            String[] list = new String[line];

            s = new Scanner(new FileInputStream(src));

            while (s.hasNextLine()) {

                for (int i = 0; i < line; i++) {
                    list[i] = s.nextLine();
                }

            }

            s.close();
            reverse(list);

            PrintWriter p = new PrintWriter(new FileOutputStream(rev));

            for (int i = 0; i < list.length; i++) {

                p.println(list[i]);

            }

            p.close();

        } catch (FileNotFoundException FNF) {
            System.err.println("File not found!");
        }

    }
}
