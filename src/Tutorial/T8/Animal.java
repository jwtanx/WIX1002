/*
 * 1. Write statements for each of the following 

i. Create an object of the class Animal.
j. Create an object of the class Animal that used to represent a cat.

 */
package Tutorial.T8;


public class Animal {
    
    private String name;
    
    public Animal(){
        name = "";
    }
    
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Override
    public String toString() {
        return "Name : " + name;
    }
}
