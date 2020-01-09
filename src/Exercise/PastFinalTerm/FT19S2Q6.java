/*
 * 6. Define a class named Order that performs the order processing of a product and its subclass, ShippedOrder that calculates the product price including shipping costs. The Order class contains: 
- two String data fields named customer name and customer ID. 
- int data field named quantity ordered. 
- one double data field named unit price. 
- no-argument constructor with appropriate default values. 
- constructor that creates Order with the specified data values. 
- accessor and mutator methods for the data fields 
- a method computeTotalPrice() that returns: 
    totalPrice = quantity * unit price 
- a method toString() that returns a string description for the Order.

b) Define the ShippedOrder subclass. It contains:
- a method computeTotalPrice() that overrides compute TotalPrice by adding a shipping and handling charge of $4.00. 
- a method toString() that returns a string description for the ShippedOrder.

c) Write a test program that creates one Order object with its data provided by the user Display the results. Similarly, create one ShippedOrder object with user provided data and display the results. A sample output is given below. 

Enter customer name :jo 
Enter customer id:333333 
Enter quantity ordered :5
Enter price per unit :10 

Order record 
Customer Name : jo 
Custoner Id : 333333 
Quantity ordered: 5 
Unit price : 10.0 
Total Price : 50.0 

Shipped 
Order record 
Customer Name : joe 
Customer Id : 123 
Quantity ordered: 10 
Unit price : 5.0 
Total Price : 54.0

 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT19S2Q6 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter customer name : ");
        String customerName = s.nextLine();
        System.out.print("Enter customer id : ");
        String customerID = s.nextLine();
        System.out.print("Enter quantity ordered : ");
        int quantity = s.nextInt();
        System.out.print("Enter price per unit : ");
        double unitPrice = s.nextDouble();
        
        FT19S2Q6Order order = new FT19S2Q6Order(customerName, customerID, quantity, unitPrice);
        System.out.println("\n" + order.toString());
        
        FT19S2Q6ShippedOrder shipped = new FT19S2Q6ShippedOrder(customerName, customerID, quantity, unitPrice);
        System.out.println("\n" + shipped.toString());
        
    }
}
