/*
 * 4. High Performance Computing (HPC) cluster aggregating computing power of many individual computers known as compute nodes, to deliver much higher performance than one could get out of a typical desktop computer or workstation in order to solve large problems in science, engineering, or business. The compute nodes are connected with high- speed network and a scheduler is used to manage the jobs running across these tightly- coupled distributed computers. UM Data Intensive Computing Centre (DICC) is operating a 700 CPUS HPC cluster using TORQUE as the distributed resource manager. The log file below is a small sample of the scheduler log file that keep track of the daily activities.

The record, i.e. the activity log, starts with the date when the activity been recorded followed by other attributes of the respective execution. There are three types of record in this log file: Q, indicates a job has been submitted to the scheduler, S, an attempt to start the job has been made, and E, the job has exited (either run successfully or terminated with error). For instance, the record below shows that the job with job ID 14126, submitted by user weng, has been started at 1488329100, which is a Linux timestamp indicating the number of seconds that have elapsed since January 1, 1970 (midnight UTC/GMT).

03/01/2017 00:45:00;S;14126.ce2.dicc.um.edu.my;user=weng group=um jobname=Gaussian queue=um ctime=1488329096 qtime=1488329096 etime=1488329096 start=1488329100 owner=weng@ce2.dicc.um.edu.my

Write a simple log analysis program to help the HPC specialist of DICC to monitor the performance of the HPC cluster. Your program should perform three functions: 

a) Read the log file named sampleLog and print the records read from the log file in the given format, with the total number of records read. Hint: use a two-dimensional array to store the record, where each row represents a record and the columns are the its attributes. 

b) Print the total number of jobs submitted by each user. Hint: read only the type S record and read the last element of the second attribute.

c) Print the execution status of each and every job. Hint: the job ID is the third element of the second attribute of the S type record, and ended with .ce.dicc.um.edu.my. You can use String.split method to extract it, but remember that period is a not a common delimiter and you should use escape character "\\". If the status is not read from the log file, just leave it as it is with a null value. If the job did not successfully been executed, print the exit status as error message, instead of the end time. Both exit status and end time can be found in the E type record.

Sample output is in FT20S1Q4SampleOutput.txt
 */
package Exercise.PastFinalTerm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FT20S1Q4 {
    public static void main(String[] args) {
        
        File directory = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Exercise/PastFinalTerm/FT20S1Sources");
        
        try{
            Scanner s = new Scanner(new FileInputStream(directory + "/FT20S1Q4sampleLog"));
            
            int numOfRecord = 0;
            
            while(s.hasNextLine()){
                numOfRecord++;
                s.nextLine();
            }
            
            s.close();
            
            s = new Scanner(new FileInputStream(directory + "/FT20S1Q4sampleLog"));
            
            String[][] attributes = new String[numOfRecord][];
            System.out.println("Reading from log file...");
            System.out.println("****************************************");
            
            for(int i = 0; i < numOfRecord; i++){
                attributes[i] = s.nextLine().split(" ");
            }
            
            s.close();
            
            System.out.println("Record from log file");
            
            for(int i = 0; i < numOfRecord; i++){
                System.out.println("\nRecord " + (i + 1) + ":");
                for(int j = 0; j < attributes[i].length; j++){
                    System.out.println("\t" + attributes[i][j]);
                }
            }
            
            System.out.println("\ntotal records read: " + numOfRecord);
            System.out.println("\n****************************************");
            System.out.println("Print user submission stat");
            
            System.out.println("User\t\tJobs Submitted");
            System.out.println("----\t\t--------------");
            
            int numOfSubmission = 0;
            
            for(int i = 0; i < attributes.length; i++){
                if(attributes[i][1].charAt(9) == 'S'){
                    numOfSubmission++;
                }
            }
            
            String[] namesWithSubmission = new String[numOfSubmission];
            
            for(int i = 0, j = 0; i < attributes.length; i++){
                if(attributes[i][1].charAt(9) == 'S'){
                    String[] temp = attributes[i][1].split(";");
                    namesWithSubmission[j] = temp[temp.length-1].replace("user=", "");
                    j++;
                }
            }
            
            String[] tempName = Arrays.copyOf(namesWithSubmission, namesWithSubmission.length);
            Arrays.sort(tempName);
            
            int numOfWorker = 1;
            for(int i = 0; i < tempName.length - 1; i++){
                if(!tempName[i].equals(tempName[i + 1])){
                    numOfWorker++;
                }
            }
            
            int[] freq = new int[numOfWorker];
            String[] finalWorkerNameList = new String[numOfWorker];
            
            for(int i = 0, j = 0; i < namesWithSubmission.length; i++){
                finalWorkerNameList[j] = namesWithSubmission[i];
                freq[j]++;
                for(int k = 0; k < finalWorkerNameList.length; k++){
                    if(finalWorkerNameList[j].equals(finalWorkerNameList[k])){
                        if(k != j){
                            freq[k]++;
                            finalWorkerNameList[j] = null;
                            freq[j] = 0;
                            j--;
                        } 
                    }
                }
                j++;
            }
            
            for(int i = 0; i < finalWorkerNameList.length; i++){
                System.out.println(finalWorkerNameList[i] + "\t\t" + freq[i]);
            }
            
            System.out.println("****************************************");
            System.out.println("Print jobs status\n");
            System.out.println("Job ID\tSubmitted (queue)\tStarted (start time)\tExited (end time/error)");
            System.out.println("------\t-----------------\t--------------------\t-----------------------");
            
            
            
        } catch(FileNotFoundException fnf){
            System.err.println("File not found!");
        }
        
    }
}
