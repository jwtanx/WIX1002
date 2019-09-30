/*
 * Write a program that converts the seconds to hours, minutes and seconds.

        Enter the number of seconds: 123456

        123456 seconds is 34 hours, 17 minutes and 36 seconds


 */
package Lab2;

import java.util.Scanner;
public class L2Q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int second, h, m, s;
        
        System.out.print("Enter the number of seconds: ");
        second = sc.nextInt();
        
        h = second / 60 / 60;
        
        m = second / 60 % 60;
        
        s = second % 60 % 60;
        
        System.out.printf("\n%d seconds is %d hours, %d minutes and %d seconds\n", second, h, m, s);
        
    }
}
