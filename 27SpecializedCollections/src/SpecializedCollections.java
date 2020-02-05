import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class SpecializedCollections {
    public static void main(String[] args) {
        //EnumSet

        EnumSet<Thread.State> states = EnumSet.allOf(Thread.State.class);
        System.out.println("states = " + states);

        //EnumMap
        Map<Thread.State, LongAdder> timesInState = Collections.synchronizedMap(
                new EnumMap<Thread.State, LongAdder>(Thread.State.class));

        System.out.println("timesInState = " + timesInState);

        // Identity HashMap
        IdentityHashMap<String,Integer> map = new IdentityHashMap<>();
        map.put("hello",42);
        System.out.println("map.get(\"hello\") = " + map.get("hello"));// prints 42
        //prints null
        System.out.println("map.get(new String(\"hello\") = " + map.get(new String("hello")));

        Map<IdentityKey<String>,Integer> map2 = new ConcurrentHashMap<>();
        map2.put(new IdentityKey<String>("Hello"),42);
        // returns 42
        System.out.println("map2.get(new IdentityKey<>(\"Hello\")) = " + map2.get(new IdentityKey<>("Hello")));

        /*
            Properties : Uses ConcurrentHashMap even though it extends HashTable
         */

        Properties properties = new Properties();

        int parallelism = Integer.parseInt(
                System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "42")
        );
        System.out.println("parallelism = " + parallelism);

        int parallelismBetter = Integer.getInteger("java.util.concurrent.ForkJoinPool.common.parallelism", 42);
        System.out.println("parallelismBetter = " + parallelismBetter);

    }
    public static class IdentityKey<K>{

        private final K key;

        public IdentityKey(K key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IdentityKey<?> that = (IdentityKey<?>) o;
            return Objects.equals(key, that.key);
        }

        @Override
        public int hashCode() {
            return System.identityHashCode(key);
            //return Objects.hash(key);
        }
    }
}
