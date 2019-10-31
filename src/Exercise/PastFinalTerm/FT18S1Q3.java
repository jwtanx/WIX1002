/*
 * 3. Write a program that is used to display number 8 in digital. The program should request the user to enter the font size, font type and format. Then, create a method that accepts the inputs as arguments and display the number based on the font size, font type and format. 

Sample:
Enter font size: 1
Enter font type: *
Enter format [1 - Vertical, 2 - Horizontal]: 1
***             // size + 2
* *             // space = size
***
* *
***

Enter font size: 3
Enter font type: A
Enter format [1 - Vertical, 2 - Horizontal]: 1
AAAAA           // size + 2
A   A           // space = size
A   A           // height = 3 + (font*2)
A   A           
AAAAA           // middle = font + 1
A   A
A   A
A   A
AAAAA           // last = middle*2

Enter font size: 1
Enter font type: *
Enter format [1 - Vertical, 2 - Horizontal]: 2
*****           // (size * 2) + 3
* * *           // space = size
*****

Enter font size: 4
Enter font type: &
Enter format [1 - Vertical, 2 - Horizontal]: 2
&&&&&&&&&&&     //(size * 2) + 3
&    &    &     // space = size
&    &    &
&    &    &
&    &    &
&&&&&&&&&&&


 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FT18S1Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter font size: ");
        int font = s.nextInt();
        
        System.out.print("Enter font type: ");
        char type = s.next().charAt(0);
        
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int choice = s.nextInt();
        int row, middle, last;
        
        switch(choice){
            
            // Vertical
            case 1:
                
                for(int a = 0; a < 2; a++){
                    
                    for(int i = 0; i < font + 2; i++) System.out.print(type);
                    System.out.println();
                    
                    for(int i = 0; i < font; i++){
                        System.out.print(type);

                        for(int j = 0; j < font; j++){
                            System.out.print(" ");
                        }

                        System.out.println(type);
                    }
                    
                }
                for(int i = 0; i < font + 2; i++) System.out.print(type);
                
                break;
            
            // Horizontal
            case 2:
                
                for(int i = 0; i < (font*2) + 3; i++) System.out.print(type);
                
                System.out.println();
                
                for(int j = 0; j < font; j++){
                    System.out.print(type);
                    for(int space = 0; space < font; space++) System.out.print(" ");
                    System.out.print(type);
                    for(int space = 0; space < font; space++) System.out.print(" ");
                    System.out.print(type);
                    
                    System.out.println();
                }
                
                for(int i = 0; i < (font*2) + 3; i++) System.out.print(type);
                
                break;
                
            default:
                System.out.println("Invalid choice");
            
        }

        System.out.println("\n\nDone @ 011119, 00:59");
    }
}


/* STILL LOOKING FOR ANSWER - for vertical
row = (font*2) + 3;
middle = 1 + font + 1;
last = 2 + (2*font);

for(int i = 0; i < row; i++){

    if(i == 0 || i == middle || i == last){
        for(int c = 0; c < font + 2; c++) System.out.print(type);
        System.out.println();
    }

    else{
        for(int r = 0; r < font; r++){

            System.out.print(type);
            for(int space = 0; space < font; space++) System.out.print(" ");
            System.out.println(type);

        }
    }
}
*/