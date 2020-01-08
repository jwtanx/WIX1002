/*
 * 2. A matrix is a rectangular array of numbers arranged in rows and columns. Write a program to generate TWO N x N matrix. The program must consist of the following four methods. The formula is given as below in Figure 1. 

Sample output:
Enter N : 2
Matrix A
9 0
2 8

Matrix B
3 4
9 9

Matrix A + B
12 4
11 17

Matrix A x B
27 36
78 80

Enter N : 3
Matrix A
9 6 4
9 4 5
1 7 1

Matrix B
5 5 6
1 9 2
4 6 6

Matrix A + B
14 11 10
10 13 7
5 13 7

Matrix A x B
67 123 90
69 111 92
16 74 26

- A method to generate the matrix, the values of the matrix is any random number from 0 - 9.
- A method to display the matrix.
- A method to add two matrices. 
- A method to multiply two matrices.
 */
package Exercise.PastFinalTerm;

import java.util.Random;
import java.util.Scanner;

public class FT19S1Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = s.nextInt();
        
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        
        generator(A, B);
        display(A, B);
        addition(A, B);
        multiplication(A, B);
    }
    
    public static void generator(int[][] a, int[][] b){
        
        Random ran = new Random();
        
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[r].length; c++){
                a[r][c] = ran.nextInt(10);
                b[r][c] = ran.nextInt(10);
            }
        }
        
    }
    
    public static void display(int[][] a, int[][] b){
        
        System.out.println("Matrix A");
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[r].length; c++){
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatrix B");
        for(int r = 0; r < b.length; r++){
            for(int c = 0; c < b[r].length; c++){
                System.out.print(b[r][c] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void addition(int[][] a, int[][] b){
        
        int[][] add = new int[a.length][a[0].length];
        
        for(int r = 0; r < b.length; r++){
            for(int c = 0; c < b[r].length; c++){
                add[r][c] = a[r][c] + b[r][c];
            }
        }
        
        System.out.println("\nMatrix A + B");
        for(int r = 0; r < add.length; r++){
            for(int c = 0; c < add[r].length; c++){
                System.out.print(add[r][c] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void multiplication(int[][] a, int[][] b){
        
        int[][] multi = new int[a.length][a[0].length];
        
        for(int r = 0; r < b.length; r++){
            for(int c = 0; c < b[r].length; c++){
                multi[r][c] = 0;
                for(int k = 0; k < b.length; k++){
                    multi[r][c] += a[r][k] * b[k][c];
                }
            }
        }
        
        System.out.println("\nMatrix A x B");
        for(int r = 0; r < multi.length; r++){
            for(int c = 0; c < multi[r].length; c++){
                System.out.print(multi[r][c] + " ");
            }
            System.out.println();
        }
        
    }
}
