import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public ArrayList<Double> grades;

    public Student(String fname, String lname, String indexNumber, String email, String address, double grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grades) {
        this.grades.add(grades);
    }

    public double getAverageGrades() {
    double sum = 0;
    for (double grade : grades) {
        sum += grade;
    }
    if(grades.size() == 0 || grades.size() > 20){
        throw new IllegalArgumentException("Niedozwolona ilość ocen");
    }
    double srednia = (sum / grades.size());
        return Math.round(srednia * 2) / 2.0;
    }
}
