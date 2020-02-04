import java.util.*;

public class VectorExamples {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(Arrays.asList("John","Anton","Pankaj"));

        //Better way to

        List<String> nameSafe = Collections.synchronizedList(
                new ArrayList<>(
                        Arrays.asList("John","Anton","Pankaj")));
    }
}
