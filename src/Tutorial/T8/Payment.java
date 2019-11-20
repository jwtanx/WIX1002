/*
 * 4. Create a class Payment that accept different type of payment methods such as cash payment, cheque payment and credit card payment. For cash payment, the class accepts the amount in cash; for cheque payment, the class accepts the amount and the cheque number; for credit card payment, the class accepts the amount, card holder name, cardType, expiration date and validation code. Use the same method name for the payment. 
 */
package Tutorial.T8;

public class Payment {
    
    private int cash;
    private double amount;
    private String chequeNumber;
    private String cardHolderName;
    private String cardType;
    private String expirationDate;
    private int validationCode;
    
    public Payment(){
        cash = 0;
        amount = 0.00;
        chequeNumber = "";
        cardHolderName = "";
        cardType = "";
        expirationDate = "00/00";
        validationCode = 0;
    }
    
    public int getCash() {
        return cash;
    }

    public double getAmount() {
        return amount;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardType() {
        return cardType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getValidationCode() {
        return validationCode;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setValidationCode(int validationCode) {
        this.validationCode = validationCode;
    }

    public void typeOfPayment(String paymentType){
        
        if(paymentType.equalsIgnoreCase("cash")){
            System.out.println("");
        }
        
    }
    
    public String toStringCash() {
        return "\nSummary\nCash : RM" + cash; 
    }
    
    public String toStringCheque(){
        return "\nSummary\nAmount\t\t: RM" + amount + "\nCheque Number\t: " + chequeNumber;
    }
    
    public String toStringCard(){
        return "\nSummary\nCard Holder Name: " + cardHolderName + "\nCard Type\t: " + cardType + "\nExpiration Date\t: " + expirationDate + "\nValidation Code\t: " + validationCode;
    }
    
    
    
    
    
    
}
