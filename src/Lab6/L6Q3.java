/*
 * 3. Write a Java method that accepts an array of 10 integers. The method should reverse the integer in the array. Example, if the number is 1234, the number will change to 4321. 
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q3 {
    
    static int[] reversed(int[] numlist){
        
        int[] rev = new int[numlist.length];
        int num;
        int revnum;
        
        for(int c = 0; c < numlist.length; c++){
            
            num = numlist[c];
            revnum = 0;
            
            while(num > 0){
                revnum = (revnum * 10) + (num % 10);
                num /= 10;
            }
            
            rev[c] = revnum;
        }
        
// OLD VERSION
/*
        String reverseStr;
        for(int c = 0; c < numlist.length; c++){
            
            reverseStr = "";
            String parsed = Integer.toString(numlist[c]);
            
            for(int k = 0; k < parsed.length(); k++){
                reverseStr += parsed.charAt(parsed.length() - k - 1);
            }
            
            rev[c] = Integer.parseInt(reverseStr);
            
        }
*/
        return rev;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int[] numlist = new int[10];
        
        System.out.println("Enter 10 numbers\n");
        
        for(int i = 0; i < numlist.length; i++){
            System.out.printf("Num %d: ", i+1 );
            numlist[i] = s.nextInt();
        }
        
        System.out.print("\nNumber list\t\t: ");
        for(int i = 0; i < numlist.length; i++){
            
            if(i == numlist.length - 1) System.out.print(numlist[i]);
            else System.out.print(numlist[i] + ", ");
            
        }
        
        int[] getReversedNumList = reversed(numlist);
        System.out.print("\nReversed number list\t: ");
        for(int i = 0; i < getReversedNumList.length; i++){
            
            if(i == getReversedNumList.length - 1) System.out.print(getReversedNumList[i]);
            else System.out.print(getReversedNumList[i] + ", ");
            
        }
        
        System.out.println("\n\nDone @ 211019, 09:15");
    }
}



