/*
 * 5. Cloud computing infrastructure provides an interface for users to access the virtualized resources (computing power, memory and storage). Write a program to represent the Cloud computing infrastructure. 

Design a Cloud class that consists of the following members: 
- A field for the Cloud package 
- A field for the total cost 
- Accessor methods for total cost 
- A constructor that contains the Cloud package 
- A toString method that returns Cloud package and total cost.

Design a Job class. The class has the following members:
- A field for the name of the job 
- A field for the number of tasks 
- A field for the memory 
- Accessor methods for all the fields 
- A constructor that contains the above fields. 
- A toString method that returns the name of the job, memory and number of tasks.

Design a CloudPackage class that extends the Cloud class. The class has the following members: 
- A field for the numbers of core
- A field for the memory 
- A field for price per hour 
- A constructor that contains the above field.
- A check method that consists of an argument of Job object. The methods check whether a job can be executed. A job can be executed if the Cloud package fulfills the memory requirement. The Cloud package must have more or equal memory to the job executed. 
- A totalCost method that consists of an argument of Job object. The method calculates the cost, given a job can run parallel in multi-cores. Example, a job consists of 20 tasks can run twice faster in dual-core as compared to single core. All the compute instances has the same computing power and each task will require 1 hour to execute.

Ahmad is planning to execute three different jobs in Table 1 using the cloud packages in Table 2. Write a tester class that creates the suitable objects for Job and array of object for CloudPackage. Then, determine the least cost used for each task using the chosen Cloud package. Finally display the total cost for all the jobs. 

Table 1 Job
Job Name    Number of Tasks     Job Memory (GB)
J1          252                 20
J2          108                 10
J3          72                  25

Table 2 Cloud Package 
Package Name    Number of Cores     Memory (GB)     Price per hour 
P2-15           4                   15              1.24 
P2-30           6                   30              2.11
R5-20           4                   20              1.38 
R6-20           6                   20              1.88
 */
package Exercise.PastFinalTerm;

public class FT20S1Q5 {
    public static void main(String[] args) {
        
        FT20S1Q5Job j[] = new FT20S1Q5Job[3];
        j[0] = new FT20S1Q5Job("J1", 252, 20);
        j[1] = new FT20S1Q5Job("J2", 108, 10);
        j[2] = new FT20S1Q5Job("J3", 72, 25);
        
        FT20S1Q5CloudPackage cp[] = new FT20S1Q5CloudPackage[4];
        cp[0] = new FT20S1Q5CloudPackage("P2-15", 4, 15, 1.24);
        cp[1] = new FT20S1Q5CloudPackage("P2-30", 6, 30, 2.11);
        cp[2] = new FT20S1Q5CloudPackage("R5-20", 4, 20, 1.38);
        cp[3] = new FT20S1Q5CloudPackage("R6-20", 6, 20, 1.88);
        
        double finalTotalCost = 0;
        
        for(int job = 0; job < j.length; job++){
            
            double tempCost = Integer.MAX_VALUE;
            int tempPackageNumber = 0;
            
            for(int pack = 0; pack < cp.length; pack++){
                
                if(cp[pack].checkMemory(j[job])){
                    double cost = cp[pack].calcTotalCost(j[job]);

                    if(cost < tempCost){
                        tempCost = cost;
                        tempPackageNumber = pack;
                    }
                }
                
            }
            
            System.out.println(j[job].toString());
            System.out.println(cp[tempPackageNumber].toString());
            finalTotalCost += cp[tempPackageNumber].getTotalCost();
        }
        
        System.out.printf("Total Cost : %.2f\n", finalTotalCost);
        
    }
}
