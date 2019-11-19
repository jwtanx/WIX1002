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
public class Cat {

    private String name;
    
    // Static variable with all objects: share a number
    private static int number;

    public Cat(String name) {
        this.name = name;
        number++;
    }
    
    public Cat(Cat kucing){
        this.name = kucing.getName();
        number++;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "Name of the Cat : " + name;
    }

    public static int getNumber(){
        return number;
    }
}
