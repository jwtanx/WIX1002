/*
 * Write a program that store the table below in a binary file name course.dat. Then, ask the users to enter a course code. The program will display the course name from course.dat.

Course Code     Course Name 
WXES1116        Programming I 
WXES1115        Data Structure
WXES1110        Operating System 
WXES1112        Computing Mathematics 
 */
package Lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L7Q1 {

    public static void main(String[] args) {

        String[][] course = {{"WXES1116", "Programming I"},
        {"WXES1115", "Data Structure"},
        {"WXES1110", "Operating System"},
        {"WXES1112", "Computing Mathematics"}};

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/course.dat"));

            for (int i = 0; i < course.length; i++) {
                for (int j = 0; j < course[i].length; j++) {
                    out.writeUTF(course[i][j]);
                }
            }

            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/course.dat"));

            Scanner s = new Scanner(System.in);
            System.out.print("Enter your course code\t: ");
            String code = s.nextLine();
            String temp;

            try {
                while (true) {
                    temp = in.readUTF();
                    if (code.equalsIgnoreCase(temp)) {
                        System.out.println("Your course name\t: " + in.readUTF());
                        break;
                    }
                }
            } catch (EOFException EOF) {

            }

        } catch (IOException IO) {
            System.err.println("Problem with file output!");
        }

    }
}
