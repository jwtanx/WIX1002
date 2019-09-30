/*
 * Write a program that stimulates a simple calculator. It reads two integers and a
character. If the character is a +, the sum is printed; if it is a -, the difference is
printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if
it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)

    eg. Enter two integer number: 30 5
        Enter the operand: /
        30 / 5 = 6

 */
package Lab3;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        String number[] = s.nextLine().split(" ");
        
        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);
        int total;
        
        System.out.print("\nEnter the operand(+ - x / %): ");
        char operand = s.next().charAt(0);
        
        
        switch(operand){
            
            case '+':
                total = a + b;
                System.out.printf("\n%d %c %d = %d", a, operand, b, total);
            break;
            
            case '-':
                total = a - b;
                System.out.printf("\n%d %c %d = %d", a, operand, b, total);
            break;
            
            case 'x':
                total = a * b;
                System.out.printf("\n%d %c %d = %d", a, operand, b, total);
            break;
            
            case '/':
                total = a / b;
                System.out.printf("\n%d %c %d = %d", a, operand, b, total);
            break;
            
            case '%':
                total = a % b;
                System.out.printf("\n%d %c %d = %d", a, operand, b, total);
            break;
            
            default:
                System.out.println("Invalid operand. Application restarted.");
                main(args);
             
        }
        
        System.out.print("\nRestart(Y/N): ");
        char choice = s.next().charAt(0);
        
        if(choice == 'Y' || choice == 'y')
            main(args);
        else
            System.out.println("Done on 30 Sept 2019, 9.40P.M.");
    }
}
