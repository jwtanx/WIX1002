package T8Notes;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentTesterClass {
    
    public static void main(String[] args) {
        
        // Constructor
//        Student a = new Student();
        
        // Display the student profile
//        a.setFullName("Ali");
//        a.setMatricNumber("WID190001");
//        a.setCity("Ipoh");
//        a.setEmail("ali@yahoo.com");
//        a.setHeight(1.78);
//        a.setAge(19);
//        
//        System.out.println(a.toString() + "\n");
//        
//        // If just want to know the city
//        System.out.println("Student Ali from: " + a.getCity() + "\n");
//        
//        /*
//        Cannot a.city() because it is private. Instance variable cannot be public, else everything wrong.
//        System.out.println("Student Ali from: " + a.city());
//        */
//        
//        Student b = new Student("Siti", "WID190002", "siti@gmail.com", "Petaling Jaya", 1.68, 19);
//        System.out.println(b.toString() + "\n");
        
        
        // Use Array of object to create n object
        int numOfRecord = 0;
        try{
            Scanner s = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/record.txt"));
            
            while(s.hasNextLine()){
                for(int i = 0; i < 6; i++){
                    s.nextLine();
                }
                numOfRecord++;
            }
            
            s.close();
            
            Student[] c = new Student[numOfRecord];
            s = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX1002/record.txt"));
            
            for(int i = 0; i < c.length; i++){
                c[i] = new Student(s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), Double.parseDouble(s.nextLine()), Integer.parseInt(s.nextLine()));
            }
            
            for(int i = 0; i < c.length; i++){
                System.out.println(c[i].toString());
            }
            
            s.close();
            System.out.println("The number of record : " + numOfRecord);
            
        } catch(FileNotFoundException fnf){
            System.err.println("File not found!");
        }
        
    }
    // Done
}
