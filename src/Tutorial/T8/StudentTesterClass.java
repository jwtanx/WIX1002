/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial.T8;

/**
 *
 * @author User
 */
public class StudentTesterClass {
    public static void main(String[] args) {
        
        // 1g. Create an object of the class Student.
        Student a = new Student("012-3456789");
        System.out.println(a.toString());
        
        // 1h. Change the contact number using the mutator method.
        System.out.println("Change the contact number...");
        a.setContactNumber("013-9990000");
        System.out.println(a.toString());
        
        System.out.println("\nDone @ 191119, 19:40");
    }
}
