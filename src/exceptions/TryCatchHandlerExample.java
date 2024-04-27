package exceptions;

public class TryCatchHandlerExample {
    public void m1(){
       try {
           // from here catch bock will be executed and control does not come back to try
           System.out.println(10/0);
       } catch (ArithmeticException ex){
           System.out.println("can not devide by 0");
       }
    }
    public static void main(String[] args) {
        TryCatchHandlerExample obj = new TryCatchHandlerExample();
        obj.m1();
    }
}
