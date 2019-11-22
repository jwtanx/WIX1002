/*
 * 1. Define a class name Number. The class is used to handle an integer array. The class Number will display all the item of the array, the even number, the prime number, the maximum number, the minimum number, the average, the square number. Create a Tester class to test the program.

Number a = new Number() // generate 10 random integers within 0 to 100.
Number b = new Number(5) // generate 5 random integers within 0 to 100.
Number c = new Number(4, 50) // generate 4 random integers within 0 to 50.
 */
package Lab8;

import java.util.Random;

public class Number {

    private int num[];
    private Random r = new Random();

    public Number() {
        num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(101);
        }
    }

    public Number(int n) {
        num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = r.nextInt(101);
        }
    }

    public Number(int n, int range) {
        num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = r.nextInt(range + 1);
        }
    }

    public String toString() {
        String str = "The list : ";

        for (int i = 0; i < num.length; i++) {
            str = str + num[i] + " ";
        }

        return str;
    }

    public String toStringEven() {
        String str = "The even numbers : ";

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                str = str + num[i] + " ";
            }
        }

        return str;
    }

    public String toStringPrime() {
        String str = "The prime numbers : ";

        for (int i = 0; i < num.length; i++) {
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j != 0) {
                    str = str + num[i] + " ";
                }
            }
        }

        return str;

    }

    public String toStringMax() {
        String str = "The max number : ";
        int max = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        str = str + max;

        return str;
    }

    public String toStringMin() {
        String str = "The min number : ";

        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        str = str + min;

        return str;
    }

    public String toStringAverage() {
        String str = "The average : ";
        
        double average = 0.0;
        int sum = 0;
        
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        
        average = (sum*1.0)/num.length;
        
        str = str + String.format("%.2f", average);
        
        return str;
    }
    
    public String toStringSqrt(){
        String str = "The square : ";
        
        for(int i = 0; i < num.length; i++){
            str = str + (int)Math.pow(num[i], 2) + " ";
        }
        
        return str;
    }
    
}
