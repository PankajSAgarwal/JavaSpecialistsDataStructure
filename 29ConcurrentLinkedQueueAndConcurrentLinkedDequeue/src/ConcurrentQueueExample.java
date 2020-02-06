import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.IntStream;

public class ConcurrentQueueExample {
    public static void main(String[] args) {
        Queue<Integer> clq = new ConcurrentLinkedQueue<>();
        System.out.println(clq.offer(1));
        System.out.println(clq.add(2));
        System.out.println(clq.poll());
        System.out.println(clq.poll());
        System.out.println(clq.poll());

        System.out.println(clq.size()); // O(n)

        LongAccumulator maxSize = new LongAccumulator(Long::max,0);

        IntStream.range(0,100_000_000)
                .parallel()
                .forEach(i->{
                    clq.offer(i);
                    maxSize.accumulate(clq.size());
                    clq.poll();
                });
        System.out.println("maxSize = " + maxSize);

        // lifo or fifo or some hybrid
        Queue<Integer> cld = new ConcurrentLinkedDeque<>();

    }
}
