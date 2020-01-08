/*
 * 5. Design a Staff class that consists of the following members: 
- A field for the name of the staff. 
- A field for the IC of the staff. 
- A constructor that contains all the above fields
- A toString method that displays the staff's name and IC. 
 */
package Exercise.PastFinalTerm;

public class FT17S2Q5Staff {
    
    private String fullName;
    private String IC;

    public FT17S2Q5Staff(String fullName, String IC) {
        this.fullName = fullName;
        this.IC = IC;
    }

    public String toString() {
        return "Full Name: " + fullName + 
               "\nIC: " + IC;
    }
    
}
