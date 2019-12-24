/*
 * 5. Design an abstract class Fruit that consists of the following members: 
 A field for the name of the fruit. 
 A field for the type of the fruit. 
 A constructor that contains the name and type of the fruit. 
 An abstract totalPrice method. 
 A toString method that return the fruit's type and name. 

Design an Apple class that extends the Fruit class. The Apple class has the following members:
 A field for the quantity of apple. 
 A constructor. 
 A totalPrice method that returns the total price of the apple purchased. The price of a Green apple is RM1.20, while the price of a Red apple is RM1.80.  
 A toString method that return the quantity and total price of the apple purchased.

Design a Watermelon class that extends the Fruit class. The Watermelon class has the following members: 
 A field for the weight of watermelon in kilogram. 
 A constructor. 
 A totalPrice method that returns the total price of watermelon purchased based on the table below.  
 A toString method that return the weight and total price of the watermelon purchased.

Type        Weight (kilogram)   Price per Kilogram (RM)
Local       < 2 kg              2.25 
Local       2 - 5 kg            1.95 
Local       > 5 kg              1.65 
Imported    < 2 kg              3.75 
Imported    2 - 5 kg            3.45 
Imported    > 5 kg              3.15 

David is planning to buy the following fruits. Write a tester class that used to display the total price for each fruit and determine the cheapest fruit he bought. 

Fruit                   Description 
Red Apple               8 pieces 
Green Apple             11 pieces 
Local Watermelon        7.6 kilograms 
Imported Watermelon     4 kilograms 

Sample output:
Red Apple - 8 = RM 14.4
Green Apple - 11 = RM 13.2
Local Watermelon - 7.6kg = RM 12.54
Imported Watermelon - 4.0kg = RM 13.8
The cheapest item is
Local Watermelon - 7.6 kg = RM 12.54

 */
package Exercise.PastFinalTerm;

public class FT18S1Q5 {
    public static void main(String[] args) {
        
        FT18S1Q5Apple red = new FT18S1Q5Apple(8, "Red", "Apple");
        FT18S1Q5Apple green = new FT18S1Q5Apple(11, "Green", "Apple");
        FT18S1Q5Watermelon local = new FT18S1Q5Watermelon(7.6, "Local", "Watermelon");
        FT18S1Q5Watermelon imported = new FT18S1Q5Watermelon(4, "Imported", "Watermelon");
        
        display(red);
        display(green);
        display(local);
        display(imported);
        
        FT18S1Q5Fruit f = comparePrice(red, green);
        f = comparePrice(f, local);
        f = comparePrice(f, imported);
        
        System.out.println("The cheapest item is");
        System.out.println(f.toString());
    }
    
    public static void display(FT18S1Q5Fruit f){
        System.out.println(f.toString());
    }
    
    public static FT18S1Q5Fruit comparePrice(FT18S1Q5Fruit f1, FT18S1Q5Fruit f2){
        
        if(f1.totalPrice() < f2.totalPrice()){
            return f1;
        } else {
            return f2;
        }
        
    }
}
