/*
 * 1. Write statements for each of the following 
 */
package Tutorial;

import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author User
 */
public class T6 {
    
    //Q1A. Define a static method that returns the maximum number from 3 integer parameters. 
    static int findMax(int a, int b, int c){
        
        int max = 0;
        
        if(a > b && a > c) max = a;
        if(b > a && b > c) max = b;
        if(c > a && c > b) max = c;
        
        return max;
    }
    
    //Q1B. Define a static method that that determine whether the given integer is a square number
    static boolean checkSqrtNum(int num){
        
        boolean a = false;
        
        for(int c = 0;  c < num; c++) {
            if(num == Math.pow(c, 2)) {
                a = true;
                break;
            }
        }
        
        return a;
    }
    
    //Q1C. Define a static method that use to compute combination function C(n,k). C(n,k) gives the number of different k-element subsets that can be found in a given set of n elements. C(n,k) = n! / (k! (n-k)!)  
    static BigInteger C(int n, int k){
        
        BigInteger Nfact = new BigInteger("1");             // <-- n!
        BigInteger Kfact = new BigInteger("1");             // <-- k!
        BigInteger NsubKfact = new BigInteger("1");         // <-- (n-k)!
        
        for(int cn = 1; cn <= n; cn++) Nfact = Nfact.multiply(BigInteger.valueOf(cn));                                // <-- n!
        for(int ck = 1; ck <= k; ck++) Kfact = Kfact.multiply(BigInteger.valueOf(ck));                                // <-- k!
        for(int cnsubk = 1; cnsubk <= (n-k); cnsubk++) NsubKfact = NsubKfact.multiply(BigInteger.valueOf(cnsubk));    // <-- (n-k)!

        return (Nfact.divide((Kfact.multiply(NsubKfact))));
        
    }
    
    //Q1D. Define a static method that used to determine whether the parameter is a pentagonal number. A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. Pn = ½ n(3n -1) 
    static boolean checkPentagonal(int pnum){
        boolean d = false;
        int Pn;
        
        for(int n = 0; n < pnum; n++){
            Pn = (n * ((3 * n) - 1)) / 2;
            
            if(Pn == pnum || pnum == 1) {
                d = true;
                break;
            }
        }
        return d;
    }
    
    //Q1E. Define a static method that displays the number of letters and the number of digits of a String parameter. 
    static int[] numOfLetterNDigit(String sentence){
        
        int numOfLnD[] = new int[2];
        
        String numOfDigit = sentence.replaceAll("\\D+", "");
        String numOfLetter = sentence.replaceAll("\\W+", "");
        
        numOfLnD[0] = numOfDigit.length();
        numOfLnD[1] = numOfLetter.length() - numOfDigit.length();
        
        return numOfLnD;
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Question number (a -> h or 2): ");
        char question = s.next().charAt(0);
        
        switch(question){
            
            case 'A':
            case 'a':
                //Q1A
                System.out.println("\nQ1A:");
                System.out.print("\nNum1: "); int a1 = s.nextInt();
                System.out.print("\nNum2: "); int a2 = s.nextInt();
                System.out.print("\nNum3: "); int a3 = s.nextInt();
                
                System.out.printf("Max num: %d\n\n", findMax(a1, a2, a3));
                break;
                
            case 'B':
            case 'b':
                //Q1B
                System.out.println("\nQ1B:");
                System.out.print("Enter a num to check if it is square: "); int b1 = s.nextInt();
                
                System.out.printf("Is number %d a square number? %b\n\n", b1, checkSqrtNum(b1));
                break;
                
            case 'C':
            case 'c':
                //Q1C
                System.out.println("\nQ1C:");
                System.out.print("Combination nCk, enter n & k separately: "); int n = s.nextInt(); int k = s.nextInt();
                
                System.out.printf("%dC%d = %d\n\n", n, k, C(n, k));
                break;
                
            case 'D':
            case 'd':
                //Q1D
                System.out.println("\nQ1D:");
                System.out.print("Enter a num to check if it is pentagonal number: "); int pnum = s.nextInt();
                
                System.out.printf("Number %d is a pentagonal number: %b\n\n", pnum, checkPentagonal(pnum));
                break;
                
            case 'E':
            case 'e':
                //Q1E
                s.nextLine();
                System.out.println("\nQ1E");
                System.out.print("Type a sentence to check the number of digits & letters: "); String e = s.nextLine();
                
                int numOfLnD[] = numOfLetterNDigit(e);
                System.out.printf("Number of digits: %d\n", numOfLnD[0]);
                System.out.printf("Number of letters: %d\n\n", numOfLnD[1]);
                break;
                
            case 'F':
            case 'f':
                
                
                
                
                break;
                
            case 'G':
            case 'g':
                
                break;
                
            case 'H':
            case 'h':
                
                break;
                
            case '2':
                
                break;
                
            default:
                System.out.println("");
                
        }
        
        System.out.print("Restart? (Y/N): ");
        char restart = s.next().charAt(0);
        
        if(restart == 'Y' || restart == 'y') main(args);
        else System.out.println("\nDone @ 201019, 19:08");
        
        
        
        
    }
}
