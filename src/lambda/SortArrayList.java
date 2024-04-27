package lambda;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(20);
        Collections.sort(al, (obj1, obj2) -> obj1 - obj2);
        System.out.println(al);
    }
}
