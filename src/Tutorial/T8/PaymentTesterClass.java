/*
* 4. Create a class Payment that accept different type of payment methods such as cash payment, cheque payment and credit card payment. 
For cash payment, the class accepts the amount in cash;
for cheque payment, the class accepts the amount and the cheque number;
for credit card payment, the class accepts the amount, card holder name, cardType, expiration date and validation code.
Use the same method name for the payment. 
 */
package Tutorial.T8;

import java.util.Scanner;

public class PaymentTesterClass {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        Payment a = new Payment();
        
        System.out.print("Which payment type you want to use(Cash, Cheque, Bank Card): ");
        String paymentType = s.nextLine().toLowerCase();
        
        
        if(paymentType.equalsIgnoreCase("cash") || paymentType.contains("cas")){
            System.out.println("\nPayment method\t\t: Cash");
            System.out.print("Insert cash\t\t: RM");
            a.setCash(s.nextInt());
            s.nextLine();
            
            System.out.println(a.toStringCash());
        }
        
        else if(paymentType.equalsIgnoreCase("cheque") || paymentType.contains("ch")){
            System.out.println("\nPayment method\t\t: Cheque");
            System.out.print("Insert amount\t\t: RM");
            a.setAmount(s.nextDouble());
            s.nextLine();
            System.out.print("Insert cheque number\t: ");
            a.setChequeNumber(s.nextLine());
            
            System.out.println(a.toStringCheque());
        }
        
        else if(paymentType.equalsIgnoreCase("Bank card") || paymentType.contains("b") || paymentType.contains("car")){
            System.out.println("\nPayment method\t\t: Bank Card");
            System.out.print("Insert amount\t\t: RM");
            a.setAmount(s.nextDouble());
            s.nextLine();
            System.out.print("Insert card holder name\t: ");
            a.setCardHolderName(s.nextLine());
            System.out.print("Insert card type(D/C)\t: ");
            a.setCardType(s.nextLine().charAt(0));
            System.out.print("Insert expiration date\t: ");
            a.setExpirationDate(s.nextLine());
            System.out.print("Insert validation code\t: ");
            a.setValidationCode(s.nextInt());
            s.nextLine();
            
            System.out.println(a.toStringCard());
            
        }
        else{
            System.out.println("We dont accept kiss currency bro, its only applicable in Smosh world.");
        }
        
        System.out.print("Do you want to restart(Y/N)?");
        char choice = s.nextLine().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            PaymentTesterClass.main(args);
        }else
            
        
        System.out.println("\nDone @ 211119, 00:36");
    }
}
