package T8Notes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NumberTesterClass {
    public static void main(String[] args) {
        
        Number a = new Number();
        System.out.println(a.toString());
        System.out.println("Even: " + a.even() + "\n");
        
        Number b = new Number(5);
        System.out.println(b.toString());
        System.out.println("Even: " + b.even() + "\n");
        
        Number c = new Number(4, 50);
        System.out.println(c.toString());
        System.out.println("Even: " + c.even() + "\n");
        
        
        
    }
}
