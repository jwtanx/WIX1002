/*
  * 6. You operate several burger stalls distributed throughout town. Each burger stall has an ID and the number of burger sold for the day. The class consists of a constructor to initialize the instance variables and a sold method that increment the number of burger sold by parameter value. The class also contains a variable and method that tracks the total number of burgers sold in all stalls. Display the total burger sold by each stall and the total number of burgers sold in all stalls.
 */
package Lab8;

import java.util.Random;

public class BurgerStoreTesterClass {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        BurgerStore a = new BurgerStore(String.valueOf((char) (65 + r.nextInt(26))) + String.valueOf(r.nextInt(100)));
        a.sold(r.nextInt(100));
        
        BurgerStore b = new BurgerStore(String.valueOf((char) (65 + r.nextInt(26))) + String.valueOf(r.nextInt(100)));
        b.sold(r.nextInt(100));
        
        BurgerStore c = new BurgerStore(String.valueOf((char) (65 + r.nextInt(26))) + String.valueOf(r.nextInt(100)));
        c.sold(r.nextInt(100));
        
        System.out.println(a.toString() + "\n");
        System.out.println(b.toString() + "\n");
        System.out.println(c.toString() + "\n");
        System.out.println(a.toStringTotalBurgerSold());
        
    }
}
