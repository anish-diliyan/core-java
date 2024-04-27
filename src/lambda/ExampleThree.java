package lambda;

public class ExampleThree {
    public static void main(String[] args) {
        Calculate cal = (a, b) -> a + b;
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
