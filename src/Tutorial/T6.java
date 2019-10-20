/*
 * 1. Write statements for each of the following 
 */
package Tutorial;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author User
 */
public class T6 {
    
    static Random r = new Random();
    
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
    
    //Q1F. Define a static void method that generates 10 random numbers within 0 to 100 to the method’s parameter. The random numbers can be accessed by the main method. 
    // [NEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEED CORRECTION SOON]
    static void generateNum(int f){
        
        final int[] rnumlist = new int[10];
        
        for(int c = 0; c < rnumlist.length; c++){
            rnumlist[c] = r.nextInt(101);
        }
        
        System.out.print("The generated list: ");
        
        for(int rnum : rnumlist) System.out.print(rnum + " ");
        
        System.out.printf("\nYou chose: %d\n\n", rnumlist[f]);
        
    }
    
    //Q1G. Define a static void method that returns the area and the circumference of a circle given the argument is radius. Area = πr2 and Circumference = 2 πr.
    // [NEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEED CORRECTION SOON]
    static void areaNcircumference(double r){
        
        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI *  r;
        
        System.out.printf("The area of a %.2fcm radius circle: %.2fcm^2\n", r, area);
        System.out.printf("The circumference of a %.2fcm radius circle: %.2fcm\n\n", r, circumference);
        
    }
    
    //Q1H. Define a static method that generate random number within 0 – 10. The method will return the first random number that generate twice.
    static int duplicatedRnum(){
        
        int num[] = new int[11];
        int rnum, duplicate;
        
        while(true){
            rnum = r.nextInt(11);
            System.out.print("\nGenerated number: " + rnum);
            if(num[rnum] == 0) num[rnum] = 1;
            else{
                System.out.println(" --> Duplicated\n");
                duplicate = rnum;
                break;
            }
        }
        
        return duplicate;
    }
    
    //Q2. Write a program that consists of a method that can display three numbers in decreasing order.
    static int[] decreasingOrder(int a, int b, int c){
        
        int[] deOrder = new int[3];
        deOrder[0] = a;
        deOrder[1] = b;
        deOrder[2] = c;
        int temp;
        
        for(int i = 0; i < deOrder.length; i++){
            for(int j = i + 1; j < deOrder.length; j++){
                if(deOrder[i] < deOrder[j]){
                    temp = deOrder[i];
                    deOrder[i] = deOrder[j];
                    deOrder[j] = temp;
                }
            }
        }
        
        return deOrder;
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
                System.out.print("Enter 3 numbers separately to check the max num: ");
                int a1 = s.nextInt();
                int a2 = s.nextInt();
                int a3 = s.nextInt();
                
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
                System.out.println("\nQ1E:");
                System.out.print("Type a sentence to check the number of digits & letters: "); String e = s.nextLine();
                
                int numOfLnD[] = numOfLetterNDigit(e);
                System.out.printf("Number of digits: %d\n", numOfLnD[0]);
                System.out.printf("Number of letters: %d\n\n", numOfLnD[1]);
                break;
                
            case 'F':
            case 'f':
                //Q1F
                System.out.println("\nQ1F: [CORRECTION NEEDED]");
                System.out.print("Select an index(1 - 10) of a list of generated num: ");
                generateNum(s.nextInt() - 1);
                break;
                
            case 'G':
            case 'g':
                //Q1G
                System.out.println("\nQ1G: [CORRECTION NEEDED]");
                System.out.print("Enter radius of a circle to find area & circumference(cm): ");
                double r = s.nextDouble();
                areaNcircumference(r);
                break;
                
            case 'H':
            case 'h':
                //Q1H
                System.out.println("\nQ1H:");
                System.out.printf("The duplicated random number: %d\n\n", duplicatedRnum());
                break;
                
            case '2':
                //Q2
                System.out.println("\nQ2:");
                System.out.print("Display numbers in decreasing order. Enter 3 number separately: ");
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                int[] deOrder = decreasingOrder(a, b, c);
                
                System.out.print("The decreasing order: ");
                for(int i : deOrder){
                    System.out.print(i + " ");
                }
                System.out.println("\n");
                break;
                
            default:
                System.out.println("N/A");
        }
        
        System.out.print("Restart? (Y/N): ");
        char restart = s.next().charAt(0);
        
        if(restart == 'Y' || restart == 'y') main(args);
        else System.out.println("\nDone @ 201019, 23:42");
        
    }
}
