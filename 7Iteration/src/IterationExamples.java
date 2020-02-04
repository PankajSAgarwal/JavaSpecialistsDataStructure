import java.util.*;

public class IterationExamples {

    public static void main(String[] args) {
        // old fashioned before ArrayList

        Vector<String> names = new Vector<>(Arrays.asList("John","Anton","Pankaj"));
        Enumeration<String> en = names.elements();

        while(en.hasMoreElements()){

            String name = en.nextElement();
            if(name.contains("o")){
                // This just removes John but not Anton,why ?
                // This is a bug that's why Iterator where introduced which is a failfast way
                names.remove(name);
            }
        }

        System.out.println("names = " + names);

        // ArrayList removed the bug in Vector by introducing iterator which is failfast
        // and gives concurrent hasmap modification error on failure .
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("John","Anton","Pankaj"));

        // 1. Iterating arraylist using iterator

        /*Iterator<String> iter = names2.iterator();

        while(iter.hasNext()){

            String name2 = iter.next();
            // Concurrent Hashmap modification error , you cannot change a ArrayList while iterating
            // fail fast
            if(name2.contains("o")){
                names2.remove(name2);
            }

        }*/

        // 2. Iterating using forEach
        names2.forEach(name -> {
            if(name.contains("o")){
                names2.remove(name);
            }
        });
        System.out.println("names2 = " + names2);
    }
}
