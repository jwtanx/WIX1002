/*
4. Create an interface Searchable that has a single method search(dateStarttime, dateEndTime). The method return true if the date and time is available. Otherwise return false. Create an Appointment class. The appointment class has the day, month, year, startTime in hour and endTime in hour. The class has the method to save the appointment in text file. Define a method to search whether the appointment is available given the search date and time before adding new appointment. Create a Tester class to test the program. 
 */
package Lab10;

public interface Q4Searchable {
    
    public boolean search(String dateStarttime, String dateEndTime);
    
}
