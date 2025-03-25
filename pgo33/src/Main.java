public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Karol", "Zawrocki", "s3897", "s3897@pjwstk.edu.pl", "ul. Marynarska", 5);
    Student student2 = new Student("Maks", "Dentka", "s27345", "s27345@pjwstk.edu.pl", "ul. Warszawska", 5);
    StudentGroup grupa1 = new StudentGroup();
    student1.addGrade(4.5);
    student1.addGrade(5.0);
    student1.addGrade(3.0);
    student1.addGrade(2.5);
    student1.addGrade(3.5);
    student2.addGrade(2.5);
    student2.addGrade(4.5);
    student2.addGrade(5.0);
    student2.addGrade(3.0);
    student2.addGrade(2.5);
    student2.addGrade(3.5);
    student2.addGrade(4.5);
    student2.addGrade(5.0);
    student2.addGrade(3.0);
    student2.addGrade(2.5);
    grupa1.addStudent(student1);
    grupa1.addStudent(student2);
    System.out.println(student1.getAverageGrades());
    System.out.println(student2.getAverageGrades());
    grupa1.wyswietlGrupe();

    }

}