/*
4. Create an interface Searchable that has a single method search(dateStarttime, dateEndTime). The method return true if the date and time is available. Otherwise return false. Create an Appointment class. The appointment class has the day, month, year, startTime in hour and endTime in hour. The class has the method to save the appointment in text file. Define a method to search whether the appointment is available given the search date and time before adding new appointment. Create a Tester class to test the program. 
 */
package Lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q4Appointment implements Q4Searchable {

    //MY PC TIME FORMAT 18:56 09/12/2019
    private Scanner s = new Scanner(System.in);
    private File appointment = new File("C:/Users/User/Documents/NetBeansProjects/WIX1002/src/Lab10/Source/L10Q4Appointment.txt");
    private DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Q4Appointment() {
        askStartEndNCreateAppointment();
    }

    public void askStartEndNCreateAppointment() {

        if (!appointment.exists()) {
            try {
                PrintWriter p = new PrintWriter(new FileOutputStream(appointment));

                p.println("01/01/1970 00:00 -> 01/01/1970 00:00 -> Default");
                p.println();

                p.close();
            } catch (IOException ioe) {
                System.err.println("Problem creating appointment file");
            }
        }

        String start = "";
        String end = "";
        try {
            do {
                System.out.print("Enter appointment date in format (eg. 30/12/2019 18:56): ");
                start = s.nextLine();

                System.out.print("Enter appointment date in format (eg. 31/12/2019 00:56): ");
                end = s.nextLine();

                if (search(start, end)) {
                    System.out.print("Time available! Insert appointment detail: ");
                    String detail = s.nextLine();
                    setAppointment(sdf.format(sdf.parse(start)) + " -> " + sdf.format(sdf.parse(start)) + " -> " + detail);
                    System.out.println("Appointment saved!");
                    break;
                } else {
                    System.err.println("Please choose other time.");
                }
            } while (!search(start, end));
        } catch (ParseException pe) {
            System.err.println("Parsing error.");
        }
    }

    public void setAppointment(String appointmentStr) {

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(appointment, true));

            pw.println(appointmentStr);

            pw.close();
        } catch (IOException io) {
            System.err.println("Problem with saving appointment.");
        }
    }

    @Override
    public boolean search(String dateStartTime, String dateEndTime) {
        
        try {
            Date d = new Date();
            if(sdf.parse(dateStartTime).before(d)){
                return false; 
            }
        } catch (ParseException ex) {
            System.err.println("Parse error.");
        }
        
        try {
            Date newAppointmentStart = sdf.parse(dateStartTime);
            Date newAppointmentEnd = sdf.parse(dateEndTime);

            Scanner sc = new Scanner(new FileInputStream(appointment));
            int line = 0;

            while (sc.hasNextLine()) {
                line++;
                sc.nextLine();
            }

            sc.close();

            sc = new Scanner(new FileInputStream(appointment));

            for (int i = 0; i < line; i++) {
                String[] StartNEnd = new String[2];
                StartNEnd = sc.nextLine().split(" -> ");
                Date oldAppointmentStart = sdf.parse(StartNEnd[0]);
                Date oldAppointmentEnd = sdf.parse(StartNEnd[1]);

                if (newAppointmentStart.before(oldAppointmentStart) && newAppointmentEnd.before(oldAppointmentStart)) {
                    if (i == line - 1) {
                        return true;
                    }
                } else if (newAppointmentStart.after(oldAppointmentEnd) && newAppointmentEnd.after(oldAppointmentEnd)) {
                    if (i == line - 1) {
                        return true;
                    }
                } else {
                    return false;
                }
            }

            sc.close();

        } catch (ParseException pe) {
            System.err.println("Error parsing your inputted time.");
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
        }

        return true;
    }

}
