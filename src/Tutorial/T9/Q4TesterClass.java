/*
4. Define a class PurchaseSystem. The class consists of product code, unit price, quantity and total price. Besides the class consists of a method to compute the total price and a display method. Derived a class SugarPurchase from PurchaseSystem. This new class add a sugar weight attributed and override the method to compute the total price as unit price*quantity*sugar weight.
 */
package Tutorial.T9;

public class Q4TesterClass {
    public static void main(String[] args) {
        
        Q4PurchaseSystem p1 = new Q4PurchaseSystem("Ice-Cream Box", 9.99, 5);
        p1.calTotalPrice();
        System.out.println(p1.toString());
        
        Q4SugarPurchase s1 = new Q4SugarPurchase("Ice-Cream Box", 9.99, 5, 12.2);
        s1.calTotalPrice();
        System.out.println(s1.toString());
        
        
    }
}
