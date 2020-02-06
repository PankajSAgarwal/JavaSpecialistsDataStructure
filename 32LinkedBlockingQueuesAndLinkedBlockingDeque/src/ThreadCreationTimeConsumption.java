public class ThreadCreationTimeConsumption {

    /*
        Starting of a thread is expensive ,
        so generally we use Executors to create threads pool which uses LinkedBlockingQueue internally
     */
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        try{

            Thread[] threads = new Thread[100];

            for (int i = 0; i < 1_000; i++) {
                for (int j = 0; j < 100 ; j++) {

                    threads[j] = new Thread(()->{});
                    threads[j].start();
                }
                for (Thread thread : threads) {
                    thread.join();
                }
            }
        }finally {
            // Output takes 6472ms .
            // It is generally better and faster to use ExecutorService
            // that uses LinkedBlockingQueue than to use Thread construction
            time = System.currentTimeMillis() - time;
            System.out.println("Time = " + time + "ms");
        }

    }
}
