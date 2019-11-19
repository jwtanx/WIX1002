/*
 * 1k. Create an object of the class Number with the value 20 and 40.
 */
package Tutorial.T8;

public class Number {
    
    private int a, b;
    
    public Number(){
        a = 0;
        b = 0;
    }
    
    // Constructor with arguments
    public Number(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getA(){
        return a;
    }
    
    public int getB(){
        return b;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public String toString(){
        return "Num1 : " + a + "\n" +
               "Num2 : " + b; 
    }
    
}
