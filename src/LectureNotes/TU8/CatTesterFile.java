package LectureNotes.TU8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CatTesterFile {
    
    public static void main(String[] args) {
        
        Cat a = new Cat("Tom");
        System.out.println(a.toString());
        System.out.println("The number is " + a.getNumber());
        
        Cat b = a;
        System.out.println(b.toString());
        System.out.println("The number is " + b.getNumber()); // output 1 because it doesnt go to the contructor
        
        Cat c = new Cat(a);
        System.out.println(c.toString());
        System.out.println("The number is " + c.getNumber()); // // output 2 because static variable is shared by all objects
        
    }
    
}
