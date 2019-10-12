/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viva;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Random;

/**
 *
 * @author User
 */
// Using Array
public class Q2 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        String[] num1to19 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        
        String o = " only.\n\n";
        
        int num = r.nextInt(1000), d1, d2, d3, d21;
          
        System.out.printf("Random number: %d\n", num);
        
        if (num == 0) System.out.print("Zero");
        
        if (num <= 19 && num != 0) System.out.print(StringUtils.capitalize(num1to19[num]));
        
        if (num < 100 && num >= 20){
            d2 = num/10;
            System.out.print(StringUtils.capitalize(tens[d2]));
           
            if(num%10 != 0){
                d1 = num - (d2*10);
                System.out.print("-" + num1to19[d1]);
            }
        }
        
        if (num >= 100 && num < 1000){
            d3 = num/100;
            System.out.print(StringUtils.capitalize(num1to19[d3]));
            System.out.print(" hundred");
            
            d21 = num - d3*100;
            if (d21 == 0) {}
                
            if (d21 != 0 && d21 <= 19) System.out.print(" and " + num1to19[d21]);
                    
            if (d21 >= 20 && d21 < 100){
                d2 = d21/10;
                System.out.print(" and ");
                System.out.print(tens[d2]);
                d1 = d21 - d2*10;
                    
                if(d1 != 0)System.out.print("-" + num1to19[d1]);
            }
        }
        System.out.print(o);
    }
}