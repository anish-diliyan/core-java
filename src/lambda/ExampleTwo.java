package lambda;

/*
  For a Functional interfaces we can implement methods by using lambda
*/
public class ExampleTwo {
    public static void main(String[] args) {
        Greet obj = () -> System.out.println("Good morning Lambda !");
        obj.morning();
    }
}
