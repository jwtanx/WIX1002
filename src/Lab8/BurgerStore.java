/*
 * 6. You operate several burger stalls distributed throughout town. Each burger stall has an ID and the number of burger sold for the day. The class consists of a constructor to initialize the instance variables and a sold method that increment the number of burger sold by parameter value. The class also contains a variable and method that tracks the total number of burgers sold in all stalls. Display the total burger sold by each stall and the total number of burgers sold in all stalls.
 */
package Lab8;

public class BurgerStore {
    
    private String ID;
    private int numOfBurgerSold;
    private static int totalBurgerSold = 0;
    
    public BurgerStore(){
        ID = "";
        numOfBurgerSold = 0;
    }
    
    public BurgerStore(String ID){
        this.ID = ID;
        numOfBurgerSold = 0;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumOfBurgerSold() {
        return numOfBurgerSold;
    }

    public void sold(int numOfBurgerSold) {
        this.numOfBurgerSold += numOfBurgerSold;
        totalBurgerSold += numOfBurgerSold;
    }

    @Override
    public String toString() {
        return "Burger Store ID : " + ID + "\nNum Of Burger Sold : " + numOfBurgerSold;
    }
    
    public String toStringTotalBurgerSold() {
        return "Total burger sold in all stalls : " + totalBurgerSold;
    }
    
    
    
}
