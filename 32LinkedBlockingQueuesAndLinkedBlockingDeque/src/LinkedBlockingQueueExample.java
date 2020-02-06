import java.util.concurrent.*;

public class LinkedBlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        try{
       // ExecutorService pool = Executors.newFixedThreadPool(10);

            // WorkStealing pool much faster that FixedThreadPool
        ExecutorService pool = Executors.newWorkStealingPool(10);

        // Inline Method shows ThreadPoolExecutor shows it makes use of LinkedBlockingQueue

            /*ExecutorService pool = new ThreadPoolExecutor(10, 10,
                    0L, TimeUnit.MILLISECONDS,
                    new LinkedTransferQueue<>());*/

            for(int i = 0;i<10_000_000;i++){
            pool.submit(()->{});
        }

        pool.shutdown();
        while(!pool.awaitTermination(1, TimeUnit.SECONDS));

        }finally {
            time = System.currentTimeMillis() - time;
            System.out.println("time = " + time + "ms");

            // output on my mac with different DataStructure implementation of ThreadPoolExecutors
            // LinkedBlockingQueue - 3266ms
            // LinkedBlockingDeQueue - 2949ms
            // ArrayBlockingQueue - 2258ms
            // LinkedTransferQueue - 1375 ms
            // newWorkStealingPool is 3 times faster than newFixedThreadPool with ExecutorService - 1068ms
            // LinkedBlocking queue uses a re-entrant lock at head and tail , so if we can guarantee
            // there is one thread that does put another thread that takes from the queue,there are better queue structures that should be used
        }
    }

}
