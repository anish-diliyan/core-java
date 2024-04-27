package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountTotalEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(12);
        // count function return long
        long count = al.stream().filter(l -> l%2 == 0).count();
        System.out.println(count); // 2
    }
}
