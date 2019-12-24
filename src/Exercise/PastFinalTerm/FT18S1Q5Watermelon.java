/*
 * 5. Design a Watermelon class that extends the Fruit class. The Watermelon class has the following members: 
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
 */
package Exercise.PastFinalTerm;

public class FT18S1Q5Watermelon extends FT18S1Q5Fruit{
    
    private double weight;

    public FT18S1Q5Watermelon(double weight, String type, String name) {
        super(name, type);
        this.weight = weight;
    }
    
    public double totalPrice(){
        
        if(type.equals("Local")){
            
            if(weight < 2){
                return weight * 2.25;
            } else if (weight >= 2 && weight <= 5){
                return weight * 1.95;
            } else if (weight > 5){
                return weight * 1.65;
            }
            
        } else if (type.equals("Imported")){
            
            if(weight < 2){
                return weight * 3.75;
            } else if (weight >= 2 && weight <= 5){
                return weight * 3.45;
            } else if (weight > 5){
                return weight * 3.15;
            }
            
        } 
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + weight + " = RM " + totalPrice();
    }
    
    
    
}
