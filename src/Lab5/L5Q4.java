/*
4. Write a program that rotates 90 degrees clockwise a 3 by 3 matrix. 
 */
package Lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L5Q4 {
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        System.out.print("N x N matrix, N: ");
        int N = s.nextInt();
        int[][] mat = new int[N][N];
        
        System.out.print("\nChoice:\n1. Manual\n2. Random generate\n");
        System.out.print("Select: ");
        int c = s.nextInt();
        
        System.out.println();
        
        if(c == 1){
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length; j++){
                    System.out.printf("Enter for matrix[%d][%d]: ", i, j);
                    mat[i][j] = s.nextInt();
                }
            }
        }
        else if(c == 2){
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length; j++){
                    mat[i][j] = 1 + r.nextInt(9);
                }
            }
        }
        
        String s1 = "90° Clockwise Rotation";
        String s2 = "90° Anti-Clockwise Rotation";
        String s3 = "180° Rotation";
        String fs  = "";
        
        System.out.printf("Choices:\n1. %s\n2. %s\n3. %s", s1, s2, s3);
        System.out.print("\nSelect: ");
        int choice = s.nextInt();
        
        if(choice == 1) fs = s1;
        if(choice == 2) fs = s2;
        if(choice == 3) fs = s3;
        
        System.out.println("\nMatrix:");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        int temp;
        int z = 0;
        for(int x = 0; x < N/2; x++){
            
            if (choice == 1 || choice == 2)z = -x-1;
            else if (choice == 3)z = 0;
            
            for(int y = x; y < N+z; y++){
                
                switch(choice){
                    
                    // 90° clockwise
                    case 1:
                        
                        // Store current cell
                        temp = mat[x][y];
                        
                        // Left -> Top
                        mat[x][y] = mat[N-1-y][x];
                        
                        // Bottom -> Left
                        mat[N-1-y][x] = mat[N-1-x][N-1-y];
                        
                        // Right -> Bottom
                        mat[N-1-x][N-1-y] = mat[y][N-1-x];
                        
                        // Temp -> Right
                        mat[y][N-1-x] = temp;
                        
                        break;
                    
                    //90° Anti-Clockwise
                    case 2:
                        
                        // Store current cell
                        temp = mat[x][y];
                        
                        // Right -> Top
                        mat[x][y] = mat[y][N-1-x];
                        
                        // Bottom -> Right
                        mat[y][N-1-x] = mat[N-1-x][N-1-y];
                        
                        // Left -> Bottom
                        mat[N-1-x][N-1-y] = mat[N-1-y][x];
                        
                        // Temp -> Left
                        mat[N-1-y][x] = temp;
                        
                        break;
                    
                    // 180° Flip
                    case 3:
                        
                        // Store current cell
                        temp = mat[x][y];
                        
                        // Bottom -> Top
                        mat[x][y] = mat[N-1-x][N-1-y];
                        
                        // Bottom -> Top
                        mat[N-1-x][N-1-y] = temp;
                        
                        break;
                    
                    default:
                        System.out.println("Done");
                        System.exit(0);
                        
                }
            }
        }
        
        System.out.printf("\nAfter %s:\n", fs);
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nDone @ 161019, 07:10");
        
    }
}
