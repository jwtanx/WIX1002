/*
 * 5. Design an abstract class Fruit that consists of the following members: 
 A field for the name of the fruit. 
 A field for the type of the fruit. 
 A constructor that contains the name and type of the fruit. 
 An abstract totalPrice method. 
 A toString method that return the fruit's type and name. 
 */
package Exercise.PastFinalTerm;

public abstract class FT18S1Q5Fruit {
    
    protected String name, type;

    public FT18S1Q5Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalPrice();

    public String toString() {
        return type + " " + name;
    }
    
}
