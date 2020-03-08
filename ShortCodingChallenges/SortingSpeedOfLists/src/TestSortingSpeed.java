import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class TestSortingSpeed {

    public static void main(String[] args) {
        List<Integer> numbers = fillWithLotsOfRandomValues();
        for (int i = 0; i < 10; i++) {
            
            testingSortSpeed(numbers);
            
        }
    }

    private static void testingSortSpeed(List<Integer> numbers) {

        List<Integer> arrayList = new ArrayList<>(numbers);
        List<Integer> linkedList = new LinkedList<>(numbers);
        List<Integer> cowList = new CopyOnWriteArrayList<>(numbers);

        sortList(arrayList);
        sortList(linkedList);
        sortList(cowList);
        System.out.println("---------------------------------");
        System.out.println("Sorting an already sorted List");
        sortList(arrayList);
        sortList(linkedList);
        sortList(cowList);
        System.out.println("---------------------------------");
    }

    private static void sortList(List<Integer> list) {
        long time = System.currentTimeMillis();
        list.sort(null); // null specifies natural order sort
        time = System.currentTimeMillis() - time;
        System.out.println(list.getClass().getSimpleName() + " time = " +time);

    }

    private static List<Integer> fillWithLotsOfRandomValues() {
        return ThreadLocalRandom.current().ints(10_000_000).parallel()
                .boxed().collect(Collectors.toList());
    }
}
