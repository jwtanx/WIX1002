/*
 * 5. Design a Job class. The class has the following members:

- A field for the name of the job 
- A field for the number of tasks 
- A field for the memory 
- Accessor methods for all the fields 
- A constructor that contains the above fields. 
- A toString method that returns the name of the job, memory and number of tasks.
 */
package Exercise.PastFinalTerm;

public class FT20S1Q5Job {
    
    private String jobName;
    private int numberOfTasks;
    private int memory;

    public FT20S1Q5Job(String jobName, int numberOfTasks, int memory) {
        this.jobName = jobName;
        this.numberOfTasks = numberOfTasks;
        this.memory = memory;
    }
    
    public String getJobName() {
        return jobName;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public int getMemory() {
        return memory;
    }

    public String toString() {
        return "Job Name : " + jobName + " Memory = " + memory + "GB Number Of Task = " + numberOfTasks;
    }
    
}
