package LectureNotes.TU9;

public class Staff {

    protected String name, ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }

//    @Override
    public String toString() {
        return "Full Name: " + name + "\n"
                + "IC: " + ic + "\n";
    }

}
