package practiceTest;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question5 {
    // Write a method filterStrings that takes a List<String> and a
    // Predicate<String> as parameters.
    // The method should return a list of strings that match the predicate
    // condition.
    // Use a lambda expression to pass the predicate when calling the method.
    // Example: List<String> names = Arrays.asList("Alice", "Bob", "Charlie",
    // "David");
    // Expected Output: (Filtering names that start with 'A') [Alice]

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> names = Arrays.asList("Alice", "Bob", "alexa","Charlie", "David");
        System.out.print("Enter the character to filter the Strings : ");
        char firstCharacter = sc.next().charAt(0);

        Predicate<String> testString = ele -> ele.toLowerCase().charAt(0) == firstCharacter;
        List<String> result = filteSrings(names, testString);

        System.out.println(result);
    }

    public static List<String> filteSrings(List<String> names, Predicate<String> testString) {
        return names.stream().filter(ele -> testString.test(ele)).collect(Collectors.toList());
    }
}
