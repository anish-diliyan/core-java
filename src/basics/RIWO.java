package basics;

public class RIWO {
    static int i = 10;
    static {
        System.out.println(i);
        //System.out.println(j); //illegal forward exception
    }
    static  int j = 20;
    public static void main(String[] args) {
        System.out.println("This is main method execution");
    }

}