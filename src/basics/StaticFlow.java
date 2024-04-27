package basics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StaticFlow {
    static {
        m1();
    }
    public static void m1() {
        System.out.println(i);
    }
    static int i = 10;
    static {
        System.out.println(i);
    }
    public  static  void main(String[] args) {
        System.out.println("main method called");
    }
}