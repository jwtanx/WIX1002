/*
 * 5a) Design a GradedActivity class that consists of the following members:
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
 */
package Exercise.PastFinalTerm;

public class FT17S1Q5GradedActivity {
    
    private int score;
    private char grade;
    
    public FT17S1Q5GradedActivity(){
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade() {
        
        if(score >= 90){
            grade = 'A';
        } else if (score >= 80 && score < 90){
            grade = 'B';
        } else if (score >= 70 && score < 80){
            grade = 'C';
        } else if (score >= 60 && score < 70){
            grade = 'D';
        } else if (score < 60){
            grade = 'F';
        }
        
    }

    @Override
    public String toString() {
        return "Total score: " + score +
               "\nEssay grade: " + grade;
    }
    
    
    
    
}
