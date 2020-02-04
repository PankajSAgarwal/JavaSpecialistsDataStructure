import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {

        List<Student> names= new ArrayList<>(Arrays.asList(
           new Student(1,"John",56.0),
           new Student(2,"John",86.0),
           new Student(3,"Pankaj",72.0),
           new Student(3,"Anton",52.0)
        ));

        names.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int result = s1.getName().compareTo(s2.getName());
                return result != 0 ?result: Integer.compare(s1.getYear(),s2.getYear());
            }
        });
        System.out.println(names);
        // sort by grade

        // New way of comparing

        names.sort(Comparator.comparingDouble(Student::getAverage)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getYear)
        );

        System.out.println(names);

        // Old way , a bit messy
//        names.sort((s1,s2) -> {
//
//            int result = Double.compare(s1.getAverage(),s2.getAverage());
//            if(result == 0){
//                result = s1.getName().compareTo(s2.getName());
//            }
//           if(result == 0){
//               result = Integer.compare(s1.getYear(),s2.getYear());
//           }
//           return result;
//        });
       // System.out.println(names);

        List<Integer> numbers = fillWithLotOfRandomNumbers();
        for (int i = 0; i < 10; i++) {

            testSortingSpeed(numbers);

        }

    }

    private static void testSortingSpeed(List<Integer> numbers) {
        List<Integer> arrayList = new ArrayList<>(numbers);
       // List<Integer> linkedList = new LinkedList<>(numbers);
       // List<Integer> cowList = new CopyOnWriteArrayList<>(numbers);
        List<Integer> parallelSortingArrayList = new ParallelSortingArrayList<>(numbers);
        sortList(arrayList);
        //sortList(linkedList);
        //sortList(cowList);
        sortList(parallelSortingArrayList);
        System.out.println("Already sorted");
        for (int i = 0; i <5 ; i++) {
            sortList(arrayList);
           // sortList(linkedList);
            //sortList(cowList);
            sortList(parallelSortingArrayList);
        }
    }



    private static void sortList(List<Integer> list) {

        long time = System.currentTimeMillis();
        list.sort(null);
        time = System.currentTimeMillis() - time;
        System.out.println(list.getClass().getSimpleName() + " time = " + time);
    }

    private static List<Integer> fillWithLotOfRandomNumbers() {
        return ThreadLocalRandom.current().ints(10_000_000).parallel().boxed()
                .collect(Collectors.toList());
    }
}
