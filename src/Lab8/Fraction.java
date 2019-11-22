/*
4. Define a class Fraction. The class has an input method that accepts the numerator and the denominator from the user. Use the mutator method to set the numerator and denominator and the accessor method to get the value of numerator and denominator. This class also has a method to display the fraction reduced to lowest terms. (find the greatest common divisor for the numerator and denominator. Create a Tester class to test the program. 
 */
package Lab8;

public class Fraction {

    private int numerator;
    private int denominator;
    private int GCD;
    
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        setGCD(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        setGCD(numerator, denominator);
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        setGCD(numerator, denominator);
    }
    
    public void setGCD(int n, int d){
        
        int remainder;
        int GCD = 0;
        
        do{
            
            remainder = d % n;   
            if(remainder == 0){
                GCD = n;
                break;
            }
            d = n;            
            n = remainder;
            
        }while (remainder != 0);
        
        this.GCD = GCD;
    }
    
    @Override
    public String toString() {
        return "Numerator : " + numerator + "\nDenominator : " + denominator +
                "\nFraction : " + (numerator/GCD) + " / " + (denominator/GCD);
    }
    
    
    
}
