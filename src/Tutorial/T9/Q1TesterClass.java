/*
1. Write statements for each of the following
a. Write a static method compare that return true if two objects parameter (Q1Student s, Q1Teacher t) are belongs to the same class. Otherwise return false.
b. Write a static method isClass that return true if the object parameter (Q1Student s) is belong to any descendent class of Q1Person. Otherwise return false.
*/
package Tutorial.T9;

public class Q1TesterClass {
    public static void main(String[] args) {
        
        // 1a. Write a static method compare that return true if two objects parameter (Q1Student s, Q1Teacher t) are belongs to the same class. Otherwise return false.
        Q1Teacher t = new Q1Teacher();
        Q1Teacher t1 = new Q1Teacher();
        Q1Student s = new Q1Student();
        System.out.println("Teacher & Student same class? : " + compareClass(s, t));
        System.out.println("Teacher & Teacher1 same class? : " + compareClass(t, t1));
        
        // 1b. Write a static method isClass that return true if the object parameter (Q1Student s) is belong to any descendent class of Q1Person. Otherwise return false.
        System.out.println("Student is class of Person? : " + isClass(s));
        // when Q1Teacher extends Q1Person : True (because Q1Student\\Q1Teacher\\Q1Person)
        // when Q1Student extends Q1Person instead of Q1Teacher : True (because Q1Student\\Q1Person)
        // when Q1Teacher didnt extend Q1Person : False (because Q1Student\\Q1Teacher ONLY)
        
    }
    
    public static boolean compareClass(Object s, Object t){
        
        
        if(s.getClass() == t.getClass()){
            return true;
        }
        
        return false;
    }
    
    public static boolean isClass(Object s){
        
        if(s instanceof Q1Person){
            return true;
        }
        
        return false;
    }
}
