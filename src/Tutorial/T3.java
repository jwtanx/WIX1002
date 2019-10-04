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

public class T3{

	Scanner s = new Scanner(System.in);

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);

		System.out.println("\nEnter a question 1 - 5");

		int choice = s.nextInt();

	System.out.println("=====================================================");

	switch(choice){
		case 1:
		/*
		1. Write statements for each of the following
			a. Determine whether 3x8=27.
			b. Determine whether an input integer is an odd number or even number.
			c. Determine whether a character is a capital letter.
			d. Display two strings in alphabetical order ignoring their case.
			e. A switch statement that display Sunday, Monday, .., Satudary if the input is 0, 1, …, 6.
		*/

			System.out.println("\nQUESTION 1:");

		// 1a
			Boolean a = 3 * 8 == 27;
			System.out.println("3 * 8 = 27 is " + a);
			
			System.out.println("");


		// 1b
			int b1 = 12;
			int b2 = 51;

			System.out.printf("Enter a number to determine odd / even: %d\n", b1);
			if(b1 % 2 == 0)
				System.out.println("EVEN!");
			else
				System.out.println("ODD!");


			System.out.printf("Enter a number to determine odd / even: %d\n", b2);
			if(b2 % 2 == 0)
				System.out.println("EVEN!");
			else
				System.out.println("ODD!");

			System.out.println("");


		// 1c
                        System.out.println("Enter a character: ");
                        char cc = s.next().charAt(0);
                        
                        boolean check = Character.isUpperCase(cc);
                        
                        if(check)System.out.printf("%c is a capital letter.\n", cc);
                        else System.out.printf("%c is a small letter.\n", cc);
                        
                    // OLD VERSION
                        String c = "a";
			System.out.println("Enter any letter either cap / small letter");
			String c1 = "HelloWorld";
			//char cap1 = c1.charAt(0);

			if(c1.compareTo(c) >= 0)
				System.out.printf("%s is a small letter.\n", c1);
			else
				System.out.printf("%s is a capital letter.\n", c1);

			System.out.println(c1 + " is a capital  letter: " + Character.isUpperCase(c1.charAt(0)));

			/* EXAMPLE OF WRONG : Character.isUpperCase(STRING HERE NOT CHAR, c[0] is char)
			String[] c2 = "boy Is Reading".split("");

			if(c2[0].compareTo(c) >= 0)
				System.out.printf("%s is a smaller letter.\n", c2);
			else
				System.out.printf("%s is a capital letter.\n", c2);

			System.out.println(c2 + " is a small letter: " + Character.isLowerCase(c2[0]));
			*/

			System.out.println("");


		// 1d
			String d1 = "zopple";
			String d2 = "zapple";

			if(d1.compareToIgnoreCase(d2) < 0)
				System.out.printf("%s comes first then %s\n", d1, d2);
			else
				System.out.printf("%s comes first then %s\n", d2, d1);

			System.out.println("");


		// 1e
			System.out.println("Enter 0 - 6:\nExample\n0 : Sunday\n1 : Monday\n6 : Saturday\n");
			int e = 5;

			switch(e){
				case 0:
					System.out.printf("%d is Sunday\n", e);
				break;

				case 1:
					System.out.printf("%d is Monday\n", e);
				break;

				case 2:
					System.out.printf("%d is Tuesday\n", e);
				break;

				case 3:
					System.out.printf("%d is Wednesday\n", e);
				break;

				case 4:
					System.out.printf("%d is Thursday\n", e);
				break;

				case 5:
					System.out.printf("%d is Friday\n", e);
				break;

				case 6:
					System.out.printf("%d is Saturday\n", e);
				break;

				default:
					System.out.printf("%d is Holiday\n!", e);

			}

		break;

		case 2:
			
		System.out.println("\nQUESTION 2:");
		// 2. Correct the error for the following statements.
		// 2a
			int num1 = 0;
			int num2 = 0;

			if(num1 == num2)
				System.out.println("Number 1 is equal to number 2.");

			System.out.println("");

		// 2b
			int x = 50;
			int y = 25;
			int z = 2;
			
			if (x > y && x > z)
 				System.out.println("x is the largest number");
			
 			System.out.println("");

		// 2c
			String s1, s2;

			s1 = "Hello";
			s2 = "Hellos";

			if (s1.equals(s2))
 				System.out.println("They are equal strings.");
			else
 				System.out.println("They are not equal strings.");
		
			System.out.println("");


		// 2d

			x = 1;
			y = -1;

			if (x > 0 || y > 0)
 				System.out.println("Either x or y is positive");

 		break;
			
		case 3:

		System.out.println("\nQUESTION 3");
		// 3. Write the output for the following statements when x=9 and y=10
		
		System.out.println("3a");
		// OUTPUT:
		//		#####
		//		$$$$$
			
			x = 9;
			y = 10;

			if (x < 10)
			if (y > 10)
				System.out.println("*****");
			else
				System.out.println("#####");
				System.out.println("$$$$$");

		System.out.println("");


		System.out.println("3b");
		// OUTPUT:
		// 		#####
		//		$$$$$
				
			if (x < 10){
				if (y < 10)
					System.out.println("*****");
				else{
					System.out.println("#####");
					System.out.println("$$$$$");
				}
			}

		System.out.println("");


		System.out.println("3c");
		// OUTPUT:
		//		#####

			if (x < 10) {
				
				if (y < 10)
					System.out.println("*****");

				System.out.println("#####");
			}
			else{
				System.out.println("$$$$$");
			}

		System.out.println("");


		System.out.println("3d");
		// OUTPUT:
		//		[NO OUTPUT]
			if (x > 10) {
			if (y > 10) {
			System.out.println("*****");
			System.out.println("#####"); }
			else
			System.out.println("$$$$$");
			}
			//ADD-ON
			else
				System.out.println("[NO OUTPUT]");

		break;

		case 4:
		System.out.println("\nQUESTION 4");
		// 4. Write the java statements that used the if statement to find the biggest number among three given integers.

			System.out.println("Enter num1: ");
			num1 = s.nextInt();

			System.out.println("Enter num2: ");
			num2 = s.nextInt();

			System.out.println("Enter num3: ");
			int num3 = s.nextInt();

			if(num1 > num2 && num1 > num3)
				System.out.println("num1 is the largest");
			else if(num2 > num1 && num2 > num3)
				System.out.println("num2 is the largest");
			else
				System.out.println("num3 is the largest");

		break;

		case 5:
		System.out.println("\nQUESTION 5");
		// 5. Write the java statements that determine whether the Leap year. A Leap year is divisible by 4 but not by 100. However, a Leap year is also divisible by 400.
		
			System.out.print("Enter a year to check if it is leap year: ");

			int year = s.nextInt();
                        /* OLD VERSION
			if(year % 4 == 0){
				// System.out.println("It might be a leap year");
					

					if(year % 100 == 0 && year % 400 != 0){
						System.out.println("It is not a leap year");
					}
					else if(year % 400 == 0){
						System.out.println("It is a leap year");
					}
					else if(year % 100 != 0){
						System.out.println("It is a leap year");
					}
			}
                        */
                        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                            System.out.println("It is a leap year.");
                        }else
                            System.out.println("It is not a leap year.");

		break;

		default:
		// RESTART
			System.out.println("\nEnter 1 to restart, else done");

			if(s.nextInt() == 1)
				main(args);
			else
				System.out.println("Done");

		}

		// RESTART
		System.out.println("\nEnter 1 to restart, else done");

			if(s.nextInt() == 1)
				main(args);
			else
				System.out.println("Done");

	}
}