/*
 * 3. Write a java method that accepts two arrays of 10 bits (ones and/or zeros). The methods will take each bit from the same index and perform XOR operation. Finally, the method will return a new array of bits containing the result of XOR operation.
Then, write a Java program to take 2 sets of 10 bits and return the XOR result in decimal.

Sample Input:
Enter first 10 bits: 1111111111
Enter second 10 bits: 1111100000  
Sample Output: XOR result: 31 
 */
package Viva.Method;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        char[] bin1 = new char[10];
        char[] bin2 = new char[10];
        
        System.out.print("Enter first 10 bits: ");
        String bin1Str = s.nextLine();
        
        for(int i = 0; i < 10; i++){
            bin1[i] = bin1Str.charAt(i);
        }
        
        System.out.print("Enter second 10 bits: ");
        String bin2Str = s.nextLine();
        
        for(int i = 0; i < 10; i++){
            bin2[i] = bin2Str.charAt(i);
        }
        
        int[] finalXOR = binXOR(bin1, bin2);
        System.out.printf("XOR result: %d\n", convertBinXOR(finalXOR));
        
    }
    
    public static int[] binXOR(char[] a, char b[]){
        int[] xor = new int[10];
        
        for(int i = 0; i < 10; i++){
            xor[i] = (Integer.parseInt(String.valueOf(a[i])) ^ Integer.parseInt(String.valueOf(b[i])));
        }
        
        return xor;
    }
    
    public static int convertBinXOR(int[] binXOR){
        
        int convertedXOR = 0;
        
        for(int i = 0, j = 9; i < binXOR.length; i++, j--){
            convertedXOR += (binXOR[j] * Math.pow(2,i));
        }
        
        return convertedXOR;
    }
    
}
