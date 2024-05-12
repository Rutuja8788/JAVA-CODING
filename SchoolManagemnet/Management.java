package SchoolManagemnet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Management
{
    public List<Student> students=new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        students.stream()
                .forEach(student -> System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", Grade: " + student.getGrade()));
    }

}

