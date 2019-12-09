/*
2. cont. Create a Tester class to test the program. 
 */
package Tutorial.T10;

import java.util.Scanner;

public class Q2TesterClass {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // Saving account
        System.out.print("Enter balance for your saving account: $ ");
        double saving = s.nextDouble();
        Q2SavingAccount a = new Q2SavingAccount(saving);
        System.out.print("Interest per month: $ ");
        dispayInterest(a);
        
        // Fixed account
        System.out.print("Enter balance for your fixed account: $ ");
        double fixed = s.nextDouble();
        Q2FixedAccount b = new Q2FixedAccount(fixed);
        System.out.print("Interest per month: $ ");
        dispayInterest(b);
        
        
    }
    
    public static void dispayInterest(Q2Interest obj){
        
        System.out.printf("%.2f\n", obj.computeInterest());
        
    }
}
