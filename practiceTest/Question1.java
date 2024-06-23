package practiceTest;

import java.util.Arrays;
import java.util.List;

public class Question1 {

// Given a list of integers, use Java Streams to find the sum of all even numbers in the list.
// 	Example:List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Expected Output: Sum of even numbers: 30
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = numbers.stream().filter(n -> n%2==0).reduce(0, (a,b) -> a+b);

        int result1 = numbers.stream()
                    .filter(n -> n % 2 == 0) // Filter even numberss
                    .mapToInt(Integer::intValue) // Convert to IntStream
                    .sum(); // Sum the elements

        System.out.println(result);
    }
}
