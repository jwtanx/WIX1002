/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;

/**
 *
 * @author User
 */
public class Q1TesterClass {
    public static void main(String[] args) {
        
        Q1PermanentStaff a = new Q1PermanentStaff('B', "Ahmad", "Permanent Staff");
        
        Q1ContractStaff b = new Q1ContractStaff(1234, "Ah Meng", "Contract Staff");
        
        Q1TemporaryStaff c = new Q1TemporaryStaff(14, "Siti", "Temporary Staff");
        
        // Abstract base class cannot create obj
        // Abstract can only represent for other classes, used for biding
//        Q1Employee d = new Q1Employee("Ang", "Permanent Staff"); // <-- ERROR, object is abstract, cannot be instantiated 
        
        display(a);
        System.out.println();
        display(b);
        System.out.println();
        display(c);

    }
    
    public static void display(Q1Employee emp) {
        emp.computeSalary(); // can be called because it is abstarct method
        System.out.println(emp.toString());
        
    }
    
}
