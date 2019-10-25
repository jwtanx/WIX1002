/*
 * A fruit farm has the following fruits –  <<rambutan, durian, langsat, mangosteen, jackfruit, mango>>.

On a daily basis, a fruit picker worker would go around the farm to pick these fruits.  In a day, a worker can pick up to a <<maximum of 10 baskets>>. 

A scheduling system <<randomly identifies the number of baskets for every worker each day>>. 

The <<total number of fruits to be collected in each basket is the same for all baskets>>, <<this number is randomly determined by the scheduling system.>>  However, the <<types of fruits to be collected in the basket may vary.>>

When a worker goes to the fruit <<sorting>> centre after picking, she/he would put the fruit basket under an intelligent conveyer that should 
<<categorise the type of fruit into its respective boxes>> to be sent to seller/dealer. 

This conveyer would <<calculate the number of fruit collected by a specific worker identified by a worker ID>>.  

The system automatically and <<randomly generates a worker ID>> in the following format, (i.e. Z15, U9, J3, K2, M10, C5, D11, D8, F14, G3), in this example for ten workers. 

In an alphabetical order, each type of fruit is given an ID in the form of number that increments by 1. For example, Durian has an ID of 1. The system recognizes the fruits in the basket by a series of numbers such as ‘1645416245’. In this example, there are 2 durians on top of other fruits. 

Create a system to fulfil the following requirements:
1.	Generate a workerID in the format given for 5 workers.
2.	Create n fruit baskets, each containing random selection and number of fruits. 
3.	Calculate the total number of each type of fruit in each basket and a total count for the day (for all baskets) for each worker and all workers.
4.	Specify which worker ID has the highest and lowest number of fruits collected.
5.	Specify type of fruits were collected most and least for the day. 

 */
package Exercise.MidTerm2019;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class LQ1 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        // List of fruit
        String[] fruit = {"Rambutan", "Durian", "Langsat", "Mangosteen", "Jackfruit", "Mango"};
        Arrays.sort(fruit);

        int maxBasket = 10;
        int numOfWorker = 5;
        
        int[] durian        = new int[numOfWorker];
        int[] jackfruit     = new int[numOfWorker];
        int[] langsat       = new int[numOfWorker];
        int[] mango         = new int[numOfWorker];
        int[] mangosteen    = new int[numOfWorker];
        int[] rambutan      = new int[numOfWorker];
        int[] total         = new int[numOfWorker];
        
        String[] workerId = new String[numOfWorker];
        int[] numOfBasket = new int[numOfWorker];
        int[] numOfFruitInABasket = new int[numOfWorker];
        
        // Generating Worker ID
        System.out.println("No.\tWorker ID");
        
        for(int i = 0; i < workerId.length; i++){
            workerId[i] = Character.toString((char)(r.nextInt(26) + 'A'));
            //workerId[i] += Integer.toString(1 + r.nextInt(99));
            workerId[i] += String.format("%02d", (1 + r.nextInt(99)));
            System.out.println((i+1) + "\t" + workerId[i]);
        }
        
        // Assigning number of baskets for each worker
        for(int i = 0; i < workerId.length; i++){
            numOfBasket[i] = 1 + r.nextInt(maxBasket);
        }
        
        // Assigning number of fruits in a basket for each worker
        for(int i = 0; i < workerId.length; i++){
            
            numOfFruitInABasket[i] = 1 + r.nextInt(10);
            
        }
        
        String[][] fruitList = new String[numOfWorker][maxBasket];
        
        //Assigning fruit list for each basket of a worker
        for(int a = 0; a < numOfWorker; a++){
            
            System.out.println("\n\n------------------------------");
            System.out.printf("Worker %d: %s\n", (a+1), workerId[a]);
            
            durian[a]        = 0;
            jackfruit[a]     = 0;
            langsat[a]       = 0;
            mango[a]         = 0;
            mangosteen[a]    = 0;
            rambutan[a]      = 0;
            total[a]         = 0;
            
            for(int b = 0; b < numOfBasket[a]; b++){
                
                System.out.printf("\nBasket %d: ", (b+1));
                
                fruitList[a][b] = "";
                for(int c = 0; c < numOfFruitInABasket[a]; c++){
                    fruitList[a][b] += Integer.toString(1 + r.nextInt(6));
                }
                
                System.out.print("'" + fruitList[a][b] + "'");
                
                
                // Calculating the number of fruit collected for each fruit
                    
                for(int d = 0; d < fruitList[a][b].length(); d++){
                    
                    if(fruitList[a][b].charAt(d) == '1') { durian[a]      ++; total[a]++; } 
                    if(fruitList[a][b].charAt(d) == '2') { jackfruit[a]   ++; total[a]++; }
                    if(fruitList[a][b].charAt(d) == '3') { langsat[a]     ++; total[a]++; }
                    if(fruitList[a][b].charAt(d) == '4') { mango[a]       ++; total[a]++; }
                    if(fruitList[a][b].charAt(d) == '5') { mangosteen[a]  ++; total[a]++; }
                    if(fruitList[a][b].charAt(d) == '6') { rambutan[a]    ++; total[a]++; }
                    
                }
            }
            
            System.out.printf("\nDurian amount\t\t: %d\n", durian[a]);
            System.out.printf("Jackfruit amount\t: %d\n", jackfruit[a]);
            System.out.printf("Langsat amount\t\t: %d\n", langsat[a]);
            System.out.printf("Mango amount\t\t: %d\n", mango[a]);
            System.out.printf("Mangosteen amount\t: %d\n", mangosteen[a]);
            System.out.printf("Rambutan amount\t\t: %d\n", rambutan[a]);
            System.out.printf("\nTotal amount of fruit\t: %d\n", total[a]);
            System.out.print("------------------------------\n");
        }
        
        System.out.println("\n\t>> WORKER <<");
        System.out.println("Worker\t\tNumber of fruit collected");
        
        for(int i = 0; i < workerId.length; i++){
            System.out.printf("%s\t\t%d\n", workerId[i], total[i]);
        }
        
        int highestAmount = 0;
        String bestWorker = "";
        int lowestAmount = total[0];
        String worstWorker = "";
        
        for(int a = 0; a < total.length; a++){
            
            if(total[a] > highestAmount){
                highestAmount = total[a];
                bestWorker = workerId[a];
            }
            
            else if(total[a] < lowestAmount){
                lowestAmount = total[a];
                worstWorker = workerId[a];
            }
        }
        
        System.out.printf("Best worker\t: %s with total %d fruit collected.\n", bestWorker, highestAmount);
        System.out.printf("Worst worker\t: %s with total %d fruit collected.\n", worstWorker, lowestAmount);
        
        System.out.println("\n\t>> FRUIT <<");
        int totalDurian = 0;
        int totalJackfruit = 0;
        int totalLangsat = 0;
        int totalMango = 0;
        int totalMangosteen = 0;
        int totalRambutan = 0;
        int totalAll = 0;
        
        for(int n : durian) totalDurian += n;
        for(int n : jackfruit) totalJackfruit += n;
        for(int n : langsat) totalLangsat += n;
        for(int n : mango) totalMango += n;
        for(int n : mangosteen) totalMangosteen += n;
        for(int n : rambutan) totalRambutan += n;
        for(int n : total) totalAll += n;
        
        System.out.println("Total durian\t\t: " + totalDurian);
        System.out.println("Total jackfruit\t\t: " + totalJackfruit);
        System.out.println("Total langsat\t\t: " + totalLangsat);
        System.out.println("Total mango\t\t: " + totalMango);
        System.out.println("Total mangosteen\t: " + totalMangosteen);
        System.out.println("Total rambutan\t\t: " + totalRambutan);
        System.out.println("--------------------------------");
        System.out.println("Total All\t\t: " + totalAll);
        
        int[] totalList = {totalDurian, totalJackfruit, totalLangsat, totalMango, totalMangosteen, totalRambutan};
        
        int highestFruit = 0;
        String highestFruitName = "";
        int lowestFruit = totalList[0];
        String lowestFruitName = "";
        
        for(int l = 0; l < totalList.length; l++){
            if(totalList[l] > highestFruit) {
                highestFruit = totalList[l];
                highestFruitName = fruit[l];
            }
            else if(totalList[l] < lowestFruit){
                lowestFruit = totalList[l];
                lowestFruitName = fruit[l];
            }
        }
        
        System.out.printf("\nHighest collected fruit is %s: %d\n", highestFruitName, highestFruit);
        System.out.printf("Lowest collected fruit is %s: %d\n", lowestFruitName, lowestFruit);
        System.out.println("--------------------------------");
        
        System.out.println("\nFinally done @ 261019, 01:28");
        
        
        
    }
}
