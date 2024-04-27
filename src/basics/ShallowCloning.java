package basics;

class Test {
    int x, y;
}
class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

// Driver class
public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;
        // Creating a copy of object t1
        // and passing it to t2
        Test2 t2 = (Test2)t1.clone();
        // Change in primitive type of t2 will
        // not be reflected in t1 field
        t2.a = 100;
        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        t2.c.x = 300;
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                + " " + t1.c.y); // 10 20 300 40
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x
                + " " + t2.c.y); // 100 20 300 40
    }
}
