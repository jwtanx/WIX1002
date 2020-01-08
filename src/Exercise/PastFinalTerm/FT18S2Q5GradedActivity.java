/*
 * 5a. Design a GradedActivity class that consists of the following members: 
- A field for the numeric score of a graded activity. 
- A method setScore that sets the numeric score. 
- A method getScore that returns the numeric score.
- A method getGrade that returns the letter grade that corresponds to the numeric score. 

Grade   Numeric score 
A       equal to or greater than 90 
B       equal to or greater than 80 
C       equal to or greater than 70 
D       equal to or greater than 60 
F       less than 60 

- A method toString that retums information about the numeric score and grade.
 */
package Exercise.PastFinalTerm;

public class FT18S2Q5GradedActivity {
    
    private int score;
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public char getGrade(){

        if(score >= 90 && score <= 100){
            return 'A';
        } else if(score >= 80 && score < 90){
            return 'B';
        } else if(score >= 70 && score < 80){
            return 'C';
        } else if(score >= 60 && score < 70){
            return 'D';
        } else if(score >= 0 && score < 60){
            return 'F';
        } else {
            return 0;
        }
    }
    
    public String toString() {
        return "Score: " + score + 
               "\nEssay Grade: " + getGrade();
    }
    
}
