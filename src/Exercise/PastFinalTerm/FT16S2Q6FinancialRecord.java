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
 */
package Exercise.PastFinalTerm;

public class FT16S2Q6FinancialRecord {
    
    private int id;
    private double balance;
    private double annualInterestRate;

    public FT16S2Q6FinancialRecord() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public FT16S2Q6FinancialRecord(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getannualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setannualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlylnterestRate(){
        return annualInterestRate / 12;
    }
    
    public void withdraw(double amount){
        System.out.println("Previous balance: RM" + balance);
        balance -= amount;
        System.out.println("Current balance after withdrawal of RM" + amount + " is: RM" + balance);
    }
    
    public void deposit(double amount){
        System.out.println("Previous balance: RM" + balance);
        balance += amount;
        System.out.println("Current balance after deposit of RM" + amount + " is: RM" + balance);
    }
    
    public void displayRecordinfo(){
        System.out.println("Financial record id is: " + id + 
                           "\nFinancial record balance is: RM" + balance + 
                           "\nAnnual Interest Rate is: " + annualInterestRate);
    }
}
