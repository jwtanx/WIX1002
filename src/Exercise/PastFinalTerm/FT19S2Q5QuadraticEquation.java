/*
 * 5. Define a class named QuadraticEquation for a quadratic equation ax² + bx + c = 0. The class contains: 
- private data fields a, b, and c that represent three coefficients. 
- a constructor with the arguments for a, b and c. 
- three get methods for a, b and c. 
- a method named Discriminant() that returns the discriminant which is b²-4ac. 
- methods named calcRoot1() and calcRoot2() that return r1 and r2, the two roots of the equation. [Hint : use Math.sqrt(n) to find the square root of n] 
                 _________                    _________
          -b + \/b² - 4ac              -b - \/b² - 4ac
    r1 = ------------------      r2 = ------------------
                 2a                           2a

The methods calcRoot1 and calcRoot2 are useful only if Discriminant is positive. Both methods will return 0 if Discriminant is negative.
 */
package Exercise.PastFinalTerm;

public class FT19S2Q5QuadraticEquation {
    
    private int a, b, c;

    public FT19S2Q5QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public int Discriminant(){
        return (int)(Math.pow(b, 2) - (4*a*c));
    }
    
    public int calcRoot1(){
        
        if(Discriminant() < 0){
            return 0;
        }
        return (int) (-b + Math.sqrt(Discriminant())) / (2*a);
        
    }
    
    public int calcRoot2(){
        
        if(Discriminant() < 0){
            return 0;
        }
        return (int) (-b - Math.sqrt(Discriminant())) / (2*a);
        
    }
    
}
