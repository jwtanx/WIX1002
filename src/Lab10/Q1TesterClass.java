/*
1. Create an Employee Salary System. The system will display the employee name, employee type and total salary per month. A permanent employee is divided into three categories. The salary for category A is 4000, category B is 3000 and category C is 2000. A contract staff has a fixed monthly income of 500 and a commission of 50% of the total sales. A temporary staff is given 15 per hour work. Create one abstract base class and three derived class for the system. Create a Tester class to test the program
 */
package Lab10;

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
