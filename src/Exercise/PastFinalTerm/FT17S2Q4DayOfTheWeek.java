/*
 * 4. Zeller's congruence is used to calculate the day of the week. Given the following formula: 
         /    | 13(m + 1) |       |  K  |   |  J  |     \
    h = | q + | --------- | + K + | --- | + | --- | + 5J | mod 7
         \    |_    5    _|       |_ 4 _|   |_ 4 _|     /

Symbol  Description day of the week 
h       day of the week(0: Saturday, 1: Sunday, 2: Monday ... 6:Friday) 
q       day of the month
m       month (3: March, 4: April, . 12:December, January and February are counted as 13 and 14 of the previous year)
y       year 
J       century = year/100 
K       year of the century = year modulus 100 

A scientist would like to display the day of the week based on the records stored in a binary file (Q4.dat). Each record in the binary file contains q, m and y in order. Write a program to help the scientist to display the output. The program contains a class named DayofTheWeek. The class must contain the following: 
- Instance variables for the symbols above. 
- A constructor that contains q, m and y as arguments. 
- A method to ensure that the valid day of the month including determine whether the year is a leap year. A leap year is a calendar year containing one additional day in February 
- A method to determine whether the year is a leap year. A loap yoar is divisible by 4 but not by 100, In addition, a leap year is also divisible by 400 
- A method to display the day of the woek.
 */
package Exercise.PastFinalTerm;

//import java.time.LocalDate;

public class FT17S2Q4DayOfTheWeek {

    private int h, q, m, y, J, K;
//    private LocalDate date;

    public FT17S2Q4DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
    }

    public boolean checkLeapYear() {

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            return true;
        }
        return false;

    }

    public boolean checkValidity() {

//        try {
//            date = LocalDate.of(q, m, y);
//        } catch (Exception e) {
//            return false;
//        }
        
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(q >= 0 && q <= 31){
                    return true;
                }
            break;
                
            case 2:
                if(checkLeapYear()){
                    if(q >= 0 && q <= 29){
                        return true;
                    }
                } else {
                    if(q >= 0 && q <= 28){
                        return true;
                    }
                }
            break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                if(q >= 0 && q <= 30){
                    return true;
                }
            break;
            
            default:
                return false;
                
        }
        return false;
    }

    public String day() {

        if(checkValidity()){
            
            int m = this.m;
            int y = this.y;
            
            switch (m) {
                case 1:
                    m = 13;
                    y--;
                    break;
                case 2:
                    m = 14;
                    y--;
                    break;
            }
            J = y / 100;
            K = y % 100;
            h = (int) ((q + Math.floor((13 * (m + 1)) / 5) + K + Math.floor(K / 4) + Math.floor(J / 4) + (5 * J)) % 7);
            
            switch(h){
                case 0:
                    return "on Saturday";
                case 1:
                    return "on Sunday";
                case 2:
                    return "on Monday";
                case 3:
                    return "on Tuesday";
                case 4:
                    return "on Wednesday";
                case 5:
                    return "on Thursday";
                case 6:
                    return "on Friday";
                    
                default:
                    return "Formula error";
            }
            
            
        } else {
            return "invalid input";
        }
        
    }

    @Override
    public String toString() {
        String result = String.format("%d/%d/%d is %s", q, m, y, day());
        return result;
    }
    
    
}
