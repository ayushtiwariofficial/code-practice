
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorQues {
    public static void main(String args[])
    {
        // Sort strings based on their length in ascending order.

        Comparator <String> com = new Comparator<String>()
        {
            public int compare(String i, String j)
            {
                if(i.length() > j.length())
                    return 1;
                else
                    return -1;
            }
        };

        ArrayList<String> str = new ArrayList<>();
        str.add("Ayush");
        str.add("Rahul");
        str.add("raju");
        str.add("Ashish");
        str.add("Unknown");

        Collections.sort(str, com);

        System.out.println(str);
    }
}
