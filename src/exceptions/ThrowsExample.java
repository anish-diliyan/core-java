package exceptions;

import java.io.FileNotFoundException;

public class ThrowsExample {
    public  void m1() throws FileNotFoundException{
        throw new FileNotFoundException("file not found");
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
