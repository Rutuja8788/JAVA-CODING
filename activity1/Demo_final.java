package activity1;
import java.util.*;
import java.util.stream.Collectors;

public class Demo_final {
    public static int MoreThanFiveChar(List<String> names) {
        return (int) names.stream()
                .filter(name -> name.length() > 5)
                .count();
    }

    public static Optional<String> findNameWithFiveCharacters(List<String> names) {
        return names.stream()
                .filter(name -> name.length() == 5)
                .findAny();
    }

    public static Map<Character, List<String>> groupNamesByFirstCharacter(List<String> names) {
        return names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
    }

    public static List<String> sortNamesAscending(List<String> names) {
        return names.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}