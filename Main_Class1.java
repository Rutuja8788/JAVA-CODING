import activity1.Demo1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main_Class1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Bhavya", "Chetan", "Deepak", "Ekta", "Farhan", "Gita", "Harsh", "Isha", "Jyoti");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Count names with more than 5 characters\n2. " +
                    "Find a name with exactly 5 characters\n3. " +
                    "Group names by their first character\n4." +
                    " Sort names in ascending order ignoring case");
            System.out.println("Enter your choice (1-4, 0 to exit):");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Number of names with more than 5 characters: " + Demo1.MoreThanFiveChar(names));
                    break;
                case 2:
                    Optional<String> name = Demo1.findNameWithFiveCharacters(names);
                    if (name.isPresent()) {
                        System.out.println("Name with exactly 5 characters: " + name.get());
                    } else {
                        System.out.println("No name with exactly 5 characters found.");
                    }
                    break;
                case 3:
                    Map<Character, List<String>> groupedNames = Demo1.groupNamesByFirstCharacter(names);
                    groupedNames.forEach((firstChar, nameList) -> System.out.println(firstChar + ": " + nameList));
                    break;
                case 4:
                    List<String> sortedNames = Demo1.sortNamesAscending(names);
                    System.out.println("Sorted names: " + sortedNames);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}