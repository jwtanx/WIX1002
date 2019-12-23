/*
 * 4. Design a Complex class to perform computation with complex numbers. This class consists of the following members: A double field for the real part. A double field for the imaginary part. A no-argument constructor. A constructor with arguments. A method addComplexNum to add two complex numbers using this formula: the real parts are added together and the imaginary parts are added together. (a + bi) + (c + di) = (a+c) + (b+d)i A method subtractComplexNum to subtract two complex numbers using this formula: the real part of the right operand is subtracted from the real part of the left operand and the imaginary part of the right operand is subtracted from the imaginary part of the left operand. (a + bi) - (c + di) = (a-c) + (b-d)i

A method toString that will display a complex number in the form (a, b) where a is the real part and b is the imaginary part. 

 */
package Exercise.PastFinalTerm;

public class FT17S1Q4Complex {
    
    private int real1, real2, imaginary1, imaginary2;
    private int realSum, imaginarySum;
    
    public FT17S1Q4Complex(int real1, int real2, int imaginary1, int imaginary2) {
        this.real1 = real1;
        this.real2 = real2;
        this.imaginary1 = imaginary1;
        this.imaginary2 = imaginary2;
    }

    public FT17S1Q4Complex() {
        real1 = 0;
        real2 = 0;
        imaginary1 = 0;
        imaginary2 = 0;
    }
    
    public void addComplexNum(){
        realSum = real1 + real2;
        imaginarySum = imaginary1 + imaginary2;
    }
    
    public void subtractComplexNum(){
        realSum = real1 - real2;
        imaginarySum = imaginary1 - imaginary2;
    }

    public int getReal1() {
        return real1;
    }

    public void setReal1(int real1) {
        this.real1 = real1;
    }

    public int getReal2() {
        return real2;
    }

    public void setReal2(int real2) {
        this.real2 = real2;
    }

    public int getImaginary1() {
        return imaginary1;
    }

    public void setImaginary1(int imaginary1) {
        this.imaginary1 = imaginary1;
    }

    public int getImaginary2() {
        return imaginary2;
    }

    public void setImaginary2(int imaginary2) {
        this.imaginary2 = imaginary2;
    }
    
    @Override
    public String toString() {
        return "(" + realSum + " + " + imaginarySum + "i)";
    }
    
    
}
