/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial;

/**
 *
 * @author User
 */
import java.util.*;

public class T2{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		/*
		1. Display the sentence Faculty of Computer Science and Information Technology.
		a. In one line using multiple Java statements
		b. In multiple lines using one Java statement
		*/

		System.out.println("\nQuestion 1");
		System.out.print("Faculty ");
		System.out.print("of ");
		System.out.print("Computer ");
		System.out.print("Science ");
		System.out.print("and ");
		System.out.print("Information ");
		System.out.println("Technology.");

		System.out.println("Faculty\nof\nComputer\nScience\nand\nInformation\nTechnology.");

		/*
		2. Write a Java statement that print "SDN" - Software-defined networking
		*/

		System.out.println("\nQuestion 2");
		System.out.println("\"SDN\" - Software-defined networking");


		/*
		3. Correct the error for the following statements.
		a. System.Println("Java Programming");
		b. System.in.println("Introduction to Java!")
		c. System.out.println("\t is the horizontal tab character");
		d. system.out.println("Java is case sensitive!" );
		*/

		System.out.println("\nQuestion 3");
		System.out.println("Java Programming");
		System.out.println("Introduction to Java!");
		System.out.println("\\t is the horizontal tab character");
		System.out.println("Java is case sensitive!");

		/*
		4. Write statements for each of the following
		a. Declare a variable that used to store the value of a matric number.
		b. Declare a variable that used to store the value of π.
		c. Initialize a variable named M with the value set to false.
		d. Initialize a variable named P with the value set to 8800000000.
		e. Initialize a variable named letter with the value set to U.
		f. Declare a constant variable named PRO. The value of the constant variable is Java.
		*/

		System.out.println("\nQuestion 4");
		String matricNumber = "WID190506";
		System.out.println(matricNumber);

		double π = 3.141592654;
		System.out.println(π);

		boolean M =  false;
		System.out.println(M);

		long P = 8800000000L;
		System.out.println(P);

		char letter = 'U';
		System.out.println(letter);

		final String PRO = "Java";
		System.out.println(PRO);

		/*
		5. Correct the error for the following statements.
		
		a.
		final double AMOUNT = "32.5";
		AMOUNT += 10;
		System.out.println("The amount is " + AMOUNT);
		b.
		string chapter = 'Summary';
		System.out.println(chapter);
		c.
		int num;
		++num++;
		num1 = num;
		d.
		int num = 3000;
		System.out.printf("%4.2f\n", num);
		e.
		String contact;
		Scanner keyboard = new Scanner(System.out);
		contact = keyboard.nextLine();
		*/

		System.out.println("\nQuestion 5");

		double AMOUNT = 32.5;
		AMOUNT += 10;
		System.out.println("The amount is " + AMOUNT);

		String chapter = "Summary";
		System.out.println(chapter);

		int num = 1;
		++num;
		int num1 = num;
		System.out.println(num1);

		double num2 = 3000;
		System.out.printf("%4.2f\n", num2);

		String contact;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("String contract: ");
		contact = keyboard.nextLine();
		System.out.println(contact);


		/*
		6. Write a java program that print the circumference of a circle. The input of the
		program is diameter. Display the result in three decimal places. (Note π = Math.PI)
		*/

		System.out.println("\nQuestion 6");

		double circumference, diameter;
		System.out.println("Enter diameter: ");
		diameter = s.nextDouble();
		circumference = 2 * Math.PI * (diameter/2);

		double area = Math.PI * Math.pow(diameter/2, 2);
		System.out.printf("The circumference of the circle is : %.3fm\n", circumference);
		System.out.printf("The area of the circle is : %.3fm^2\n", area);

		/*
		7. Write a java program that converts inches to meters. (Given 1 inch equals to 2.54
		centimeters). Print the output in two decimal places.
		*/

		System.out.println("\nQuestion 7");
		System.out.println("Enter value in inch: ");
		double inches = s.nextDouble();
		double inchToMeter = inches / (100 / 2.54);

		System.out.printf("%.2f inches = %.2f meters\n", inches, inchToMeter);

	}
}
