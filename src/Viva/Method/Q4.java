/*
 * 4. Write a method that accepts two parameter, N and R. The method should check whether the number R is the summation of N subsequent number (any number).
Write a Java program that accept input N and R from the user and check using the method.
If there is a summation of N subsequent number, print out R = x + (x+1) + (x+2) + … else, print out “No summation of subsequent number”  
Sample Input:
Enter N: 3
Enter R: 522  
Sample Output: Yes. 522 = 173 + 174 + 175
 */
package Viva.Method;
// NOT DONE

import java.util.Scanner;

public class Q4 {

    public static void summation(int N, int R) {
        int sum = 0 ;
        int count = 0, countNum=0;
        boolean exist = false;
        for (int i = 1; i < R/(N/2); i++){
            for (int j = i; j < R/(N/2); j ++){//test if the sum is equal to R or not
                sum += j;
                count++;
                if (sum == R && count == N){
                    System.out.print("Yes. " + R + " = ");
                    for(int z = i; z <= j; z++){//print out the consecutive numbers
                        exist = true;
                        countNum++;
                        if (countNum != count){
                            System.out.print(z + " + ");
                        }
                        else{
                            System.out.print(z + "\n");
                        }
                    }
                }
                
            }
            count = 0 ;
            sum = 0;
        }
        if (exist == false){
            System.out.println("No summation of subsequent number");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Check whether the number R is the summation of N subsequent number (any number).");
        System.out.print("Enter N: ");
        int N = s.nextInt();
        System.out.print("Enter R: ");
        int R = s.nextInt();
        
        summation(N, R);

//        if (checkOdd(N) && checkSumWithSub(N, R)) {
//            System.out.printf("Yes. %d = ", R);
//
//            for (int i = ((R / N) - (N / 2)); i <= ((R / N) + (N / 2)); i++) {
//                System.out.print(i);
//                if (i != ((R / N) + (N / 2))) {
//                    System.out.print(" + ");
//                }
//            }
//            System.out.println();
//
//        } else if (!checkOdd(N)) {
//            int num[] = new int[N];
//            int sum = 0;
//            for (int i = ((R / N) - ((N / 2) - 1)); i < ((R / N) + (N / 2)); i++) {
//                sum += num[i];
//            }
//
//            if (sum == R) {
//                System.out.printf("Yes. %d = ", R);
//
//                for (int i = 0; i < num.length; i++) {
//
//                    if (i == num.length - 1) {
//                        System.out.print(i);
//                    } else {
//                        System.out.print(i + " + ");
//                    }
//                }
//
//            } else {
//                System.out.println("No summation of subsequent number");
//            }
//
//        }
//    }
//
//    public static boolean checkSumWithSub(int n, int r) {
//
//        return r % n == 0;
//    }
//
//    public static boolean checkOdd(int n) {
//
//        return n % 2 != 0;
//    }
    }
}

