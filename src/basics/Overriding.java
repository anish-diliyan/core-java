package basics;

class Parent {
  int x = 200;
}
class Child extends Parent {
   int x = 300;
}

public class Overriding {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        Parent pc = new Child();
        System.out.println(c.x); // 300
        System.out.println(p.x); // 200
        System.out.println(pc.x); //200
    }
}
