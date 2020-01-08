/*
 * 1. 
 */
package Exercise.PastFinalTerm;

// remove import java.util.Scanner; // 20
public class FT18S2Q1 {
    public static void main(String[] args) { 
        int[] num = {69, 15, 12, 27, 74, 23}; // 12 errors
        int cnt = 0; 
        for (int i = 0; i < num.length; i++) // 13
            if (isOdd(num[i])) // 14
                cnt++; 
        
        System.out.println("The number of odd number is " + cnt); 
        System.out.println("The sum of the array is " + compSum(num)); // 15
    }
    public static boolean isOdd(int a) { // 16
        if (a % 2 != 0) { // 17
            return true;
        } else {
            return false;
        }
    }
    
    public static int compSum(int[] a){ // 18
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i]; // 19
        }
        return total;
    }
}
