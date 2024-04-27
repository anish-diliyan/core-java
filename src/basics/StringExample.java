package basics;

public class StringExample {
    public static void main(String[] args) {
      String s1 = "Anish";
      String s2 = new String("Anish");
      System.out.println(s1 == s2);

      String obj1 = "Bipin";
      String obj2 = "Bipin";
      System.out.println(obj1 == obj2);

      Integer x = 127;
      Integer y = 127;
      System.out.println(x == y);

      Integer i = new Integer(10);
      Integer j = new Integer(10);
      System.out.println(i == j);//false
    }
}
