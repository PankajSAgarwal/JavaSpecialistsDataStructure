import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
    To remove exceptions of ConcurrentHashMap modifcation
    while itearting and modifying a list , we use CopyOnWrite ArrayList
 */
public class COWIterationExamples {

    public static void main(String[] args) {

        List<String> names = new CopyOnWriteArrayList<>(Arrays.asList("John","Anton","Pankaj"));
        //names.sort(null);
        Collections.sort(names);
        System.out.println("names = " + names);
        /*names.forEach(name->{

            System.out.println("Checking for name = " + name);
            
            if(name.contains("o")){
                names.remove(name);
            }
        });*/

        for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
            String name =  iterator.next();
            if(name.contains("o")){
                names.remove(name);
            }
            
        }
        System.out.println("names = " + names);
    }
    




}
