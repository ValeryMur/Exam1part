package exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by valeria on 18.11.2016.
 */
public class IteratorMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Monday");
        map.put(2, "Thusday");
        map.put(3, "Wensday");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer, String >pair=iterator.next();
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ". " + value);
        }

// пример перебора коллекции циклом foreach
        for(Map.Entry<Integer, String >pair: map.entrySet()){
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ". " + value);
        }

    }


}
