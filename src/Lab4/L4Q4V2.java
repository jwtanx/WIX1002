/*
 * Write a program that ask user to enter the year and the first day of the year 
(0 for Sunday, 1 for Monday, … , 6 for Saturday).
Display the calendar for May and August.

Keys:
fd      = fisrt day of the year/month;
dp      = day position
d       = date
md      = number of day of the month
lps     = leap year status <--- 0 = normal year, 1 = leap year
dd      = doomsday
fdom    = first day of month
dd1     = Jan doomsday
dd2     = Feb doomsday
mtbd    = month to be displayed

 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L4Q4V2 {
    static void findfdom(int fd, int lps, int mtbd){
        
        int[] fdom = new int[13];
        fdom[0] = 0;
        int d = 1;
        int dp = fd;
        
        int dd1 = 3, dd2 = 28, dd3 = 14, dd4 = 4, dd5 = 9, dd6 = 6, dd7 = 11, dd8 = 8, dd9 = 5, dd10 = 10, dd11 = 7, dd12 = 12;
        if(lps == 1){dd1 = 4; dd2 = 29;}
        
        while(d < dd1) {dp++; if(dp == 7) dp = 0; d++;}
        
        int dp2 = dp, dp3 = dp, dp4 = dp, dp5 = dp, dp6 = dp, dp7 = dp, dp8 = dp, dp9 = dp, dp10 = dp, dp11 = dp, dp12 = dp;
        
    //Jan        
        fdom[1] = fd;
    //Feb        
        while(dd2 != 1) {dd2--; dp2--;   if(dp2 == -1) dp2 = 6;} fdom[2] = dp2;
    //Mar        
        while(dd3 != 1) {dd3--; dp3--;   if(dp3 == -1) dp3 = 6;} fdom[3] = dp3;
    //Apr        
        while(dd4 != 1) {dd4--; dp4--;   if(dp4 == -1) dp4 = 6;} fdom[4] = dp4;
    //May        
        while(dd5 != 1) {dd5--; dp5--;   if(dp5 == -1) dp5 = 6;} fdom[5] = dp5;
    //Jun        
        while(dd6 != 1) {dd6--; dp6--;   if(dp6 == -1) dp6 = 6;} fdom[6] = dp6;
    //Jul        
        while(dd7 != 1) {dd7--; dp7--;   if(dp7 == -1) dp7 = 6;} fdom[7] = dp7;
    //Aug        
        while(dd8 != 1) {dd8--; dp8--;   if(dp8 == -1) dp8 = 6;} fdom[8] = dp8;
    //Sep        
        while(dd9 != 1) {dd9--; dp9--;   if(dp9 == -1) dp9 = 6;} fdom[9] = dp9;
    //Oct        
        while(dd10 != 1){dd10--; dp10--; if(dp10 == -1) dp10 = 6;} fdom[10] = dp10;
    //Nov        
        while(dd11 != 1){dd11--; dp11--; if(dp11 == -1) dp11 = 6;} fdom[11] = dp11;
    //Dec        
        while(dd12 != 1){dd12--; dp12--; if(dp12 == -1) dp12 = 6;} fdom[12] = dp12;
        
        //for(int c = 1; c < fdom.length; c++) System.out.println(c + " is " + fdom[c] + "day");
        
        if(mtbd == 1)  printCal(fdom[1], 1, lps, 0);
        if(mtbd == 2)  printCal(fdom[2], 2, lps, 0);
        if(mtbd == 3)  printCal(fdom[3], 3, lps, 0);
        if(mtbd == 4)  printCal(fdom[4], 4, lps, 0);
        if(mtbd == 5)  printCal(fdom[5], 5, lps, 0);
        if(mtbd == 6)  printCal(fdom[6], 6, lps, 0);
        if(mtbd == 7)  printCal(fdom[7], 7, lps, 0);
        if(mtbd == 8)  printCal(fdom[8], 8, lps, 0);
        if(mtbd == 9)  printCal(fdom[9], 9, lps, 0);
        if(mtbd == 10) printCal(fdom[10], 10, lps, 0);
        if(mtbd == 11) printCal(fdom[11], 11, lps, 0);
        if(mtbd == 12) printCal(fdom[12], 12, lps, 0);
    }
    
    static void printCal(int dp, int m, int lps, int showAll){
        
        int feb = 28;
        int md = 0;
        if(lps == 1) feb = 29;
        
        System.out.println();
        if(m == 1)  {System.out.println("\nJanuary");   md = 31;}
        if(m == 2)  {System.out.println("\nFebruary");  md = feb;}
        if(m == 3)  {System.out.println("\nMarch");     md = 31;}
        if(m == 4)  {System.out.println("\nApril");     md = 30;}
        if(m == 5)  {System.out.println("\nMay");       md = 31;}
        if(m == 6)  {System.out.println("\nJune");      md = 30;}
        if(m == 7)  {System.out.println("\nJuly");      md = 31;}
        if(m == 8)  {System.out.println("\nAugust");    md = 31;}
        if(m == 9)  {System.out.println("\nSeptember"); md = 30;}
        if(m == 10) {System.out.println("\nOctober");   md = 31;}
        if(m == 11) {System.out.println("\nNovember");  md = 30;}
        if(m == 12) {System.out.println("\nDecember");  md = 31;}
        
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        
        for(int n = 0; n < dp; n++) System.out.print("\t");
        
        for(int d = 1; d <= md; d++){
            System.out.printf("%3d\t", d);
            if(dp < 7) dp++;
            if(dp == 7){System.out.println(); dp -= 7;}
        }
    
        if(showAll == 1){
            if(m != 12) {m++; printCal(dp, m, lps, 1);}
        }
    }
    
    static Scanner s = new Scanner(System.in);
    
    static void chooseMonth(int fd, int lps){
        int month;
        do{
            System.out.print("\n\nChoose any month from 1 - 12 [Other number to exit]: ");
            month = s.nextInt(); 
            findfdom(fd, lps, month);
        }while(month != 0 && month < 13);
    }
    
    public static void main(String[] args) {
        
        System.out.print("Enter the year: ");
        int year = s.nextInt();
        int lps = 0;
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) lps = 1;
        int fd;
        
        do{
            System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, … , 6 for Saturday): ");
            fd = s.nextInt(); s.nextLine();}
        while(fd < 0 || fd > 6);
   
        System.out.print("Type \"CHOOSE\" = Choose various months, \"ALL\" = Show all: ");
        String choice = s.nextLine();
        if(choice.toLowerCase().contains("c")) chooseMonth(fd, lps);
        else if(choice.toLowerCase().contains("a")) printCal(fd, 1, lps, 1);
        else {System.out.println("Please restarts!"); System.exit(0);}

        System.out.println("\n\nDone @ 121019, 01:12");
    }
}
    /* To show Monday first [NEED EDIT]
        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");
        
        for(int n = 1; n < dp; n++) System.out.print("\t");
        
        for(int d = 1; d <= md; d++){
            
            if(d != md) System.out.printf("%3d\t", d);
            else if (d == md) System.out.printf("%3d", d);
            
            if(dp < 8) dp++;
            
            if(dp == 8){
                System.out.println();
                dp -= 7;
            }
        }
    */

    /* Monday starts [NEED EDIT]
        System.out.print("Enter the first day of the year (1 for Monday, … , 6 for Saturday, 7 for Sunday): ");
        int fd = s.nextInt();
        s.nextLine();
        if(fd < 1 || fd > 7) {System.out.println("Please restarts!"); System.exit(0);}
    */