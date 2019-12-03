
package Lab10;

public class Q1ContractStaff extends Q1Employee{
    
    private double sale;

    public Q1ContractStaff(double sale, String name, String type) {
        super(name, type);
        this.sale = sale;
    }
    
    // IMPORTANT PART
    public void computeSalary(){
        salary = 500 + 0.5*sale;
    }
    
    
}
