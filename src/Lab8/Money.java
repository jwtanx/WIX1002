/*
 * 7. Define class money. The class is used to calculate the number of note and coins for a given amount of money. The available notes are RM100, RM50, RM10, RM5 and RM1. The available coins are 50cent, 20cent, 10cent and 5 cent. The class needs to round up the amount according to the table below. The class also contains addition and subtraction method to add or subtract two objects. 

Before Rounding                 After Rounding 
10.11, 10.12                    10.10
10.13, 10.14, 10.16, 10.17      10.15
10.18, 10.19                    10.20 

 */
package Lab8;

import java.text.DecimalFormat;

// UNDONE

public class Money {
    
    private double amount;
    private DecimalFormat df2 = new DecimalFormat("#.##");    
    public Money(){
        amount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public void save(double amount){
        this.amount += amount;
    }
    
    public void spend(double amount){
        this.amount -= amount;
    }
    
    public void roundOff(double amount){
        
        String num = String.valueOf(amount);
        
        String split[] = num.split(".");
        
        String sen = split[1];
        
        String round1 = String.valueOf(sen.charAt(0));
        String round2 = String.valueOf(sen.charAt(1));
        
        switch(round2){
            
            case "0":
            case "1":
            case "2":
                round2 = "0";
                break;
                
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                round2 = "5";
                break;
                
            case "8":
            case "9":
                // if round 1 which is x in 0.x, = 9 and it is round off the split[0].charAt(split[0].length()-1) "+1"
                round1 = String.valueOf(Integer.parseInt(round1) + 1);
                round2 = "0";
                break;
            
        }
        
        String temp = split[0] + "." + round1 + round2;
        String finalTemp = "";
        
        for(int i = 0; i < temp.length(); i++){
            
            finalTemp += temp.charAt(i);
            
            if(temp.charAt(i) == '.'){
                finalTemp += (temp.charAt(i+1) + temp.charAt(i+2));
                break;  
            }
            
        }
        
        this.amount = Double.parseDouble(finalTemp);
    }
    
    public String toString(){
        return "Current Amount : $ " + amount;
    }
    
    
}
