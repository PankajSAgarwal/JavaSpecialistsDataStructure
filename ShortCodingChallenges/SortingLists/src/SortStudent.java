import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStudent {

    public static void main(String[] args) {

        List<Student> names = new ArrayList<>(Arrays.asList(
                new Student(1,"John",56),
                new Student(2,"John",86),
                new Student(3,"Pankaj",72),
                new Student(3,"Anton",52)
                ));



        // sort names by best grade , name and then year. Easier way in Java 8
        names.sort(
                Comparator.comparingDouble(Student::getAverage)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getYear)
        );


        // Another way to write above code using type witness

//        names.sort(
//                Comparator.<Student>comparingDouble(s->s.getAverage())
//                .reversed()
//                .thenComparing(s->s.getName())
//                .thenComparingInt(s->s.getYear())
//        );

        // Third way to write above code using casting

//        names.sort(
//                Comparator.comparingDouble((Student s)->s.getAverage())
//                .reversed()
//                .thenComparing(s->s.getName())
//                .thenComparing(s->s.getYear())
//        );

        System.out.println(names);
    }
}
