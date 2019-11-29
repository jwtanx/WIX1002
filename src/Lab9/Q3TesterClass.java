/*
3. Derived a class Lecturer from class PersonProfile. The class has a list of course name, course code, semester, session, credit hour and the number of students registered.  All the information is retrieved from a text file named lecturer.txt. (Please download the file from the Web site.). Write a method to compute the credit hour. If the number of students is more than or equal to 150, multiply the credit hour by 3, if less than 150 and more than or equal to 100, multiply the credit hour by 2. If less than 100 and more than or equal to 50, multiply the credit hour by 1.5. Otherwise multiply the 2 credit hour by 1. The lecture object can display the lecturer profile as well as the course profile with the updated credit hour. Create a Tester class to test the program.
*/
package Lab9;

import java.io.File;

public class Q3TesterClass {
    
    public static void main(String[] args) {
        File f = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\WIX1002\\src\\Lab9\\Source\\lecturer.txt");

        Q3Lecturer l = new Q3Lecturer("Dr. Ang", 'M', "01011970", f);
        l.transferData();
        l.display();
        
    }
    
}
