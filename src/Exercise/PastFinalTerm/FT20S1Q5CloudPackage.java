/*
 * 5. Design a CloudPackage class that extends the Cloud class. The class has the following members: 
- A field for the numbers of core
- A field for the memory 
- A field for price per hour 
- A constructor that contains the above field.
- A check method that consists of an argument of Job object. The methods check whether a job can be executed. A job can be executed if the Cloud package fulfills the memory requirement. The Cloud package must have more or equal memory to the job executed. 
- A totalCost method that consists of an argument of Job object. The method calculates the cost, given a job can run parallel in multi-cores. Example, a job consists of 20 tasks can run twice faster in dual-core as compared to single core. All the compute instances has the same computing power and each task will require 1 hour to execute.

 */
package Exercise.PastFinalTerm;

public class FT20S1Q5CloudPackage extends FT20S1Q5Cloud{
        
    private int numberOfCores;
    private int memory;
    private double pricePerHour;

    public FT20S1Q5CloudPackage(String cloudPackage, int numberOfCores, int memory, double pricePerHour) {
        super(cloudPackage);
        this.numberOfCores = numberOfCores;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
        
    public boolean checkMemory(FT20S1Q5Job j){
        return memory >= j.getMemory();
    }
    
    public double calcTotalCost(FT20S1Q5Job j){
        totalCost = (j.getNumberOfTasks()*1.0) / (numberOfCores*1.0) * pricePerHour;
        
        return totalCost;
    }
}
