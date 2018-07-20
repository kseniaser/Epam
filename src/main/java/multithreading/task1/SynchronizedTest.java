package multithreading.task1;

public class SynchronizedTest {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedAccount account = new SynchronizedAccount();
        Runnable first = () -> {
            //synchronized (account) {
                account.makeOperation(-100);
                account.makeOperation(10);
            //}
        };
        Runnable second = () -> {
            //synchronized (account) {
                account.makeOperation(-1);
                account.makeOperation(1000);
            //}
        };

        Thread firstThread = new Thread(first);
        Thread secondThread = new Thread(second);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
    }
}
