import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.IntStream;

public class ConcurrentSkipListMapTest {

    public static void main(String[] args) {
        // Gives sorted order with thread safety
       Map<Integer,Integer> squares = new ConcurrentSkipListMap<>();

        // TreeMap Doesn't give full 10,000 numbers but 9768 numbers
       // Map<Integer,Integer> squares = new TreeMap<>();
        // HashMap doesnt give full 10,000 numbers but reduced numbers
        //Map<Integer,Integer> squares = new HashMap<>();
        // Concurrent Hashmap gives full range of numbers but not necessarily in sorted order
        //Map<Integer,Integer> squares = new ConcurrentHashMap<>();

        IntStream.range(0,10_000).parallel().forEach(
                i->squares.put(i,i*i)
        );

        System.out.println("squares = " + squares);
        System.out.println("squares.size() = " + squares.size());
        

    }
}
