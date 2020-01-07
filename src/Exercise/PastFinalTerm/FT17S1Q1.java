/*
 * 1. Correct all the errors.
 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT17S1Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
        int inputNumber;
        int value = 0;
        int counter = 1; // 1

        while (counter <= 5) {
            System.out.print("Enter number: ");
            inputNumber = input.nextInt();

            if (inputNumber >= 1 && inputNumber <= 30) {
                switch (counter) { // 2
                    case 1:
                        number1 = inputNumber;
                        break;
                    case 2:
                        number2 = inputNumber;
                        break;
                    case 3: // 3
                        number3 = inputNumber;
                        break;
                    case 4: // 4
                        number4 = inputNumber;
                        break;
                    case 5:
                        number5 = inputNumber;
                        break;
                }// 5
                counter++; //10
            } else {
                System.out.println("Invalid Input\nNumber should be between 1 and 30");
            }
        }

        for (counter = 1; counter <= 5; counter++) { // 6
            switch (counter) { // 7
                case 1:
                    value = number1;
                    break;
                case 2:
                    value = number2;
                    break;
                case 3:
                    value = number3;
                    break;
                case 4:
                    value = number4;
                    break;
                case 5:
                    value = number5;
                    break;
            }
            for (int j = 1; j <= value; j++) { // 8 & 9
                System.out.print("*");
            }
                System.out.println();
        }
        
        System.out.println("\nDone @ 311019, 22:35");
        
    }
}
