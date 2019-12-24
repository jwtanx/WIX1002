/*
 * 5b) Design an Essay class that inherits the GradedActivity class. The Essay class should determine the grade a student receives for an essay. The student's essay score can be up to 100 and consists of the following four components:

- Grammer: 30 marks (maximum)
- Spelling: 20 marks (maximum)
- Length: 20 marks (maximum)
- Content: 30 marks (maximum)

This class has four numeric fields and a toString method that returns information about the four components.
 */
package Exercise.PastFinalTerm;

public class FT17S1Q5Essay extends FT17S1Q5GradedActivity{
    
    private int grammar, spelling, length, content;

    public FT17S1Q5Essay() {
        grammar = 0;
        spelling = 0;
        length = 0;
        content = 0;
    }

    public void setGrammar(int grammar) {
        this.grammar = grammar;
    }

    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getGrammar() {
        return grammar;
    }

    public int getSpelling() {
        return spelling;
    }

    public int getLength() {
        return length;
    }

    public int getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Essay score:" + 
               "\nGrammar: " + grammar + 
               "\nSpelling: " + spelling +
               "\nLength: " + length +
               "\nContent: " + content;
    }
}
