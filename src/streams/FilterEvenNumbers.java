package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(12);
        // filter method takes Predicate (return true or false)
        // convert collection into: stream al.stream()
        // apply filter method: filter(l -> l%2 == 0)
        // collect result into list: collect(Collectors.toList())
        List<Integer> even = al.stream().filter(l -> l%2 == 0).collect(Collectors.toList());
        System.out.println(even); // [10, 12]
    }
}
