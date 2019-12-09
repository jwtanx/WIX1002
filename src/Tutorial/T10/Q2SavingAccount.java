/*
2. cont. Create the SavingAccount that implement the interface, the class has an instance variable called balance. Define the method to compute interest. The interest rate for saving account is 0.5% per year.
 */
package Tutorial.T10;

public class Q2SavingAccount implements Q2Interest{
    
    private double balance;

    public Q2SavingAccount(double balance) {
        this.balance = balance;
    }
    
    public double computeInterest(){
        return balance * (0.5 / 100) / 12;
    }
}
