/*
3. Derived a class Lecturer from class PersonProfile. The class has a list of course name, course code, semester, session, credit hour and the number of students registered.  All the information is retrieved from a text file named lecturer.txt. (Please download the file from the Web site.). Write a method to compute the credit hour. If the number of students is 
more than or equal to 150, multiply the credit hour by 3,
if less than 150 and more than or equal to 100, multiply the credit hour by 2.
If less than 100 and more than or equal to 50, multiply the credit hour by 1.5.
Otherwise multiply the credit hour by 1. The lecture object can display the lecturer profile as well as the course profile with the updated credit hour. Create a Tester class to test the program.
 */
package Lab9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3Lecturer extends Q2PersonProfile {

    private String[] courseCode;
    private String[] courseName;
    private int[] session;
    private int[] sem;
    private double[] creditHour;
    private int[] numberOfStudent;
    private File f;

    public Q3Lecturer(String name, char gender, String DOB, File f) {
        super(name, gender, DOB);
        this.f = f;
    }

    public void transferData() {

        int line = 0;
        int numOfCourse;

        try {
            // Getting the number of course
            Scanner s = new Scanner(new FileInputStream(f));

            while (s.hasNextLine()) {
                line++;
                s.nextLine();
            }

            s.close();

            // Initializing the arrays' length
            numOfCourse = line / 5;
            courseCode = new String[numOfCourse];
            courseName = new String[numOfCourse];
            session = new int[numOfCourse];
            sem = new int[numOfCourse];
            creditHour = new double[numOfCourse];
            numberOfStudent = new int[numOfCourse];

            // Transferring the data
            s = new Scanner(new FileInputStream(f));

            for (int i = 0; i < numOfCourse; i++) {
                courseCode[i] = s.nextLine();
                courseName[i] = s.nextLine();
                session[i] = Integer.parseInt(s.nextLine());
                sem[i] = Integer.parseInt(s.nextLine());
                creditHour[i] = Double.parseDouble(s.nextLine());
                numberOfStudent[i] = Integer.parseInt(s.nextLine());
            }
            
            s.close();
            computeCreditHour();

        } catch (FileNotFoundException FNF) {
            System.err.println("File not found!");
        }

    }

    public void computeCreditHour() {

        for (int i = 0; i < courseCode.length; i++) {

            if (numberOfStudent[i] >= 150) {
                creditHour[i] *= 3;
            } else if (numberOfStudent[i] < 150 && numberOfStudent[i] >= 100) {
                creditHour[i] *= 2;
            } else if (numberOfStudent[i] < 100 && numberOfStudent[i] >= 50) {
                creditHour[i] *= 1.5;
            } else {
                creditHour[i] *= 1;
            }

        }
        
    }

    public void display() {

        System.out.println(super.toString());

        for (int i = 0; i < courseCode.length; i++) {
            System.out.println("\nCOURSE " + (i + 1));
            System.out.println("Course Code\t: " + courseCode[i]);
            System.out.println("Course Name\t: " + courseName[i]);
            System.out.println("Session\t\t: " + session[i]);
            System.out.println("Sem\t\t: " + sem[i]);
            System.out.println("Credit Hour\t: " + creditHour[i]);
            System.out.println("Number of student: " + numberOfStudent[i]);

        }
    }
}
