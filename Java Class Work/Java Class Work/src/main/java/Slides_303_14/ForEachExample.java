package Slides_303_14;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
       names.add("Larry");
        names.add("Steve");
       names.add("James");
        names.add("Conan");
       names.add("Ellen");

       // printing all the names
       names.forEach(name -> {
        System.out.println(name);

       });

       System.out.println("====================");

        // printing all names in the list with a new style for loop
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("====================");

        // Using lambda to remove items from the list
        //names = names.stream().filter(name -> !name.startsWith("E")).collect(Collectors.toList));
    }
}
