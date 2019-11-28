/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes.TU9;

public class Student extends Lecturer{ // All the variable from Lecturer(Parent class) can be used by student(Child class)
    
    private String matricNumber, fullName;

    public Student(String matricNumber, String fullName) {
        this.matricNumber = matricNumber;
        this.fullName = fullName;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExamTopic(){
        return examTopic;  // <-- to use Parent variable, change private to protected
    }
    
    public String toString() {
        return "Student Name = " + fullName + "\n" +
               "Matric Numer = " + matricNumber + "\n" +
               super.toString(); // <-- calling parent toString method
    }
    
}
