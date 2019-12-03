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
