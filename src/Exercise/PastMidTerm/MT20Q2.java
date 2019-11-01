/*
 * 3. Ask user to enter a number N. Print the three consecutive integer that adds to together to be N. Then, get the other consecutive number that adds up together to be N as well. Print "No Solutiion" if there is non

Sample:
Enter input N : 6
The 3 consecutive numbers that add up to N
1 2 3
All possible consecutive numbers that add up to N
1 2 3

::ALGORITHM::
FOR 3 CONSECUTIVE

EG. 6 = 1 2 3

N   = i + (i + 1) + (i + 2)
    = 3i + 3
i   = (N - 3) / 3

i is for you to start for loop with

eg. for N = 27
i = (27 - 3) / 3
i = 8

hence
for(int i = 8; i < i + 3; i++){
    System.out.print(i + " ");
}

if(N % 3 == 0){
    n = (N - 3) / 3
    for(int i = n; i < n + 3; i++){
    System.out.print(i + " ");
    } 
}

 */
package Exercise.PastMidTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MT20Q2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter input N : ");
        int N = s.nextInt();

        System.out.println("The 3 consecutive numbers that add up to N");

        if (N != 3 && N % 3 == 0) {

            System.out.println(((N / 3) - 1) + " " + (N / 3) + " " + ((N / 3) + 1));

        } else {
            System.out.println("No Solution");
        }

        System.out.println("All possible consecutive numbers that add up to N");
        int temp;
        boolean gotConsecutive = false;
        
        for (int a = (N - 1); a > 0; a--) {
            temp = 0;
            
            for (int b = a; b < N; b++) {
                temp += b;
                
                if (temp == N) {
                    gotConsecutive = true;
                    
                    for (int c = a; c <= b; c++) {
                        System.out.print(c + " ");

                    }
                    System.out.println();

                } else if (b == N - 1 && a == 1 && !gotConsecutive) {
                    System.out.println("No Solution");
                }

            }
        }
    }
}
/*
        int startingNumber;
        if(N != 3 && N % 3 == 0){
            
            startingNumber = (N - 3) / 3;
            
            for(int i = startingNumber; i < startingNumber + 3; i++){
                System.out.print(i + " ");
            }
            
        }else{
            System.out.println("No Solution");
        }
 */
