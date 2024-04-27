package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxFromList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(12);
        // min: pick first element of sorted list
        int min = al.stream().min((obj1, obj2) -> obj1 -obj2).get();
        System.out.println(min); // 10
        // max: pick last element of sorted list
        int max = al.stream().max((obj1, obj2) -> obj1 - obj2).get();
        System.out.println(max); // 12
    }
}
