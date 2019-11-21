/*
1. Write a Java method that check whether a number is a perfect number or not. A perfect number is a number that is equal to the sum of all its divisor (excluding itself). For example, 6 is a perfect number because 1+2+3=6. Then, write a Java program to use the method to display the first 20 perfect number.

Formula:
An = (2^(p-1)) * ((2^p) - 1), where A is a perfect number, ((2^p) - 1) is prime and p is prime
 */
package Viva.Method;

import java.math.BigInteger;

public class Q1 {

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int counter = 1;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            //System.out.println("testing prime " + i);
            BigInteger bi = BigInteger.valueOf(2);
            if (isPrime(i) && isPrime((bi.pow(i).subtract(BigInteger.valueOf(1))).intValue())) {

                //BigInteger perfect = (Math.pow(2, i - 1) * (Math.pow(2, i) - 1));
                BigInteger perfect = bi.pow(i - 1).multiply(bi.pow(i).subtract(BigInteger.valueOf(1)));
                System.out.println("Perfect num " + counter + " is " + perfect + ", with prime " + i);
                counter++;
            }
            
            if(counter == 21){
                break;
            }
        }
    }
}
