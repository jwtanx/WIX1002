/*
3. Create a class Person that implements the comparable interface. The class has an instance variable name. The class has the constructor that initializes the name. The class also has the accessor method and a display method to display the name. Create an array for multiple Person objects. Sort the person in ascending order. Create a Tester class to test the program.
 */
package Tutorial.T10;

public class Q3Person implements Q3Comparable{
    
    protected String name;

    public Q3Person(String name) {
        this.name = name;
    }
    
    public String[] compare(Q3Person obj[]){
        String name[] = new String[obj.length];
        String temp;
        
        for(int i = 0; i < obj.length; i++){
            name[i] = obj[i].getName();
        }
        
        for(int i = 0; i < obj.length; i++){
            for(int j = 1; j <obj.length; j++){
                if(name[j-1].compareTo(name[j])>0)
                {
                    temp = name[j-1];
                    name[j-1] = name[j];
                    name[j] = temp;
                }
            }
        }
        
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name;
    }

    @Override
    public String[] compare(Object[] obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
