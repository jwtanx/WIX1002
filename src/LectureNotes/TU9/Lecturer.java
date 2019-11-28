
package LectureNotes.TU9;

public class Lecturer {
    
    protected String examTopic; // <-- put protected in order for student (child class) to use
    private String grade;
    
    public Lecturer(){
        examTopic = "Question 5 OOP";
        grade = "";
    }
    
    public Lecturer(String examTopic, String grade){
        this.examTopic = examTopic;
        this.grade = grade;            
    }

    public String getExamTopic() {
        return examTopic;
    }

    public String getGrade() {
        return grade;
    }

    public void setExamTopic(String examTopic) {
        this.examTopic = examTopic;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

//    @Override
    public String toString() {
        return "Exam topic from Lecturer " + "examTopic = " + examTopic + "\n" +
                "Student grade = " + grade;
    }
    
    public void checkResult(String matric){
        
        if(matric.equals("WIC111")){
            grade = "A";
        } else if(matric.equals("WIC222")){
            grade = "B";
        } else if(matric.equals("WIC333")){
            grade = "C";
        }
        
    }
    
    
}
