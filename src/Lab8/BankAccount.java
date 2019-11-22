/*
2. Define a class name BankAccount. The class allows the customer to open the saving account with their name, IC or passport number and the deposit amount. The class consists of deposit method and withdraws method. Besides, the class can display the current balance. Create a Tester class to test the program. 
 */
package Lab8;

public class BankAccount {
    
    private String name;
    private String IC;
    private String passport;
    private double deposit;
    private double balance;
    
    public BankAccount(){
        name = "";
        IC = "";
        passport = "";
        deposit = 0.00;
        balance = 0.00;
    }
    
    public BankAccount(String name, String IC, String passport, double deposit, double balance){
        
        if(IC.contains("-")){
            this.IC = IC;
        }
        else{
            this.IC = IC.substring(0, 6) + "-" + IC.substring(6, 8) + "-" + IC.substring(8, 12);
        }
        
        this.name = name.toUpperCase();
        this.passport = passport.toUpperCase();
        this.deposit = deposit;
        this.balance = balance;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        if(IC.contains("-")){
            this.IC = IC;
        }
        else{
            this.IC = IC.substring(0, 6) + "-" + IC.substring(6, 8) + "-" + IC.substring(8, 12);
        }
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport.toUpperCase();
    }

    public String getDeposit() {
        return "Succesfully deposited : $ " + String.format("%.2f", deposit);
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
        doDeposit(deposit);
    }

    public String getBalance() {
        return "Current balance : $ " + String.format("%.2f", balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void withdraw(double amount){
        this.balance -= amount;
    }
    
    public void doDeposit(double amount){
        this.balance += amount;
    }

//    @Override
    public String toString() {
        return "Name\t: " + name +
                "\nIC\t: " + IC + 
                "\nPassport: " + passport +
                "\nDeposit\t: " + "$ " + String.format("%.2f", deposit) +
                "\nBalance\t: " + "$ " + String.format("%.2f", balance);
    }
}
