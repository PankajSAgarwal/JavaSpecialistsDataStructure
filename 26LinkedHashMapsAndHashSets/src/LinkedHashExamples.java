import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LinkedHashExamples {

    public static void main(String[] args) {
        /* LinkedHashSet
        * LinkedHashSet maintains insertion order
        * So useful when a lookup is required in a collection and insertion order needs to
        * be preserved
        *
         */
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(0);

        System.out.println("numbers = " + numbers);

        /*
        *LinkedHashMap
        * maintains access order as well , by default is false and will follow insertion order , needs to be turned on to
        * if switched to true will maintain access order , can be used to build LRU caches
        * IMP - Not thread safe
         */

        LinkedHashMap<Integer,Integer> squares = new LinkedHashMap<>(16,0.75f,true);
        squares.put(1,1);
        squares.put(16,256);
        squares.put(3,9);
        squares.put(12,144);
        squares.put(15,225);

        System.out.println("squares = " + squares);
        System.out.println("squares.get(12) = " + squares.get(12));
        System.out.println("squares.get(12) = " + squares.get(1));
        System.out.println("squares = " + squares);

        // A sample LRU(least recently) cache of squares on access order

        LinkedHashMap<Integer,Integer> lruSquares = new LinkedHashMap<>(16,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size()>5;
            }
        };

        for (int i = 0; i < 6 ; i++) {
            lruSquares.put(i,i*i);
        }
        // 0 is kicked out of map since 0 inserted first and cache kicks eldest when size >5
        System.out.println("lruSquares = " + lruSquares);
        System.out.println("lruSquares.get(4) = " + lruSquares.get(4));
        // 4 moves to end since it was recently accessed
        System.out.println("lruSquares = " + lruSquares);
        for (int i = 10; i <14 ; i++) {
            lruSquares.put(i,i*i);
            
        }
        // 4 is at the beginning of the map
        System.out.println("lruSquares = " + lruSquares);
        




    }
}
