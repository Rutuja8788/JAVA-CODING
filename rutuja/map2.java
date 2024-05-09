package rutuja;
import java.util.*;
import java.util.stream.Collectors;


class Map2
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Mary");
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        List<Character> firstLetters = uppercaseNames.stream()
                .map(name -> name.charAt(0))
                .collect(Collectors.toList());

        // Print the uppercase names and first letters
        System.out.println("Uppercase names: " + uppercaseNames);
        System.out.println("First letters: " + firstLetters);
    }
}
