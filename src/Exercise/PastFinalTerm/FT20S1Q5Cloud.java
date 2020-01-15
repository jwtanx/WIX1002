/*
 * 5. Design a Cloud class that consists of the following members:

- A field for the Cloud package 
- A field for the total cost 
- Accessor methods for total cost 
- A constructor that contains the Cloud package 
- A toString method that returns Cloud package and total cost.
 */
package Exercise.PastFinalTerm;

public class FT20S1Q5Cloud {
    private String cloudPackage;
    protected double totalCost;

    public FT20S1Q5Cloud(String cloudPackage) {
        this.cloudPackage = cloudPackage;
    }
    
    public double getTotalCost() {
        return totalCost;
    }

    public String toString() {
        return "Cloud Package : " + cloudPackage + " Total Cost= " + String.format("%.2f", totalCost);
    }
    
    
}
