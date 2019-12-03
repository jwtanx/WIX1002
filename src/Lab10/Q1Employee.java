
package Lab10;

public abstract class Q1Employee {
    private String name, type;
    protected double salary;

    public Q1Employee(String name, String type) {
        this.name = name;
        this.type = type;
        salary = 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nType: " + type + "\nSalary: " + salary;
    }
    
    // IMPORTANT PART
    public abstract void computeSalary();
    
}
