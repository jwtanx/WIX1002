/*
 4. Define a class PurchaseSystem. The class consists of product code, unit price, quantity and total price. Besides the class consists of a method to compute the total price and a display method. Derived a class SugarPurchase from PurchaseSystem. This new class add a sugar weight attributed and override the method to compute the total price as unit price*quantity*sugar weight.
 */
package Tutorial.T9;

public class Q4SugarPurchase extends Q4PurchaseSystem{
    
    private double sugarWeight;


    public Q4SugarPurchase(String productCode, double unitPrice, int quantity, double sugarWeight) {
        super(productCode, unitPrice, quantity);
        this.sugarWeight = sugarWeight;
    }
    
    public void calTotalPrice(){
        super.totalPrice = unitPrice * quantity * sugarWeight;
    }
    
}
