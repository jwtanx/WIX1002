package T8Notes;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Number {

    private int[] num;
    private Random r = new Random();

    public Number() {

        num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(101);
        }

    }
    
    public Number(int size) {

        num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(101);
        }

    }
    
    public Number(int size, int max) {

        num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(max+1);
        }

    }

    public String toString() {

        String str = "";

        for (int i = 0; i < num.length; i++) {
            str = str + num[i] + " ";
        }

        return str;
    }
    
    // no need static here since this is not the main class. Static main can only call static method, cannot call non-static
    // not using class to call the method, so no need static here
    // for eg.
    // a.Number()   <-- calling using object instead of the method 
    
    public String even() {

        String str = "";

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                str = str + num[i] + " ";

            }
        }

        return str;
    }

}
