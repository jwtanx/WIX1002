/*
 * 4. A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers and i is the imaginary unit which satisfies the equation i² = -1. In this expression, a is the real part and b is the imaginary part of the complex number.

Design a Complex class to perform computation with complex numbers. This class consists of the following members: A double field for the real part. A double field for the imaginary part. A no-argument constructor. A constructor with arguments. A method addComplexNum to add two complex numbers using this formula: the real parts are added together and the imaginary parts are added together. (a + bi) + (c + di) = (a+c) + (b+d)i A method subtractComplexNum to subtract two complex numbers using this formula: the real part of the right operand is subtracted from the real part of the left operand and the imaginary part of the right operand is subtracted from the imaginary part of the left operand. (a + bi) - (c + di) = (a-c) + (b-d)i

A method toString that will display a complex number in the form (a, b) where a is the real part and b is the imaginary part. 

Create a Q4Main class to test the program. The program will ask the user to enter the real and imaginary parts of two complex numbers, create two Complex objects and display the complex numbers together with the addition and subtraction results. 

Sample output:
First complex number. Enter a number for the real part: 2<enter> 

First complex number. Enter a number for the imaginary part: 6<enter>

Second complex number. Enter a number for the real part: 4<enter> 

Second complex number. Enter a number for the imaginary part: 7<enter>

First complex number: (2 + 6i)
Second complex number: (4 + 7i)
Addition of the two complex numbers: (6 + 13i)
Subtraction of the two complex numbers: (-2 + -1i) 
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT17S1Q4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        FT17S1Q4Complex a = new FT17S1Q4Complex();
        
        System.out.print("First complex number. Enter a number for the real part: ");
        a.setReal1(s.nextInt());
        
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        a.setImaginary1(s.nextInt());
        
        System.out.print("Second complex number. Enter a number for the real part: ");
        a.setReal2(s.nextInt());
        
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        a.setImaginary2(s.nextInt());
        
        // DISPLAY
        System.out.printf("\nFirst complex number: (%d + %di)\n", a.getReal1(), a.getImaginary1());
        System.out.printf("Second complex number: (%d + %di)\n", a.getReal2(), a.getImaginary2());
        
        // ADDITION
        a.addComplexNum();
        System.out.print("Addition of the two complex numbers: ");
        System.out.println(a.toString());
        
        // SUBTRACTION
        a.subtractComplexNum();
        System.out.print("Subtraction of the two complex numbers: ");
        System.out.println(a.toString());
        
    }
}
