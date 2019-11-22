/*
 * 2. Write a Java method multiPrint(int n, char c) that prints n copies of character c. Then, write a Java program to use the method to display a circle or rectangle. For circle, the program will ask for one input, r which is the radius of the circle. For rectangle, the program will ask for two input, w and h which are the width and height of the rectangle.  
Sample Input: Circle or rectangle? circle Please input circle radius: 5  
Sample Output
     ******      <-- (5*2)
    ********                <-- h + 2
   **********
   **********
   **********
    ********
     ******
 */
package Viva.Method;

import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Circle or rectangle? ");
        String choice = s.nextLine();

        if (choice.equalsIgnoreCase("rectangle") || choice.contains("r")) {
            System.out.print("Enter width: ");
            int width = s.nextInt();
            System.out.print("Enter height: ");
            int height = s.nextInt();

            printRectangle(width, height);
        } else if (choice.equalsIgnoreCase("circle") || choice.contains("c")) {
            System.out.print("Please input circle radius: ");
            int r = s.nextInt();

            printCircle(r);

        }

    }

    public static void multiPrint(int n, char c) {

        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }

    }

    public static void printRectangle(int w, int h) {

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                multiPrint(1, '*');
            }
            System.out.println();
        }

    }

    public static void printCircle(int r) {

        int d = r * 2;
        int space = 2;
        for (int i = d - 4; i <= d; i = i + 2) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            multiPrint(i, '*');
            System.out.println();
            space--;
        }
        multiPrint(d, '*');
        System.out.println();
        int space1 = 0;
        for (int i = d; i >= d - 4; i = i - 2) {

            for (int j = 0; j < space1; j++) {
                System.out.print(" ");
            }
            space1++;
            multiPrint(i, '*');
            System.out.println();

        }

    }

}
