/*
 * 1b. Read from the text file generated in a. Display all the integer and the largest integer.
 */
package Tutorial.T7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class T7Q1B {

    public static void main(String[] args) {

        int[] getNum = new int[10];
        int max = 0;

        try {

            File f = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Tutorial/T7/Files/T7Q1A.txt");
            Scanner inputStream = new Scanner(new FileInputStream(f));
            
            for (int i = 0; i < 10; i++) {
                
                getNum[i] = inputStream.nextInt();

                if (getNum[i] > max) {
                    max = getNum[i];
                }

            }

            System.out.print("The numbers are: ");
            for (int num : getNum) {
                System.out.print(num + " ");
            }

            System.out.println("\nThe largest number: " + max);

        } catch (IOException ioe) {
            
            ioe.printStackTrace();

        }
        
    }
}
