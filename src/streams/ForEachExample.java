package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

interface ModifyString {
    static String reverse(String str){
        if(str.length() <= 1) return str;
        else {
           return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("a");
        name.add("ab");
        name.add("abc");
        name.add("abcd");
        List<String> rname = name.stream().map(ModifyString::reverse).collect(Collectors.toList());
        // for each takes consumer that return void
        rname.forEach(System.out::println);
        // another way to do
        Consumer<String> f  = str -> System.out.println("Reverse is: " + ModifyString.reverse(str));
        name.forEach(f);
    }
}
