/*
1i. Create an object of the class Animal.
1j. Create an object of the class Animal that used to represent a cat.
 */
package Tutorial.T8;

public class AnimalTesterClass {
    public static void main(String[] args) {
        
        // 1i. Create an object of the class Animal.
        Animal bird = new Animal("Twitties");
        System.out.println(bird.toString());
        
        // 1j. Create an object of the class Animal that used to represent a cat.
        Animal cat = new Animal();
        cat.setName("Tom");
        System.out.println(cat.toString());
        
        System.out.println("\nDone @ 191119, 20:16");
        
    }
}
