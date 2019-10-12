/*
 * Write a program that ask user to enter the year and the first day of the year 
(0 for Sunday, 1 for Monday, … , 6 for Saturday).
Display the calendar for May and August.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L4Q4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int century = 0, YY;
        int year = s.nextInt();
        s.nextLine();
        
        if(year >= 0 && year < 1000) century = (year / 10) * 10;
        else if(year >= 1000 && year < 10000) century = (year / 100) *100;
        else{
            System.out.println("Invalid year. System restarted.");
            main(args);
        }
        YY = year - century;
        int dayCode, doomsDayByCentury;
        
        System.out.print("Enter the first day of the year(0 for Sunday, 1 for Monday, ... , 6 for Saturday) or"
                + " (Sun, Mon, ... , Sat) or (Sunday, Monday, ... , Saturday): ");
        String day = s.nextLine();
        
        if(day.toLowerCase().contains("su") || day.contains("0")){
            System.out.println("Sunday");
            dayCode = 0;
        }
        else if(day.toLowerCase().contains("mo") || day.contains("1")){
            System.out.println("Monday");
            dayCode = 1;
        }
        else if(day.toLowerCase().contains("tu") || day.contains("2")){
            System.out.println("Tuesday");
            dayCode = 2;
        }
        else if(day.toLowerCase().contains("we") || day.contains("3")){
            System.out.println("Wednesday");
            dayCode = 3;
        }
        else if(day.toLowerCase().contains("th") || day.contains("4")){
            System.out.println("Thursday");
            dayCode = 4;
        }
        else if(day.toLowerCase().contains("fr") || day.contains("5")){
            System.out.println("Friday");
            dayCode = 5;
        }
        else if(day.toLowerCase().contains("sa") || day.contains("6")){
            System.out.println("Saturday");
            dayCode = 6;
        }else{
            System.out.println("System restarted");
            main(args);
        }
        
        if(findCenturyCode(0, century, 2, 0) == 0) System.out.println("Sunday");
        else if(findCenturyCode(0, century, 2, 0) == 2) System.out.println("Tuesday");
        else if(findCenturyCode(0, century, 2, 0) == 3) System.out.println("Wednesday");
        else if(findCenturyCode(0, century, 2, 0) == 5) System.out.println("Friday");
        else System.out.println("Unknown");
        
        //System.out.println(findCenturyCode(0, century, 2, 0));
        
    }
    static int findCenturyCode(int CASE, int century, int doomsDayByCentury, int startCentury){
        
        
        switch(CASE){
            
            case 0:
                if(startCentury < century){
                    doomsDayByCentury -= 2;
                    startCentury += 100;
                    findCenturyCode(1, century, doomsDayByCentury, startCentury);
                }else if(startCentury == century){
                    doomsDayByCentury -= 2;
                    //break; 
                }
                //System.exit(0);
                
            case 1:
                if(startCentury < century){
                    doomsDayByCentury += 5;
                    startCentury += 100;
                    findCenturyCode(2, century, doomsDayByCentury, startCentury);
                }else if(startCentury == century){
                    doomsDayByCentury += 5;
                    //break;
                }
                //System.exit(0);
                
            case 2:
                if(startCentury < century){
                    doomsDayByCentury -= 2;
                    startCentury += 100;
                    findCenturyCode(3, century, doomsDayByCentury, startCentury);
                }else if(startCentury == century){
                    doomsDayByCentury -= 2;
                    //break;
                }
                //System.exit(0);
                
            case 3:
                if(startCentury < century){
                    doomsDayByCentury -= 1;
                    startCentury += 100;
                    findCenturyCode(0, century, doomsDayByCentury, startCentury);
                }else if(startCentury == century){
                    doomsDayByCentury -= 1;
                    //break;
                }
                //System.exit(0);
            }
        
        return doomsDayByCentury;
    }
}
