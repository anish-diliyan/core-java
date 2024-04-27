package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyByTwo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(12);
        // map method takes Function (return value)
        // convert collection into: stream al.stream()
        // apply map method: map(l -> l*2)
        // collect result into list: collect(Collectors.toList())
        List<Integer> ul = al.stream().map(l -> l*2).collect(Collectors.toList());
        System.out.println(ul); // [20, 22, 24]
    }
}
