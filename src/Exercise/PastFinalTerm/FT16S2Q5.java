/*
 * 5. Write a program that randomly fills in 0s and 1s into a tic-tac-toe board, prints the board, and finds the rows, columns, or diagonals with all Os or 1s. Use a two-dimensional array to represent a TicTacToe board. Here is a sample run of the program.

Sample output
001
001
111
All 1s on row 2
All 1s on column 2

 */
package Exercise.PastFinalTerm;

import java.util.Random;

public class FT16S2Q5 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int[][] ticboard = new int[3][3];
        int zero = 0;
        int one = 0;
        
        for(int i = 0; i < ticboard.length; i++){
            for(int j = 0; j < ticboard[i].length; j++){
                
                ticboard[i][j] = r.nextInt(2);
                if(ticboard[i][j] == 0){
                    
                    if(zero < 5){
                        zero++;
                        System.out.print(ticboard[i][j]);
                    } else {
                        j--;
                    }
                    
                } else if (ticboard[i][j] == 1){
                    
                    if(one < 5){
                        one++;
                        System.out.print(ticboard[i][j]);
                    } else {
                        j--;
                    }
                    
                }
                
            }
            System.out.println();
        }
        
        // Checking the tic board by row
        for(int i = 0; i < ticboard.length; i++){
            for(int j = 0; j < 1; j++){
                
                if(ticboard[i][j] == ticboard[i][j+1]){
                    if(ticboard[i][j] == ticboard[i][j+2]){
                        System.out.println("All " + ticboard[i][j] + "s on row " + i);
                    }
                }
                
            }
        }
        
        // Checking the tic board by column
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < ticboard[i].length; j++){
                
                if(ticboard[i][j] == ticboard[i+1][j]){
                    if(ticboard[i][j] == ticboard[i+2][j]){
                        System.out.println("All " + ticboard[i][j] + "s on column " + j);
                    }
                }
                
            }
        }
        
        
        
        
    }
}
