import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueExample {

    public static void main(String[] args) {

        ExecutorService pool = new ThreadPoolExecutor(10,100,
                1, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>()
                );

        for (int i = 0; i <1_000 ; i++) {

            pool.submit(()->{
                Thread.sleep(1_000);
                return null;
            });

            // How many threads created ?
            
        }
    }
}
