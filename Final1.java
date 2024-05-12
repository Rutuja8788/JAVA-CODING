import SchoolManagemnet.Student;
import SchoolManagemnet.Management;
import java.util.Scanner;

public class Final1
{
    public static void main(String[] args) {
        Management school = new Management();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. List Students\n3. Exit\nEnter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter student age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student grade:");
                    String grade = scanner.nextLine();
                    school.addStudent(new Student(id, name, age, grade));
                    break;
                case 2:
                    System.out.println("List of Students:");
                    school.listStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
