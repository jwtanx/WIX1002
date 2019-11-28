
package LectureNotes.TU9;

// This is a child class while Staff class is the parent class
public class PermanentStaff extends Staff{
    
    private String grade;

    public PermanentStaff(String name, String ic, String grade) {
        super(name, ic);    // Important Part
        this.grade = grade;
    }
    
    public int getSalary(){
        
        if(grade.equals("EM01")){
            return 7000;
        }
        if(grade.equals("EM02")){
            return 5000;
        }
        if(grade.equals("EM03")){
            return 3000;
        }
        if(grade.equals("EM04")){
            return 1000;
        }
        else
            return 0;
        
    }

    @Override
    public String toString() {
        return super.toString() +
               "Grade : " + grade + "\n" +
               "Salary : " + getSalary() + "\n";
    }
    
    
    
}
