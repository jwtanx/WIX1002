/*
3. Create a class Person that implements the comparable interface. The class has an instance variable name. The class has the constructor that initializes the name. The class also has the accessor method and a display method to display the name. Create an array for multiple Person objects. Sort the person in ascending order. Create a Tester class to test the program.
 */
package Tutorial.T10;

public class Q3TesterClass {
    public static void main(String[] args) {
        
        Q3Person a[] = new Q3Person[6];
        
        a[0] = new Q3Person("Bala");
        a[1] = new Q3Person("Ali");
        a[2] = new Q3Person("Chee Meng");
        a[3] = new Q3Person("Muthu");
        a[4] = new Q3Person("David");
        a[5] = new Q3Person("Jason");
        
        String[] finalName = a[1].compare((Q3Person[]) a);
        
        for(int i = 0; i < finalName.length; i++){
            System.out.println(finalName[i]);
        }
        
    }
    
}
