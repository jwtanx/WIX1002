/*
 * 4. Define a class named Pizza that contains the fields and methods as listed in the following UML Diagram:

Pizza
-size:String
This holds the size of the pizza whether large, medium or small

-numOfCheeseTopping:int
This holds the number of cheese toppings

-numOfBeefTopping:int
This holds the number of beef toppings

-numOfChickenTopping:int
This holds the number of chicken toppings

+Pizza()
+Pizza(size:String,
numOfCheeseTopping:int,
numOfBeefTopping:int,
numOfChickenTopping:int)
The constructor with the data field

+getSize():String
+getNumOfCheeseTopping():int
+getNumOfBeefTopping():int
+getNumOfChickenTopping():int
Accessors to get the four values

+setSize():String
+setNumOfCheeseTopping():int
+setNumOfBeefTopping():int
+setNumOfChickenTopping():int
Mutator to set the four values

+computeCost():double
The computeCost method calculates thecost of the pizza:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping

+display():void
A description of the pizza object to be displayed consisting of the pizza size, quantity of each topping and cost
 */
package Exercise.PastFinalTerm;

public class FT19S2Q4Pizza {
    
    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;
    private int sizeCost;
    
    public FT19S2Q4Pizza() {
        size = null;
        numOfCheeseTopping = 0;
        numOfBeefTopping = 0;
        numOfChickenTopping = 0;
        sizeCost = 0;
    }

    public FT19S2Q4Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
        if(size.equalsIgnoreCase("small")){
            sizeCost = 10;
        } else if (size.equalsIgnoreCase("medium")){
            sizeCost = 12;
        } else if (size.equalsIgnoreCase("large")){
            sizeCost = 14;
        } else {
            System.out.print("Unknown size. Please recheck your order again.");
            System.exit(0);
        }
    }

    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        
        double cost = 0;
        
        if(size.equalsIgnoreCase("small")){
            cost += 10;
        } else if (size.equalsIgnoreCase("medium")){
            cost += 12;
        } else if (size.equalsIgnoreCase("large")){
            cost += 14;
        } 
        
        cost = cost + ((numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping) * 2);
        return cost;
    }
    
    public void display(){
        System.out.println("Pizza Order" +
                            "\nSize: " + size + " (+$" + sizeCost + ")" +
                            "\nNumber Of Cheese Topping  : " + numOfCheeseTopping + " (+$" + (numOfCheeseTopping*2) + ")" +
                            "\nNumber Of Beef Topping    : " + numOfBeefTopping + " (+$" + (numOfBeefTopping*2) + ")" + 
                            "\nNumber Of Chicken Topping : " + numOfChickenTopping + " (+$" + (numOfChickenTopping*2) + ")" +
                            "\nCost: $ " + computeCost());
    }
}
