/*
 * 6. Design a class named FinancialRecord that contains: 
- A private int data field named id for the financial record (default is 0). 
- A private double data field named balance for the financial record (default is 0). 
- A private double data field named annualInterestRate that stores the current interest rate (default is 0). 
- A no-argument constructor that creates an financial record. 
- A constructor that creates an financial record with the specified id and initial balance.
- The accessor and mutator methods for id, balance, and annuallnterestRate. 
- A method named getMonthlylnterestRate that returns the monthly interest rate. 
    o Divide the annuallnterestRate by 12.
- A method named withdraw that withdraws a specified amount from the financial record, and notifies the available balance after the withdrawal is made. 
- A method named deposit that deposits a specified amount to the financial record, and notifies the available balance after the deposit is made. 
- A method named displayRecordinfo that displays the information of a financial record. 

Use Q5.java to test the class FinancialRecord that you have created

Modify Q5.java to instantiate another financial record (e.g. acc_b), where you need to 
- Initialize the annuallnterestRate to 8.0 
- Set the balance to RM20000 
- Set the id of the financial record to 1001 
- Display the financial record info 
- Display the monthly interest rate 
- Perform a deposit of RM1500 
- Perform a withdrawal of RM500

Sample output. 

The information about financial record A is as follows: 
Financial record id is: 1234 
Financial record balance is: RM10000.0 
Annual interest rate is: 7.77 

The information about financial record B is as follows: 
Financial record id is: 1235 
Financial record balance is: RM20000.0 
Annual interest rate is: 8.0 
The monthly interest rate is: 0.6666666666666666
Previous balance: RM20000.0 
Current balance after deposit of RM1500.0 is: RM21500.0 
Previous balance: RM21500.0 
Current balance after withdrawal of RM500.0 is: RM21000.0
 */
package Exercise.PastFinalTerm;

public class FT16S2Q6 {
    public static void main(String[] args) {
        
        FT16S2Q6FinancialRecord acc_a = new FT16S2Q6FinancialRecord(1234, 10000, 7.77);
        System.out.println("The information about financial record A is as follows: ");
        acc_a.displayRecordinfo();
        System.out.println();
        
        FT16S2Q6FinancialRecord acc_b = new FT16S2Q6FinancialRecord(1001, 20000, 8.0);
        System.out.println("The information about financial record B is as follows: ");
        acc_b.displayRecordinfo();
        System.out.println("The monthly interest rate is: " + acc_b.getMonthlylnterestRate());
        acc_b.deposit(1500);
        acc_b.withdraw(500);
        
    }
}
