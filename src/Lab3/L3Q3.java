/*
 * Write a program that calculates the total commission receives based on the table
below. The program will accept the sales volume and calculate the commission.
Display the commission in two decimal places.

Sales Volume                                            Commission
Less than or equal to 100                               5% of total sales
Greater than 100 and less than or equal to 500          7.5% of total sales
Greater than 500 and less than or equal to 1000         10% of total sales
Greater than 1000                                       12.5% of total sales

 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L3Q3 {
    
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
/*
==============
SIMPLE VERSION
==============
*/
        System.out.println("SIMPLE VERSION: if-else statement");
        System.out.print("Enter the sales volume\t: $");
        double simpleVol = s.nextDouble();
        double simpleC = 0;
        
        if(simpleVol <= 100){
            simpleC += simpleVol * 5.0/100; 
        }else if(simpleVol > 100){
            simpleC += 100 * 5.0/100;
            simpleVol -= 100;
            
            if(simpleVol <= 400){
                simpleC += simpleVol * 7.5/100;
            }else if(simpleVol > 400){
                simpleC += 400 * 7.5/100;
                simpleVol -= 400;
                
                    if(simpleVol <= 500){
                        simpleC += simpleVol * 10.0/100;
                    }else if(simpleVol > 500){
                        simpleC += 500 * 10.0/100;
                        simpleVol -= 500;
                        simpleC += simpleVol * 12.5/100;
                    }
            }
        }
        System.out.printf("Commission\t\t: $%.2f\n\n", simpleC);
        System.out.println("Simple version done @ 051019, 13:03");

/*
===================
COMPLICATED VERSION
===================        
*/
        System.out.println("COMPLICATED VERSION: method & switch");
        System.out.print("Enter sales volume\t: $");
        double volume = s.nextDouble();
        System.out.printf("Commision of $%.2f\t: ", volume);

        if(volume > 1000) group(4, volume, 0);
        if(volume > 500 && volume <= 1000) group(3, volume, 0);
        if(volume > 100 && volume <= 500) group(2, volume, 0);
        if(volume > 0 && volume <= 100)  group(1, volume, 0);
        
    }
    static void group(int a, double vol, double c){
        
        double fixedVol = vol;
        
        switch(a){
            case 4:
                vol -= 1000;
                c += vol * (12.5/100);
                group(3, 1000, c);
                System.exit(0);
                
            case 3:
                vol -= 500;
                c += vol * (10.0/100);
                group(2, 500, c);
                System.exit(0);
              
            case 2:
                vol -= 100;
                c += vol * (7.5/100);
                group(1, 100, c);
                System.exit(0);
                
            case 1:
                c += vol * (5.0/100);
                break;
        }
        System.out.printf("$%.2f", c);
        System.out.println("\n\nComplicated version done @ 051019, 00:20");
    }
}    
/*
=================
OLD WRONG VERSION
=================
        
    static double get(double volume){
        
        double c = 0;
        
        if(volume > 1000) c = group(4, volume);
        if(volume > 500 && volume <= 1000) c = group(3, volume);
        if(volume > 100 && volume <= 500) c = group(2, volume);
        if(volume > 0 && volume <= 100) c = group(1, volume);
        
        return c;
    }
    */
        
        //System.out.println(get(volume));
        /*
        if(volume > 1000) 
            System.out.println(group(4, volume, 0));
        if(volume > 500 && volume <= 1000)
            System.out.println(group(3, volume, 0));
        if(volume > 100 && volume <= 500)
            System.out.println(group(2, volume, 0));
        if(volume > 0 && volume <= 100)
            System.out.println(group(1, volume, 0));
        */
        
        /*
        while(vol > 1000){
            vol -= 1000;
            c += vol * (12.5/100);
        }
        
        while(vol > 500 && vol <= 1000){
            vol -= 500;
            c += vol * (10.0/100);
        }
        
        while(vol > 100 && vol <= 500){
            vol -= 100;
            c += vol * (7.5/100);
        }
        
        while(vol > 0 && vol <= 100){
            c += vol * (5.0/100);
            vol = 0;
        }
        
        System.out.printf("Sale commission: $%.2f", c);
        */
        
        
/*
============================
ANSWER FOR ORIGINAL QUESTION
============================
        
        if(vol >= 0 && vol <= 100){
            c = vol * 5/100;
            System.out.printf("\n5%% commission of %d sales volume: %.2f\n", vol, c);
        }
        
        if(vol > 100 && vol <= 500){
            c = vol * 7.5/100;
            System.out.printf("7.5%% commission of %d sales volume: %.2f\n", vol, c);
        }
        
        if(vol > 500 && vol <= 1000){
            c = vol * 10/100;
            System.out.printf("10%% commission of %d sales volume: %.2f\n", vol, c);
        }
        
        if(vol > 1000){
            c = vol * 12.5/100;
            System.out.printf("12.5%% commission of %d sales volume: %.2f\n", vol, c);
        }
        */
