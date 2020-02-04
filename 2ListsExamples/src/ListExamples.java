import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        //List<String> names = Arrays.asList("John","Anton","Pankaj");
        // List.of creates immutable list List.of is java9
        List<String> names = List.of("John","Anton");
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println("names = " + names);
        // List mutable
        //names.set(1,"Antony");
        System.out.println("names = " + names);
        // Imumutable
        // add gives UnsupportOperation exception
       // names.add("Dirk");
        //names.clear();

    }
}
