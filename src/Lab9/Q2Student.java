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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2Student extends Q2PersonProfile{
    
    private String[] courseCode;
    private String[] courseName;
    private int[] session;
    private int[] sem;
    private int[] mark;
    private String[] grade;
    private File f;

    public Q2Student(String name, char gender, String DOB, File fileName) {
        super(name, gender, DOB);
        f = fileName;
    }
    
    public void transferData(){
        
        int line = 0;
        int numOfCourse;
        
        try{
            // Getting the number of course
            Scanner s = new Scanner(new FileInputStream(f));
            
            while(s.hasNextLine()){
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
            mark = new int[numOfCourse];
            grade = new String[numOfCourse];
            
            // Transferring the data
            s = new Scanner(new FileInputStream(f));
            
            for(int i = 0; i < numOfCourse; i++){
                courseCode[i] = s.nextLine();
                courseName[i] = s.nextLine();
                session[i] = Integer.parseInt(s.nextLine());
                sem[i] = Integer.parseInt(s.nextLine());
                mark[i] = Integer.parseInt(s.nextLine());
            }
            
            s.close();
            
            transferMark();
            
        } catch (FileNotFoundException FNF){
            System.err.println("File not found!");
        }
        
    }
    
    public void transferMark(){
        
        for(int i = 0; i < grade.length; i++){
            grade[i] = getGrade(mark[i]);
        }
        
    }
    
    public String getGrade(int mark){
        
        if(mark >= 85){
            return "A";
        }
        else if(mark >= 75 && mark < 85){
            return "A-";
        }
        else if(mark >= 70 && mark < 75){
            return "B+";
        }
        else if(mark >= 65 && mark < 70){
            return "B";
        }
        else if(mark >= 60 && mark < 65){
            return "B-";
        }
        else if(mark >= 55 && mark < 60){
            return "C+";
        }
        else if(mark >= 50 && mark < 55){
            return "C";
        }
        else if(mark >= 45 && mark < 50){
            return "D";
        }
        else if(mark >= 35 && mark < 45){
            return "E";
        }
        else if(mark < 35){
            return "F";
        }
        
        return "Undefined";
    }
    
    public void display(){
        
        System.out.println(super.toString());
        
        for(int i = 0 ; i < courseCode.length; i++){
            System.out.println("\nCOURSE " + (i+1));
            System.out.println("Course Code\t: " + courseCode[i]);
            System.out.println("Course Name\t: " + courseName[i]);
            System.out.println("Session\t\t: " + session[i]);
            System.out.println("Sem\t\t: " + sem[i]);
            System.out.println("Marks\t\t: " + mark[i]);
            System.out.println("Grade\t\t: " + grade[i]);
            
        }
        
    }
    
}