/*
 * 5. Design a class PartTimeStaff that extends the Staff class. The PartTimeStaff class has the following members: 
- A field for the number of working hours (integer type). 
- A constructor with arguments, 
- A getSalary method that computes salary based on RM40 per hour. 
- A toString method that displays the staff's working hours and salary,
 */
package Exercise.PastFinalTerm;

public class FT17S2Q5PartTimeStaff extends FT17S2Q5Staff{
    
    private int workingHour;

    public FT17S2Q5PartTimeStaff(String fullName, String IC, int workingHour) {
        super(fullName, IC);
        this.workingHour = workingHour;
    }
    
    public int getSalary(){
        return 40 * workingHour;
    }

    public String toString() {
        return super.toString() +
               "\nNumber of working hours: " + workingHour + 
               "\nSalary: RM "+ getSalary() + "\n";
    }
    
}
