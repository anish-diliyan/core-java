package exceptions;

class TooYoungException extends RuntimeException {
    TooYoungException(String s) {
        super(s);
    }
}
public class CustomException {
    public  void m1() {
        throw new TooYoungException("You are too young");
    }
    public static void main(String[] args) {
        CustomException ex = new CustomException();
        try {
            ex.m1();
        } catch (TooYoungException e){
            System.out.println(e.getMessage());
        }

    }
}
