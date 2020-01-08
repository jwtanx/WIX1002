/*
 * 1. Correct the errors
 */
package Exercise.PastFinalTerm;
// The purpose of this program is to count and display the total number of even itegers in the array.
// Another pourpose is to find the biggest integer in the array and display it
// The output based n the given list, should be as below.
// The number of even integers is 3.
// The biggest Integer is 74

// 1  remove scanner
public class FT19S2Q1 {
    public static void main(String[] args) {
        
        int[] num = {66, 15, 20, 27, 74, 33}; // 2
        
        int cnt = 0;
        
        for(int k = 0; k < num.length; k++) // 3
            if(isEven(num[k])) // 4
                cnt++;
        
        System.out.println("The number of even integers is " + cnt + "."); // 5
        System.out.println("The biggest Integer is " + findMax(num)); // 6, 7
        
    }
    
    public static boolean isEven(int a){ // 7
        if(a % 2 == 0)
            return true;
        else
            return false;
    }
    
    public static int findMax(int[] a){ // 9
        int max = a[0];
        
        for(int n = 1; n < a.length; n++) // 10
            if(a[n] > max)
                max = a[n];
            
        return max; 
    }
}
