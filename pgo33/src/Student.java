import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double grades;
    public Student(String fname, String lname, int indexNumber, String email, String address, double grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }
    public void AverageGrades(double grades){
        double AverageGrades =(this.grades * 2) / 2;
    }
    public void wyswietlInformacje() {
        System.out.println();
    }
}
