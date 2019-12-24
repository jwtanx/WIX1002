/*
 * 5. An activity completed by students will be graded. A graded acitivity can be given a numeric score such as 70, 95 and so on, and a letter grade such as A, B, C, D or F.

a) Design a GradedActivity class that consists of the following members:
- A field for the numeric score of a graded activity.
- a method setScore that sets the numeric score
- A method getScore that returns the numeric score.
- A method getGrade that returns the letter geade that corresponds to the numeric score.

Grade   Numeric score
A       >= 90
B       >= 80
C       >= 70
D       >= 60
F       < 60

- A method toString that returns information about the numeric score and grade.

b) Design an Essay class that inherits the GradedActivity class. The Essay class should determine the grade a student receives for an essay. The student's essay score can be up to 100 and consists of the following four components:

- Grammer: 30 marks (maximum)
- Spelling: 20 marks (maximum)
- Length: 20 marks (maximum)
- Content: 30 marks (maximum)

This class has four numeric fields and a toString method that returns information about the four components.

c) Create a Q5Main class to test the program. It asks the user to enter the marks for the four essay componenets, creates an Essay object and displays information about the essay.

Sample output:
Enter the marks for Grammar (maximum 30 marks): 25 <enter>
Enter the marks for Spelling (maximum 20 marks): 10 <enter>
Enter the marks for Length (maximum 20 marks): 20 <enter>
Enter the marks for Content (maximum 30 marks): 10 <enter>

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

public class FT17S1Q5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        FT17S1Q5GradedActivity pa = new FT17S1Q5GradedActivity();
        FT17S1Q5Essay ch = new FT17S1Q5Essay();
        
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        ch.setGrammar(s.nextInt());
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        ch.setSpelling(s.nextInt());
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        ch.setLength(s.nextInt());
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        ch.setContent(s.nextInt());
        
        System.out.println("\n" + ch.toString());
        
        pa.setScore(ch.getGrammar() + ch.getSpelling() + ch.getLength() + ch.getContent());
        pa.setGrade();
        
        System.out.println("\n" + pa.toString());
    }
    
    
}
