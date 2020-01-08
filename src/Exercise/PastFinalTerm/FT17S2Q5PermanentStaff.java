/*
 * 5. Design a PermanentStaff class that extends the Staff class. The PermanentStaff class has the following members: 
- A field for the grade of the staff. 
- A constructor vith arguments, 
- A getSalary method that computes salary based on the table below. 
- A toString method that displays the staff's grade and salary.

Grade   Salary (RM) 
EM01    7000
EM02    5000 
EM03    3000 
EM04    1000

Salary Table
 */
package Exercise.PastFinalTerm;

public class FT17S2Q5PermanentStaff extends FT17S2Q5Staff{
    
    private  String grade;

    public FT17S2Q5PermanentStaff(String fullName, String IC, String grade) {
        super(fullName, IC);
        this.grade = grade;
    }
    
    public int getSalary(){
        
        switch(grade){
            case "EM01":
                return 7000;
            case "EM02":
                return 5000;
            case "EM03":
                return 3000;
            case "EM04":
                return 1000;
            default:
                return 0;
        }
        
    }

    public String toString() {
        return super.toString() +
               "\nGrade: " + grade +
               "\nSalary: RM " + getSalary() + "\n";
    }
    
}
