package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ASUS PC on 20.11.2016.
 */
public class SortListName {
    public static void main(String[] args) throws Exception {
        List<String> names = new ArrayList<>();
        names.add("Oksana");
        names.add("Oleg");
        names.add("Alex");
        names.add("Paul");
        names.add("Ivan");
        names.add("Olga");
        names.add("Elena");
        names.add("Stepan");
        names.add("Dean");
        names.add("Sam");
        Collections.sort(names);
        System.out.println(names);

    }
}
