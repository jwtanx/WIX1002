/*
1. Write statements for each of the following
a. Write a static method compare that return true if two objects parameter (Student s, Teacher t) are belongs to the same class. Otherwise return false.
b. Write a static method isClass that return true if the object parameter (Student s) is belong to any descendent class of Person. Otherwise return false.
*/
package Tutorial.T9;

public class TeacherTesterClass {
    public static void main(String[] args) {
        
        // 1a. Write a static method compare that return true if two objects parameter (Student s, Teacher t) are belongs to the same class. Otherwise return false.
        Teacher t = new Teacher();
        Teacher t1 = new Teacher();
        Student s = new Student();
        System.out.println("Teacher & Student same class? : " + compareClass(s, t));
        System.out.println("Teacher & Teacher1 same class? : " + compareClass(t, t1));
        
        // 1b. Write a static method isClass that return true if the object parameter (Student s) is belong to any descendent class of Person. Otherwise return false.
        System.out.println("Student is class of Person? : " + isClass(s));
        // when Teacher extends Person : True (because Student\\Teacher\\Person)
        // when Student extends Person instead of Teacher : True (because Student\\Person)
        // when Teacher didnt extend Person : False (because Student\\Teacher ONLY)
        
    }
    
    public static boolean compareClass(Object s, Object t){
        
        
        if(s.getClass() == t.getClass()){
            return true;
        }
        
        return false;
    }
    
    public static boolean isClass(Object s){
        
        if(s instanceof Person){
            return true;
        }
        
        return false;
    }
}
