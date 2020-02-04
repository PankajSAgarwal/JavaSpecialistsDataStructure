import java.util.*;

public class TreeMapExamples {

    private static class Person implements Comparable<Person>{
        private final String name;
        private final int day;
        private final int month;
        private final int year;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int hashCode(){
            return (name.hashCode() << 16) ^ (day << 12) ^ (month << 8) ^ year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return day == person.day &&
                    month == person.month &&
                    year == person.year &&
                    name.equals(person.name);
        }


        @Override
        public int compareTo(Person o) {
            return NATURAL_ORDER.compare(this,o);
        }

        public static final Comparator<Person> NATURAL_ORDER =
                Comparator.<Person,String>comparing(p->p.name)
                .thenComparing(p->p.year)
                .thenComparing(p->p.month)
                .thenComparing(p->p.day);
    }
    public static void main(String[] args) {

        Map<String,Integer> numbers = new TreeMap<>(
          Comparator.comparing(String::length)
        );

        // Returns numbers = {one=2, unlucky=16}
       // numbers.putAll(Map.of("one",1,"two",2,"sixteen",16,"unlucky",13));

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("sixteen",16);
        numbers.put("unlucky",13);
        // returns numbers = {one=2, sixteen=13}
        // Tree map is sorted by keys , if same hashcode for key ,
        // then key doesn't get replaced but values gets replaced
        System.out.println("numbers = " + numbers);

        Map<String, List<Integer>> superstition = new TreeMap<>();
        add(superstition,"unlucky",13);
        add(superstition,"unlucky",7);
        add(superstition,"unlucky",3);
        add(superstition,"lucky",65);
        add(superstition,"lucky",60);
        add(superstition,"lucky",5);

        superstition.forEach((k,v)-> System.out.println(k + "->" + v));
    }

    private static void add(Map<String, List<Integer>> superstition, String key, int number) {

        superstition.computeIfAbsent(key,k->new ArrayList<>()).add(number);
    }
}
