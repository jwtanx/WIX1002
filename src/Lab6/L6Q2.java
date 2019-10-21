/*
 * 2. Write a Java method multiPrint(int n, char c) that prints n copies of character c. Then, write a Java program to use the method to display the triangles and diamonds.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q2 {
    
    static void multiPrint(int n, char c){
        
        for(int i = 0; i < n; i++){
            System.out.print(c);
        }
        
        System.out.print("\n\nTriangle below: ");
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            
            for(int k = 0; k < ((2 * i) - 1); k++){
                System.out.print(c);
            }
            System.out.println();
        }
        
        System.out.println("\n\nUpside down triangle below: ");
        for(int i = n; i > 0; i--){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            
            for(int k = 0; k < ((2 * i) - 1); k++){
                System.out.print(c);
            }
            System.out.println();
        }
        
        System.out.println("\n\nDiamond below: ");
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            
            for(int k = 0; k < ((2 * i) - 1); k++){
                System.out.print(c);
            }
            System.out.println();
        }
        for(int i = n; i > 0; i--){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            
            for(int k = 0; k < ((2 * i) - 1); k++){
                System.out.print(c);
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("n copies of character 'c'");
        System.out.print("n: ");
        int n = s.nextInt();
        
        System.out.print("Display: ");
        multiPrint(n, 'c');
        
        System.out.println("\n\nDone @ 211019, 08:00");
        
    }
}
