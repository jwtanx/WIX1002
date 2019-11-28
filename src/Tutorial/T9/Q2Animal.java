/*
2. Define a class Organism. The class contains the initial size of the organism and the growth rate. Create a constructor to initialize the instance variables. Then, define a class Animal. Animal is an organism that has extra instance variable which is the amount of eating need. Create a constructor to initialize the instance variable and a method to display the Animal instance variables. 
 */
package Tutorial.T9;

public class Q2Animal extends Q2Organism{
    
    private int amountOfEatingNeed;
    
    public Q2Animal(int amountOfEatingNeed) {
        super();
        this.amountOfEatingNeed = amountOfEatingNeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAmount Of Eating Need : " + amountOfEatingNeed;
    }
    
    
    
    
}
