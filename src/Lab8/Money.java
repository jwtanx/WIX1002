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

    public Money(double amount) {
        this.amount = amount;
    }
    
    public void addition(double amt1, double amt2){
        
        amount = amt1 + amt2;
        
        System.out.println("The addition: RM" + amount);
        
        roundOff();
        calculateAmount();
    }
    
    public void subtraction(double amt1, double amt2){
        
        if(amt1 >= amt2){
            amount = amt1 - amt2;
        }
        else{
            amount = amt2 - amt1;
        }
        
        System.out.println("The subtraction: RM" + amount);
        
        roundOff();
        calculateAmount();
        
    }
    
    public void roundOff(){
        
        int bigAmount = (int) amount;
        
        double smallAmount = amount - bigAmount;
        
        String twoDecimal = String.format("%.2f", smallAmount);
        
        int sen = (int) (Double.parseDouble(twoDecimal) * 100);
        
        String senTimes100 = String.valueOf(sen);
        
        String temp = "";
        
        switch(senTimes100.charAt(1)){
            
            case '0':
            case '1':
            case '2':
                temp = senTimes100.charAt(0) + "0";
                break;
                
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
                temp = senTimes100.charAt(0) + "5";
                break;
            
            case '8':
                
                if(senTimes100.charAt(0) == '9'){
                    bigAmount++; 
                }
                else{
                    sen += 2;
                    temp = String.valueOf(sen);
                }
                break;
                
            case '9':
                
                if(senTimes100.charAt(0) == '9'){
                    bigAmount++; 
                }
                else{
                    sen++; 
                    temp = String.valueOf(sen);
                }
                break;
                
            default:
                
        }
        
        String converted = String.valueOf(bigAmount) + "." + temp;
        
        double finalConverted = Double.parseDouble(converted);
        
        amount = finalConverted;
        
        System.out.printf("The round off: RM %.2f\n", finalConverted);
    }
    
    public void calculateAmount() {

        int bigAmount = (int) amount;
        int tempBigAmount = bigAmount;
        
        int hundred = 0, fifty = 0, ten = 0, five = 0, one = 0;

        while (bigAmount != 0) {

            if (bigAmount >= 100) {
                bigAmount -= 100;
                hundred++;
            }
            else if (bigAmount >= 50) {
                bigAmount -= 50;
                fifty++;
            }
            else if (bigAmount >= 10) {
                bigAmount -= 10;
                ten++;
            }
            else if (bigAmount >= 5) {
                bigAmount -= 5;
                five++;
            }
            else if (bigAmount >= 1) {
                bigAmount -= 1;
                one++;
            } 
            else {
                break;
            }
        }
        
        double smallAmount = amount - tempBigAmount;
        
        String twoDecimal = String.format("%.2f", smallAmount);
        
        int senAmount = (int) (Double.parseDouble(twoDecimal) * 100);
        
        int fiftySen = 0, twentySen = 0, tenSen = 0, fiveSen = 0;
        
        while(senAmount != 0){
            
            if (senAmount >= 50) {
                senAmount -= 50;
                fiftySen++;
            }
            else if (senAmount >= 20) {
                senAmount -= 20;
                twentySen++;
            }
            else if (senAmount >= 10) {
                senAmount -= 10;
                tenSen++;
            }
            else if (senAmount >= 5) {
                senAmount -= 5;
                fiveSen++;
            }
            else {
                break;
            }
            
        }
        
        System.out.println("\nList: ");
        System.out.printf("RM100: %d\nRM 50: %d\nRM 10: %d\nRM  5: %d\nRM  1: %d\n", hundred, fifty, ten, five, one);
        System.out.printf("50 Cents: %d\n20 Cents: %d\n10 Cents: %d\n5  Cents: %d\n", fiftySen, twentySen, tenSen, fiveSen);
        
    }

    public String toString() {
        return "Current Amount : RM " + amount + "\n";
    }

}
