/*
 * 6. Write a program that used to create Pascal Triangle in the square matrix. The program will accept an integer from the users and use the integer to create the Pascal Triangle. 
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L5Q6 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int N = s.nextInt();
        
        int[][] pt = new int[N][N];
        pt[0][0] = 1;
        
        System.out.printf("The Pascal Triangle with %d row(s):\n", N);
        
        for(int row = 0; row < pt.length; row++){
            for(int col = 0; col < pt[row].length; col++){
                
                if(row == 0 && col == 0) pt[row][col] = 1;
                else if(row == 0 && col != 0) pt[row][col] = 0;
                
                if(row != 0 && col == 0) pt[row][col] = pt[0][0];
                else if(row != 0 && col != 0) pt[row][col] = pt[row-1][col-1] + pt[row-1][col];
                
            }
        }
        
        for(int row = 0; row < pt.length; row++){
            for(int col = 0; col < pt[row].length; col++){
                
                System.out.printf("%5d ", pt[row][col]);
                
            }
            System.out.println();
        }
        
        System.out.println("\nPascal Triangle in really triangle:");
        // Pascal Triangle in triangle
        
        int spaces = N/3;
        
        /* PROTOTYPE ALGO
        int numspace = N/2 - 1;
        String strspace = "";
        for(int i = 0; i < numspace; i++){
            strspace += " ";
        }
        */
        for(int row = 0; row < pt.length; row++){
                for(int space = 0; space <= (pt.length/2) - row + spaces; space++){    
                    System.out.print("    ");    
                    //System.out.printf("%s", strspace);    //<-- PROTOTYPE ALGO
                }
                for(int col = 0; col < pt[row].length; col++){
                    if(pt[row][col] != 0) System.out.printf("%4d    ", pt[row][col]);
                    //if(pt[row][col] != 0) System.out.printf("%d%s", pt[row][col], strspace);  //<-- PROTOTYPE ALGO
                }
                System.out.println();
        }
        
        System.out.println("\nDone @ 171019, 00:25");
    }
}
