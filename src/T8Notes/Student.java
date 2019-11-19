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
public class Student {
    
    // Instance variables in private!!
    // Instance variable cannot be public, else everything wrong.
    private String fullName, matricNumber, email, city;
    private double height;
    private int age;
    // can be without private, but final give zero marks
    
    // Constructor = object creation, without constructor cannot create a class.
    // public className(){ }
    public Student(){
        
        // What is the default value? Here we have an empty constructor, everything set to the default value.
        fullName = "";
        matricNumber = "";
        email = "";
        city = "";
        height = 0.0;
        age = 0;
        
    }

    // Constructor with arguments
    // 1. Alt + Ins
    // 2. Contructor
    // 3. Select all
    // 4. Generate
    
    public Student(String fullName, String matricNumber, String email, String city, double height, int age) {
        this.fullName = fullName;
        this.matricNumber = matricNumber;
        this.email = email;
        this.city = city;
        this.height = height;
        this.age = age;
    }
    
    // Three common methods can be create by netBeans: accessor (Get value of instance variable)
    // 1. right click
    // 2. Insert code or Alt + Ins
    // 3. Getter
    // 4. Select all
    // 5. Generate
    
    public String getFullName() {
        return fullName;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    // Three common methods can be create by netBeans: mutator (Set value of instance variable)
    // 1. right click
    // 2. Insert code or Alt + Ins
    // 3. Setter
    // 4. Select all
    // 5. Generate

    
    public void setFullName(String fullName) {
        // "this" means this class. "this.fullName" is your class instance variable. THIS METHOD IS TO DIFFERENTIATE THE fullName and the instance fullName.
        // if fullName only, its from this method, so no change.
        this.fullName = fullName; 
    }
    
    /*
    If dont want the this.fullName
    public void setFullName(String a){
        fullName = a;
    }
    
    */
    
    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Remove override or not also can
    // Three common methods can be create by netBeans: toString (Display value of instance variable but in return in String Format only)
    // 1. right click
    // 2. Insert code or Alt + Ins
    // 3. toString()
    // 4. Select all
    // 5. Generate
    
    //@Override
    public String toString() {
        return "Full Name : " + fullName + "\n" + 
               "Matric Number : " + matricNumber + "\n" +
               "Email : " + email + "\n" +
               "City : " + city + "\n" +
               "Height : " + height + "\n" +
               "Age : " + age;
                
    }
    
    
    
}
