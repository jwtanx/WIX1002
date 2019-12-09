/*
1. Create an Employee Salary System. The system will display the employee name, employee type and total salary per month. A permanent employee is divided into three categories. The salary for category A is 4000, category B is 3000 and category C is 2000. A contract staff has a fixed monthly income of 500 and a commission of 50% of the total sales. A temporary staff is given 15 per hour work. Create one abstract base class and three derived class for the system. Create a Tester class to test the program
*/
package Lab10;

public class Q1TemporaryStaff extends Q1Employee{
    
    private double numOfHours;

    public Q1TemporaryStaff(double numOfHours, String name, String type) {
        super(name, type);
        this.numOfHours = numOfHours;
    }
    
    // IMPORTANT PART
    public void computeSalary(){
        salary = 15 * numOfHours;
    }
    
    
}
