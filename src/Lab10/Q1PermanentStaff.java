
package Lab10;

public class Q1PermanentStaff extends Q1Employee{
    
    private char category;

    public Q1PermanentStaff(char category, String name, String type) {
        super(name, type);
        this.category = category;
    }
    
    // IMPORTANT PART
    public void computeSalary(){
        if(category == 'A'){
            salary = 4000;
        }
        else if(category == 'B'){
            salary = 3000;
        }
        else if(category == 'C'){
            salary = 2000;
        }
    }
    
    
}
