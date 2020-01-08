/*
 * 3. Write a program to let a first-grader practise addition. the program randomly generates two single-digit integers, number1 and number2, and displays to the student a question such as "What is 7 + 9 ?", as shown in the sample output below. 7 and 9 are the random numbers generated for number1 and number2. After the student types the answer, the program displays a message to indicate whether it is true or false. Then, the program will ask the student if he wants to try another queestion
 
Sample output:
What is  7 + 9 ? 16 <enter>
7 + 9 = 16 is true
Do you want to try another question (y/n) ? : n
Program ends

What is  7 + 1 ? 9 <enter>
7 + 1 = 9 is false
Do you want to try another question (y/n) ? : y

What is  6 + 6 ? 12 <enter>
6 + 6 = 12 is true
Do you want to try another question (y/n) ? : y

What is  0 + 3 ? 3 <enter>
7 + 9 = 16 is true
Do you want to try another question (y/n) ? : n
Program ends

*/
package Exercise.PastFinalTerm;

import java.util.Random;
import java.util.Scanner;

public class FT19S2Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        Run:
        while(true){
            int number1 = r.nextInt(10);
            int number2 = r.nextInt(10);
            int sum = number1 + number2;
            
            System.out.printf("What is %d + %d ? ", number1 , number2);
            int answer = s.nextInt();
            
            boolean check = (sum == answer);
            
            System.out.printf("%d + %d = %d is %b\n", number1, number2, answer, check);
            
            System.out.print("Do you want to try another question (y/n) ? : ");
            
            while(true){
                char choice = s.next().charAt(0);

                if(choice == 'N' || choice == 'n'){
                    System.out.println("Program ends");
                    break Run;
                } else if (choice == 'Y' || choice == 'y'){
                    System.out.println();
                    break;
                } else {
                    
                }
            }
        }
        
        
    }
}
