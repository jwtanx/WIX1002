/*
 * 5. An activity completed by students will graded. A gradded activity can be given a numeric score such as 70, 95 and so on, and a letter grade such as A, B, C, D or F

a. Design a GradedActivity class that consists of the following members: - A field for the numeric score of a graded activity. 
- A method setScore that sets the numeric score. 
- A method getScore that retums the numeric score.
- A method getGrade that retums the letter grade that coresponds to the numeric score. 

Grade   Numeric score 
A       equal to or greater than 90 
B       equal to or greater than 80 
C       equal to or greater than 70 
D       equal to or greater than 60 
F       less than 60 

- A method toString that retums information about the numeric score and grade.

b. Design an Essay class that inherits the GradedActivity class. The Essay class should determine the grade a student receives for an essay. The student's total essay score can be up to 100 and consists of the following four components: 
    Grammar: 30 marks (maximum) 
    Spelling: 20 marks (maximum) 
    Length: 20 marks (maximum) 
    Content: 30 marks (maximum) 

This class has four numeric fields and a toString method that returns information about the four components.

c. Create a Q5Main class to test the program. It asks the user to enter the marks for the four essay components, creates an Essay object and displays information about the essay. 

Sample output: 
Enter the marks for Grammar (maximum 30 marks): 25 <enter> 
Enter the marks for Spelling (maximum 20 marks): 10 <enter>
Enter the marks for Length (maximum 20 marks) 20 <enter> 
Enter the marks for Content (maximum 30 marks): 10 center> 

Essay score:
Grammar: 25 
Spelling: 10 
Length: 20 
Content: 10

Total score: 65 
Essay grade: D

 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT18S2Q5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = s.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = s.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = s.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = s.nextInt();
        
        FT18S2Q5Essay a = new FT18S2Q5Essay(grammar, spelling, length, content);
        System.out.println(a.toString());
        
    }
}



