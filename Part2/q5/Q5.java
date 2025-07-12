package Part2.q5;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Q5 {
    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {
            int finalI = i;
            executor.execute(() -> {
                System.out.println(finalI + " " + Thread.currentThread().getName());
            });
        }

        try {
            executor.wait(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
