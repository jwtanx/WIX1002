/*
 * 5. Write a program that read data from a binary file person.dat. (Please download the binary file from the Web site.)
Then, display the name, age and gender (M – Male, F – Female) in ascending order sort by name.
The structure of the binary file is as below:

<intVariable-TotalNumberofRecord>
<StringVariable-Name><IntVariable-Age><CharVariable-Gender> 
<StringVariable-Name><IntVariable-Age><CharVariable-Gender>
 */
package Lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author User
 */
public class L7Q5 {

    public static void main(String[] args) {

        int TotalNumberofRecord = 0;

        try {

            File personFile = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab7/Files/Source/person.dat");

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(personFile));

            try {
                while (true) {
                    TotalNumberofRecord = in.readInt();
                    break;
                }
            } catch (EOFException EOF) {
            }
            in.close();

            String[] Name = new String[TotalNumberofRecord];
            int[] Age = new int[TotalNumberofRecord];
            char[] Gender = new char[TotalNumberofRecord];

            in = new ObjectInputStream(new FileInputStream(personFile));

            try {
                while (true) {
                    in.readInt();

                    for (int i = 0; i < TotalNumberofRecord; i++) {

                        Name[i] = in.readUTF();
                        Age[i] = in.readInt();
                        Gender[i] = in.readChar();

                    }
                }
            } catch (EOFException EOF) {
            }
            in.close();

            System.out.printf("Total Number of Record: %d\n", TotalNumberofRecord);
            System.out.println("No Name\t\t\tAge\tGender");

            for (int i = 0; i < TotalNumberofRecord; i++) {
                System.out.printf("%d. %s\t\t%d\t%c\n", i + 1, Name[i], Age[i], Gender[i]);
            }

        } catch (FileNotFoundException FNF) {
            System.err.println("File not found!");
        } catch (IOException IO) {
            System.err.println("Problem with file output!");
        }

    }
}
