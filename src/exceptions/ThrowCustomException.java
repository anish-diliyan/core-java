package exceptions;

public class ThrowCustomException {
    public  void m1() {
        throw new ArithmeticException("/ by zero");
    }
    public static void main(String[] args) {
        ThrowCustomException obj = new ThrowCustomException();
        try{
            obj.m1();
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
