package practiceTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Create a method countWords that takes a String and returns a Map<String,
 * Integer> where the keys are words and the values are the number of times each
 * word appears in the input string. Consider case-insensitivity and
 * punctuation.
 * 
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(countwords(str));
    }

    public static Map<String, Integer> countwords(String str) {
        String words[] = str.split("[.,/! ]+");

        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }

        return result;
    }
}