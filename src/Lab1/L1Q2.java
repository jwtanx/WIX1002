/*
 * Create a new project named L1Q2. Modify the main class to MyProfile. The project will display your personal profile such as full name, matric number, address, email, contact and etc. (Exchange the profile with your friend)

 */
package Lab1;

import java.util.Scanner;
public class L1Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("\nName: ");
        String name = s.nextLine();
        
        System.out.print("\nMatric Number: ");
        String matric = s.nextLine();
        
        System.out.print("\nAddress: ");
        String address = s.nextLine();
        
        System.out.print("\nE-mail: ");
        String email = s.nextLine();
        
        System.out.print("\nContact: ");
        String contact = s.nextLine();
        
        System.out.printf("\nHi %s, your data are recorded as followed: \n", name);
        System.out.printf("\nMatric number: %s\nAddress: %s\nE-mail: %s\nContact: %s\n", matric, address, email, contact);
        
    }
}
