/*
 * 5. Design a Staff class that consists of the following members: 
- A field for the name of the staff. 
- A field for the IC of the staff. 
- A constructor that contains all the above fields
- A toString method that displays the staff's name and IC. 

Design a PermanentStaff class that extends the Staff class. The PermanentStaff class has the following members: 
- A field for the grade of the staff. 
- A constructor vith arguments, 
- A getSalary method that computes salary based on the table below. 
- A toString method that displays the staff's grade and salary.

Grade   Salary (RM) 
EM01    7000
EM02    5000 
EM03    3000 
EM04    1000

Salary Table

Design a class PartTimeStaff that extends the Staff class. The PartTimeStaff class has the following members: 
- A field for the number of working hours (integer type). 
- A constructor with arguments, 
- A getSalary method that computes salary based on RM40 per hour. 
- A toString method that displays the staff's working hours and salary,

Write a tester class Main using the code below. 
public static void main(String] args) { 
    PermanentStaff p1 = new PermanentStaff("Abdul Razak", "871001-14-1765", "EM02" ); 
    PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "911223-08-3301", 35); 
    System.out.println(p1.toString()); 
    System.out.println(p2.toString()); 
}

Sample output
Full Name: Abdul Razak
IC: 871001-14-1765
Grade: EM02
Salary: RM 5000

Full Name: Tengku Ali
IC: 911223-08-3301
Number of working hours: 35
Salary: RM 1400
*/
package Exercise.PastFinalTerm;

public class FT17S2Q5 {
    public static void main(String[] args) {
    
        FT17S2Q5PermanentStaff p1 = new FT17S2Q5PermanentStaff("Abdul Razak", "871001-14-1765", "EM02" ); 
        FT17S2Q5PartTimeStaff p2 = new FT17S2Q5PartTimeStaff("Tengku Ali", "911223-08-3301", 35); 
        System.out.println(p1.toString()); 
        System.out.println(p2.toString()); 
        
    }
}
