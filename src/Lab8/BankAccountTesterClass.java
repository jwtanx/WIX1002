/*
2. Define a class name BankAccount. The class allows the customer to open the saving account with their name, IC or passport number and the deposit amount. The class consists of deposit method and withdraws method. Besides, the class can display the current balance. Create a Tester class to test the program. 
 */
package Lab8;

import java.util.Scanner;

public class BankAccountTesterClass {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        BankAccount user1 = new BankAccount("Mr. Bean", "550106105555", "ste952r", 0, 0);
        
        System.out.printf("Good day %s, how can we help you?\n", user1.getName());
        System.out.print("Choice:\n1. Deposit\n2. Withdraw\n3. Check current balance\n4. Profile\n[Other number to log out] : ");
        
        int choice = s.nextInt();
        
        switch(choice){
            
            case 1:
                
                System.out.print("How much you want to deposit : $ ");
                user1.setDeposit(s.nextDouble());
                System.out.println(user1.getDeposit());
                System.out.println(user1.getBalance());
                
//                break;
                
            case 2:
                
                System.out.print("How much you want to withdraw : $ ");
                double amount = s.nextDouble();
                user1.withdraw(amount);
                System.out.println("Succesfully withdraw : $ " + amount);
                System.out.println(user1.getBalance());
                
                break;
                
            case 3:
                
                System.out.println(user1.getBalance());
                break;
                
            case 4:
                
                System.out.println(user1.toString());
                break;
                
            default:
                System.out.println("Successfully logged out.");
            
        }
        

    }
}
