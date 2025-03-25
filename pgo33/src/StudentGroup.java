import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String nazwa;
    public List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (students.size() > 15) {
            throw new IllegalStateException("Grupa nie może mieć więcej niż 15 studentów");
        }
            if (students.contains(student)) {
                throw new IllegalStateException("Student już jest w tej grupie");
        }else{
                students.add(student);
            }
    }
    public void wyswietlGrupe() {
        for (Student student : students) {
            System.out.println(student.fname + " " + student.lname);
        }
    }
}
