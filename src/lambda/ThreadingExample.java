package lambda;

public class ThreadingExample {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable r = new MyRunnable();
        Thread t  = new Thread(r);
        t.start();
        for(int i = 1; i <= 10; i++){
            System.out.println("Main Thread " + i);
            Thread.sleep(10);
        }
    }
}
