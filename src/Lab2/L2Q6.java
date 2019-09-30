/*
Write a program that calculates the energy needed to heat water.

Q = M * (final temperature – initial temperature) * 4184

M = Weight of water in kg
Q = Energy in joules
The temperature are in degree Celsius

 */
package Lab2;

import java.util.Scanner;
public class L2Q6 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double M, Q, ft, it;
        
        System.out.print("\nMass of water(kg): ");
        M = s.nextDouble();
        
        System.out.print("\nFinal temperature(°C): ");
        ft = s.nextDouble();
        
        System.out.print("\nInitial temperature(°C): ");
        it = s.nextDouble();
        
        Q = M * (ft - it) * 4184;
        
        System.out.println("");
        
        System.out.printf("The energy needed is %.6eJ\n", Q);
        
    }
}
