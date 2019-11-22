/*
4. Define a class Fraction. The class has an input method that accepts the numerator and the denominator from the user. Use the mutator method to set the numerator and denominator and the accessor method to get the value of numerator and denominator. This class also has a method to display the fraction reduced to lowest terms. (find the greatest common divisor for the numerator and denominator. Create a Tester class to test the program. 
 */
package Lab8;

public class FractionTesterClass {
    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(5, 15);
        System.out.println(f1);
        
        System.out.println();
        
        Fraction f2 = new Fraction(15, 5);
        System.out.println(f2);
    }
}
