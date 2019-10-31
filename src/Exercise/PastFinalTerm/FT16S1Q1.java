/*
 * 1. Correct all the errors
 */
package Exercise.PastFinalTerm;

/**
 *
 * @author User
 */
public class FT16S1Q1 {

    public static void main(String[] args) {

        int[] num = {34, 15, 12, 27, 74, 23};

        int cnt = 0;

        for (int i = 0; i < num.length; i++) {
            if (isEven(num[i])) {
                cnt++;
            }
        }
        
        System.out.println("The number of even number is " + cnt);
        System.out.println("The sum of the array is " + getTotal(num));
        
        System.out.println("\nDone @ 311019, 18:45");
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;

    }
    
    public static int getTotal(int[] a){
        int total = 0;
        
        for(int i = 0; i < a.length; i++){
            total += a[i];
        }
        
        return total;
        
    }

}
