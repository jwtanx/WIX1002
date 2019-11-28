/*
4. Define a class PurchaseSystem. The class consists of product code, unit price, quantity and total price. Besides the class consists of a method to compute the total price and a display method. Derived a class SugarPurchase from PurchaseSystem. This new class add a sugar weight attributed and override the method to compute the total price as unit price*quantity*sugar weight.
 */
package Tutorial.T9;

public class Q4PurchaseSystem {
    
    private String productCode;
    protected double unitPrice;
    protected int quantity;
    protected double totalPrice;

    public Q4PurchaseSystem() {
        productCode = "";
        unitPrice = 0;
        quantity = 0;
        totalPrice = 0;
    }
    
    public Q4PurchaseSystem(String productCode, double unitPrice, int quantity) {
        this.productCode = productCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    public void calTotalPrice(){
        
        totalPrice = unitPrice * quantity;
        
    }

    @Override
    public String toString() {
        return "\nProduct Code : " + productCode + "\nUnit Price : " + unitPrice + "\nQuantity : " + quantity + "\nTotal Price : " + totalPrice;
    }
    
    
}
