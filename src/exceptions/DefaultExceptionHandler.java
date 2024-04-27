package exceptions;

public class DefaultExceptionHandler {
    public void m1() {
        m2(); // this will terminate here
        System.out.println("m1 method execution after m2()");
    }
    public void m2() {
        System.out.println(10/0); // this function will terminate here
    }
    public static void main(String[] args) {
        DefaultExceptionHandler obj = new DefaultExceptionHandler();
        obj.m1(); // This function will terminate here
        System.out.println("main method execution after m1()");
    }
}
