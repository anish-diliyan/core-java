package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSortList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(12);
        // sorted()
        // sorted(comparator)
        List<Integer> even = al.stream().filter(l -> l%2 == 0).sorted((obj1, obj2) -> obj2-obj1).collect(Collectors.toList());
        System.out.println(even); // [12, 10]
    }
}
