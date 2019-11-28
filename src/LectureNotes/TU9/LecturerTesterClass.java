
package LectureNotes.TU9;

public class LecturerTesterClass {
    
    public static void main(String[] args) {
        Student a = new Student("WIC111", "Ang");
        
        // use parent method
        System.out.println(a.toString() + "\n");    // parent.toString() can be used because it is inherited. "a" can use the parent method.
       
        // use parent protected variable
        System.out.println("Exam topic = " + a.getExamTopic() + "\n");
        
        a.checkResult("WIC111");
        System.out.println(a.toString() + "\n");
        
        // when child also has the same method with parent, it will call the child method only
        System.out.println(a.toString() + "\n");
        
        
        
    }
}
