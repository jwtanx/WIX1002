
package Viva.Method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q5Ver2 {
    static Random r = new Random();
    public static void main(String[] args) {
        System.out.print("Enter the number N : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        
        int[] array = new int[size];
        generateDigit(array);
        
        System.out.print("Generated numbers are: \n");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        printPermutations(array);
    }

    public static void generateDigit(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
            }
        }
    }

    public static void printPermutations(int[] array) {
        int numOfPermutation = 1;
        
        for (int i = 1; i <= array.length; i++) {
            numOfPermutation *= i;//permutation with no restricted condition
        }
        
        int[] sequence = new int[array.length];//4 numbers
        String[] permutationArray = new String[numOfPermutation];//24 permutations in total

        for (int i = 0; i < numOfPermutation; i++) {
            permutationArray[i] = "";
            for (int j = 0; j < sequence.length; j++) {
                sequence[j] = r.nextInt(array.length);
                for (int z = 0; z < j; z++) {
                    if (sequence[j] == sequence[z]) {
                        j--;
                    }
                }
            }
            for (int j = 0; j < sequence.length; j++) {
                permutationArray[i] += array[sequence[j]];
            }
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    if (permutationArray[i].equals(permutationArray[j])) {
                        i--;
                    }
                }
            }
        }
        Arrays.sort(permutationArray);
        for (int i = 0; i < numOfPermutation; i++) {
            if(permutationArray[i].charAt(0) == '0'){
                System.out.println(permutationArray[i].substring(1));
            }else{
                System.out.println(permutationArray[i]);
            }
        }
    }
}
