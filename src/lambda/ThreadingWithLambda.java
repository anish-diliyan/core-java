package lambda;

public class ThreadingWithLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable r  = () -> {
            for(int i = 1; i<=10; i ++) {
                System.out.println("Child Thread " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i = 1; i <= 10; i++){
            System.out.println("Main Thread " + i);
            Thread.sleep(10);
        }
    }
}
