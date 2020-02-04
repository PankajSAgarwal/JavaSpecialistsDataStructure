import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Autumn");
        seasons.add("Winter");
        System.out.println("seasons.indexOf(\"Summer\") = " + seasons.indexOf("Summer"));
        
        seasons.remove("Summer");
        System.out.println("seasons.indexOf(\"Summer\") = " + seasons.indexOf("Summer"));
        System.out.println("seasons.contains(\"Summer\") = " + seasons.contains("Summer"));
        for (int i = 0; i <10_000 ; i++) {
            seasons.add("Pretty Warm");
        }
        System.out.println("seasons = " + seasons);
        seasons.removeIf(season -> seasons.equals("Pretty Warm"));
        seasons.trimToSize(); // do not use a lot
        seasons.clear(); // cost is more , so better user

    }
}
