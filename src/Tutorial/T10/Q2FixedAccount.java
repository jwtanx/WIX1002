/*
2. cont. Create the FixedAccount that implement the interface. The class has an instance variable called balance. Define the method to compute interest. The interest rate for saving account is 3% per year.
 */
package Tutorial.T10;

public class Q2FixedAccount implements Q2Interest{
    
    private double balance;

    public Q2FixedAccount(double balance) {
        this.balance = balance;
    }
    
    public double computeInterest() {
        return balance * 0.03 / 12;
    }
}
