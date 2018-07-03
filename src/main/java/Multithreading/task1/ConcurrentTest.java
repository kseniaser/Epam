package Multithreading.task1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentTest {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentAccount account = new ConcurrentAccount();
        //ExecutorService executor = new Executors.newSingleThreadExecutor();
        Runnable first = () -> {
                account.makeOperation(-100);
                account.makeOperation(10);
        };
        Runnable second = () -> {
                account.makeOperation(-1);
                account.makeOperation(1000);
        };

        Thread firstThread = new Thread(first);
        Thread secondThread = new Thread(second);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
    }
}
