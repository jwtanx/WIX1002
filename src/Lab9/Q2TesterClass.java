/*
 2. Define a class PersonProfile. The class has a name, gender and date of birth. The class consists of a constructor and a display method. Derived a Student class from PersonProfile. The Student class has a list of course name and course code, semester, session, mark and a file name. The class consists of a constructor with student profile and file input name. All the information is retrieved from a text file named course.txt. (Please download the file from the Web site.). Create a getGrade method for the mark base on the table below:

Mark    Grade
>= 85   A
>=75    A-
>=70    B+
>=65    B 
>=60    B- 
>=55    C+ 
>=50    C 
>=45    D 
>=35    E 
<35     F 

The Student object can display the student profile as well as course details and the result in grade. Create a Tester class to test the program. 
 */
package Lab9;

import java.io.File;

public class Q2TesterClass {
    public static void main(String[] args) {
        
        File f = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\WIX1002\\src\\Lab9\\Source\\course.txt");
        
        Q2Student a = new Q2Student("Ali", 'M', "123456", f);
        a.transferData();
        a.display();
        
    }
}
