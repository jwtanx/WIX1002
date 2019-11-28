package LectureNotes.TU9;

public class PartTimeStaff extends Staff {

    private int hour;

    public PartTimeStaff(String name, String ic, int hour) {
        super(name, ic);    // <--- Important part
        this.hour = hour;
    }

    public int getSalary() {
        return hour * 40;
    }

    public String toString() {
        return super.toString() + "Number of working hours: " + hour + "\n" + "Salary: " + getSalary();
    }

}
