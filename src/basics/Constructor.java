package basics;

class ParentC {
    ParentC() {
        System.out.println("this is parent");
    }
}
class ChildC extends ParentC {
    ChildC() {
        System.out.println("this is child");
    }
}
public class Constructor {
    public static void main(String[] args) {
        ChildC c = new ChildC();
    }
}
