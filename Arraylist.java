
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Adding elements in array list
        numbers.add(1);
        numbers.add(19);
        numbers.add(91);

        for(int i : numbers){
            System.out.println("Number is "+ i);
        }

        numbers.add(2, 28); // Adding numbers at specific index
        System.out.println(numbers);

        numbers.remove(0); // deleting number from index 0
        System.out.println(numbers);

        // retrieving elements using index
        System.out.println(numbers.get(2));

        //updating elements
        numbers.set(1, 10);

        System.out.println(numbers.size()); //size of an arraylist

        System.out.println(numbers.contains(23)); // returns true if 23 is present

        ArrayList<Integer> otherList = new ArrayList<>(Arrays.asList(2,3,4,5));
        numbers.addAll(otherList); // adding items from other list
        System.out.println(numbers);
        numbers.removeAll(otherList); // removes items from numbers list which are present in otherList

        // Traversing through an Iterator
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext())
        {
            System.err.print(it.next() + "  ");
        }

        Collections.sort(numbers); // soring a list in natural order

        Integer arr[] = numbers.toArray(new Integer[2]);
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
