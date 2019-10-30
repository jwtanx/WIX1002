/*
 * 1. An ISBN (International Standard Book Number) consists of 10 digits, d1 – d10. The last digit d10 is a checksum. The checksum is calculated based on the formula below:  
d10 = ( ∑ (dn x n)  ) modulus 11, where n is from 1 – 9.  
Write a Java program that asks the user to enter a nine-digit integer. The program will display the 10-digit ISBN. If the checksum is 10, the last digit is denoted as X.
 */
package Exercise.PastMidTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MT16Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter 9 digit number: ");
        int code = s.nextInt();
        int initialCode = code;
        int checksum = 0;
        int tenthDigit;
        int digit;
        
        for(int i = 1; i < 10; i++){
            
            digit = code / (int) Math.pow(10, (9-i));
            checksum += (digit * i);
            code -= (digit * Math.pow(10, (9-i)));
            
        }
        
        System.out.print("10-digit ISBN : ");
        for(int i = 1; i < 10; i++){
            
            digit = initialCode / (int) Math.pow(10, (9-i));
            initialCode -= (digit * Math.pow(10, (9-i)));
            
            System.out.print(digit);
            if(i == 1 || i == 4 || i == 9) System.out.print("-"); 
            
        }
        
        tenthDigit = checksum % 11;
        
        if(tenthDigit == 10) System.out.print("X");
        else System.out.println(tenthDigit);
        
        System.out.println("\n\nDone @ 301019, 18:45");
        
    }
}
