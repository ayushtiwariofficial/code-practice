import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
// Question 1: Filter and Print Even Numbers
// Task: Given a list of integers, use Java Stream API to filter out even numbers and print them.
// Example: For the list [1, 2, 3, 4, 5, 6], the output should be 2, 4, 6.

        List<Integer> list = Arrays.asList(2,35,77,4,3,23,56,7,4,45);
        list.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));

//---------------------------------------------------------------------------------------------------
//Question 2: Convert Strings to Uppercase
// Task: Given a list of strings, use Java Stream API to convert each string to uppercase.
// Example: For the list ["apple", "banana", "cherry"], the output should be ["APPLE", "BANANA", "CHERRY"].

        List<String> fruits = Arrays.asList("apple","banana","cherry","mango");
        fruits.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

//---------------------------------------------------------------------------------------------------
// Question 3: Find the Maximum Value
// Task: Given a list of integers, use Java Stream API to find the maximum value.
// Example: For the list [5, 3, 8, 2, 9], the output should be 9.

        List<Integer> numList = Arrays.asList(2,4,5,3,22,34,5,3,22,34,5,33);
        int maxNum  = numList.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("Max Num: " +maxNum);

// //-----------------------------------------------------------------------------------------------
// Question 4: Sum of Squares
// Task: Given a list of integers, use Java Stream API to calculate the sum of their squares.
// Example: For the list [1, 2, 3], the output should be 1*1 + 2*2 + 3*3 = 14.

        List<Integer> list2 = Arrays.asList(1,2,3,23);
        int sumOfSquares = list2.stream().map(n -> n*n).reduce(0, (a,b)-> a+b);
        System.out.println("Sum of Squares : " +sumOfSquares);

// //-------------------------------------------------------------------------------------------------
// Question 5: Group Strings by Length
// Task: Given a list of strings, use Java Stream API to group them by their length.
// Example: For the list ["one", "two", "three", "four", "five", "six"], the output should be a map like {3=[one, two, six], 4=[four, five], 5=[three]}.

        List<String> stringByLength = Arrays.asList("one", "two", "three", "four", "five", "six", "sixteen");
        Map<Integer,List<String>> groupStringsByLength = stringByLength.stream().collect(Collectors.groupingBy(word -> word.length()));
        System.err.println(groupStringsByLength);

//------------------------------------------------------------------------------------------------------
// Question 6: Flatten a List of Lists
// Task: Given a list of lists of integers, use Java Stream API to flatten it into a single list of integers.
// Example: For the list [[1, 2], [3, 4], [5, 6]], the output should be [1, 2, 3, 4, 5, 6].
        
        List<List<Integer>> listOfLists = Arrays.asList(
                                          Arrays.asList(1,2,3),
                                          Arrays.asList(8,4),
                                          Arrays.asList(5,6,7,9)
        );

        // List<Integer> flatList = 
        listOfLists.stream().flatMap(arr -> arr.stream())
        .forEach(System.out::println); // If we directly want to print the list without storing it in a separate list.
        // .collect(Collectors.toList());
        // System.out.print(flatList);
    } 
}
