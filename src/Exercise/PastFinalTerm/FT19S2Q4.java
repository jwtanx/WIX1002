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

b) Write a tester program, Q4Main that creates a Pizza object with appropriate data. Display the object. A sample output is given below for a large pizza with one cheese, beef and chicken topping.

 */
package Exercise.PastFinalTerm;

public class FT19S2Q4 {
    public static void main(String[] args) {
        
        FT19S2Q4Pizza p1 = new FT19S2Q4Pizza("Large", 1, 1, 1);
        p1.display();
        
    }
}
