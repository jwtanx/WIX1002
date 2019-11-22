/*
 * 1. Define a class name Number. The class is used to handle an integer array. The class Number will display all the item of the array, the even number, the prime number, the maximum number, the minimum number, the average, the square number. Create a Tester class to test the program.

Number a = new Number() // generate 10 random integers within 0 to 100.
Number b = new Number(5) // generate 5 random integers within 0 to 100.
Number c = new Number(4, 50) // generate 4 random integers within 0 to 50.
 */
package Lab8;

public class NumberTesterClass {
    public static void main(String[] args) {
        
        Number a = new Number();
        System.out.println(a.toString());
        System.out.println(a.toStringEven());
        System.out.println(a.toStringMax());
        System.out.println(a.toStringMin());
        System.out.println(a.toStringAverage());
        System.out.println(a.toStringSqrt());
        
        
    }
}
