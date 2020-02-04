import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeSetExamples {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Set<Integer> oddBetweenMinusTenAndTen = new TreeSet<>();
        oddBetweenMinusTenAndTen.addAll(Arrays.asList(-9,-7,-5,5,-1,-3,3,1,1,1,9,7));
        System.out.println("oddBetweenMinusTenAndTen = " + oddBetweenMinusTenAndTen);
        
       // Set<Object> mixed = new TreeSet<>();
        //mixed.add("Hello");
        //This will give class cast exception . Set should have homogeneous collections
        //mixed.add(42);
        //System.out.println("mixed = " + mixed);

        // TreeSet is an implementation of red black tree
        // Find the depth of a tree using Reflection

        TreeMap<Integer,Object> millions = new TreeMap<>();
        List<Integer> values = IntStream.range(0,1_000_000).boxed().collect(Collectors.toList());
        Collections.shuffle(values,new Random(0));
       // IntStream.range(0,1_000_000).forEach(i -> millions.put(i,"dummy"));
        values.forEach(i-> millions.put(i,"dummy"));
        System.out.println("millions.size() = " + millions.size());
        Field parentField = null;
        LongAccumulator maxDepth = new LongAccumulator(Long::max,0);
        for (Map.Entry<Integer, Object> entry : millions.entrySet()) {

            if(parentField == null){
                parentField = entry.getClass().getDeclaredField("parent");
                parentField.setAccessible(true);
            }

            int level = 0;
            Object node = entry;
            while(node != null){
                level++;
                node = parentField.get(node);
            }
            maxDepth.accumulate(level);
        }
        System.out.println("maxDepth = " + maxDepth);
    }
}
