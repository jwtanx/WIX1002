/*
 * 2. Write statements for each of the following

a. Define a class Digit.
b. Declare the instance variable that used to store a number.
c. Create a constructor that assign the parameter value to the number.
d. Create a digitMultiplication method that returns the multiplication of the number. If the number is 1345, the method will return 60.
e. Create a method that used to display the digit multiplication of the number.
f. Create a tester class that displays the digit multiplication of 4567.  
 */
package Tutorial.T8;

// 2a. Define a class Digit.
public class Digit {
    
    // 2b. Declare the instance variable that used to store a number.
    private int num;
    
    // 2c. Create a constructor that assign the parameter value to the number.
    public Digit(int num){
        this.num = num;
    }
    
    // 2d. Create a digitMultiplication method that returns the multiplication of the number. If the number is 1345, the method will return 60.
    public int digitMultiplication(int num){
        
        int multi = 1;
        
        while(num != 0){
            multi *= num % 10;
            num /= 10;
        }
        
        return multi;
        
    }
    
    // 2e. Create a method that used to display the digit multiplication of the number.
    public String toString(){
        return "Multiplication : " + digitMultiplication(num);
    }
    
}
