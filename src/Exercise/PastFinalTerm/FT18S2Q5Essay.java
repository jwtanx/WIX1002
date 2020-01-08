/*
 * 5b. Design an Essay class that inherits the GradedActivity class. The Essay class should determine the grade a student receives for an essay. The student's total essay score can be up to 100 and consists of the following four components: 

    Grammar: 30 marks (maximum) 
    Spelling: 20 marks (maximum) 
    Length: 20 marks (maximum) 
    Content: 30 marks (maximum) 

This class has four numeric fields and a toString method that returns information about the four components.
 */
package Exercise.PastFinalTerm;

public class FT18S2Q5Essay extends FT18S2Q5GradedActivity{
    
    private int grammar, spelling, length, content;
    
    public FT18S2Q5Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        super.setScore(grammar + spelling + length + content);
    }
    
    public String toString() {
        return "\nEssay score:" +
               "\nGrammar: " + grammar + 
               "\nSpelling: " + spelling + 
               "\nLength: " + length + 
               "\nContent: " + content + "\n\n" +
               super.toString();
    }
    
}
