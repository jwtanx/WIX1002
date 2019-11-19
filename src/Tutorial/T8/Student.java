/*
 * 1. Write statements for each of the following

a. Define a class Student.
b. Declare the instance variable that used to store contact number.
c. Create the constructor that initializes the contact number to null.
d. Create another constructor that assign the parameter value to the contact number. 
e. Create an accessor and mutator method for the contact number.
f. Create a method that used to display the contact number.
g. Create an object of the class Student.
h. Change the contact number using the mutator method.
i. Create an object of the class Animal.
j. Create an object of the class Animal that used to represent a cat. 
k. Create an object of the class Number with the value 20 and 40.
 */
package Tutorial.T8;

// 1a. Define a class Student.
public class Student {

    // 1b. Declare the instance variable that used to store contact number.
    private String contactNumber;

    // c. Create the constructor that initializes the contact number to null.
    public Student() {
        contactNumber = null;
    }

    // 1d. Create another constructor that assign the parameter value to the contact number.     
    public Student(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // 1e. Create an accessor and mutator method for the contact number.
    // Accessor
    public String getContactNumber() {
        return contactNumber;
    }

    // Mutator
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // 1f. Create a method that used to display the contact number.
    public String toString() {
        return "Contact number : " + contactNumber;
    }

}
