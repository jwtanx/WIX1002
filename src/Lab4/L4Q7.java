/*
 * Write a program that used to calculate mortgage loan. The program will create the
amortization table with equal total payment plan. The following are the formula and
the sample output.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L4Q7 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("     /      i    \\     /     /      i    \\-N   \\ ");
        System.out.println("M = | P × ------  | ÷ | 1 - | 1 + ------  |     |   ");
        System.out.println("     \\    12×100 /     \\     \\    12×100 /     / ");
        
        System.out.println();
        
        System.out.println("M = Monthly payment");
        System.out.println("P = Principal");
        System.out.println("i = Yearly interest rate in %");
        System.out.println("N = Total number of months");
        
        System.out.println();
        
        System.out.println("         /       i    \\-(1+N- n)   ");
        System.out.println("C\u2099 = M × | P × ------- |       ");
        System.out.println("         \\     12×100 /            ");
        
        System.out.println();
        
        System.out.println("L\u2099 = M - C\u2099");
        
        System.out.println();
        
        System.out.println("     /        i    \\");
        System.out.println("R\u2099 = | L\u2099 ÷ ------- | -  C\u2099 ");
        System.out.println("     \\      12×100 / ");
        
        System.out.println("C = Principal portion due");
        System.out.println("n = Month under consideration");
        System.out.println("L = Interest due");
        System.out.println("R = Remaining principal balance due");
        
        System.out.print("\nEnter principal amount: ");
        double P = s.nextDouble();
        
        System.out.print("Enter interest in %: ");
        double i = s.nextDouble();
        
        System.out.print("Enter total number of month(s): ");
        int N = s.nextInt();
        
        double M = (P * (i / (12 * 100))) / (1 - Math.pow((1 + (i/(12*100))), -N));
        
        System.out.println("Month\t\tMonth Payment\t\tPrincipal\t\tInterest\t\tUnpaid Balance");
        
        double C, L, R;
        
        for(int n = 1; n <= N; n++){
            
            C = M * Math.pow((1 + (i/(12*100))), -(1+N-n));
            
            L = M - C;
            
            R = (L / (i / (12*100))) - C;
            
            System.out.printf("%d\t\t%13.2f\t\t%9.2f\t\t%8.2f\t\t%14.2f\n", n, M, C, L, R);
        }
        
        System.out.println("\nDone @ 031019, 23:26");
        
    }
}
