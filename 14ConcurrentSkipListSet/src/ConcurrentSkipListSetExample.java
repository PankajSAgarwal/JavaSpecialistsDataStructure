import java.util.Collections;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ThreadLocalRandom;

public class ConcurrentSkipListSetExample {

    public static void main(String[] args) {
        // Thread safe and sorted Set
        ConcurrentSkipListSet<Integer> numbers = new ConcurrentSkipListSet<>(
                Collections.reverseOrder());

        ThreadLocalRandom.current().ints(100).forEach(i-> numbers.add(i));
        System.out.println("numbers.size() = " + numbers.size());

        System.out.println("numbers = " + numbers);
    }
}
