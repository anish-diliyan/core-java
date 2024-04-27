package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamForArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        Integer[] even = Stream.of(arr).filter(i -> i % 2 == 0).collect(Collectors.toList()).toArray(Integer[]::new);
        System.out.println(Arrays.toString(even)); // [2, 4]
    }
}
