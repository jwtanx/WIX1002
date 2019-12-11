package LectureNotes.TU11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        try {
            System.out.print("Enter number: ");
            num = s.nextInt();

//            if (num >= 90) {
//                throw new AngException("You can apply demo");
//            } else if (num >= 50) {
//                throw new AngException();
//            } else if (num < 0) {
//                throw new Exception("Please enter positive integer");
//            }

            System.out.println("The number is " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This code always execute");
        }

        try {
            test(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test(int a) throws AngException {
        if (a >= 90) {
            throw new AngException("You can apply demo");
        } else if (a >= 50) {
            throw new AngException();
        } else {
            throw new AngException("Told you to study already. Haiz...");
        }

    }
}
