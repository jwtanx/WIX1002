/*
 * 7. Define class money. The class is used to calculate the number of note and coins for a given amount of money. The available notes are RM100, RM50, RM10, RM5 and RM1. The available coins are 50cent, 20cent, 10cent and 5 cent. The class needs to round up the amount according to the table below. The class also contains addition and subtraction method to add or subtract two objects. 

Before Rounding                 After Rounding 
10.11, 10.12                    10.10
10.13, 10.14, 10.16, 10.17      10.15
10.18, 10.19                    10.20 

 */
package Lab8;

import java.util.Random;
import java.util.Scanner;

// UNDONE

public class MoneyTesterClass {
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        Money user = new Money();
        int choice;
        
        double[] NotesNCent = {100, 50, 10, 5, 1, 0.50, 0.10, 0.05};
        
        // You are given random pocket money
        for(int i = 0; i < r.nextInt(100); i++){
            choice = r.nextInt(8);
            user.save(NotesNCent[choice]);
            System.out.println("You saved : $ " + String.format("%.2f", NotesNCent[choice]));
        }
        
        System.out.println(user.toString() + "\n");
        
//        // You didnt spend your money wisely
//        for(int i = 0; i < r.nextInt(5); i++){
//            choice = r.nextInt(8);
//            user.spend(NotesNCent[choice]);
//            System.out.println("You spend : $ " + NotesNCent[choice]);
//        }
//        
//        System.out.println(user.toString());
        
        boolean run = true;
        double amt;
        double totalAmt = 0;
        
        while(run){
            System.out.print("How much you spend? : $ ");
            amt = s.nextDouble();
            totalAmt += amt;
            System.out.println(totalAmt);
            
            if(amt < 0){
                user.roundOff(totalAmt);
                System.out.println(user.toString());
                run = false;
                break;
            }else{
                user.spend(amt);
            }
        }
        
        
    }
}
