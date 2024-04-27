package lambda;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i<=10; i ++) {
            System.out.println("Child Thread " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
