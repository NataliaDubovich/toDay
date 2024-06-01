import org.w3c.dom.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        Map <String, String> capitals = new HashMap<>();

capitals.put("Germany","Berlin");
capitals.put("Ukraine","Kiev");
capitals.put("Spain","Madrid");

            String germany = capitals.get("Germany");
        System.out.println("Germany capital is "+germany);
        System.out.println(capitals);
        System.out.println("Size = "+capitals.size());
        System.out.println(capitals.remove("Ukraine"));
        System.out.println(capitals);

            Set<String> keySet = capitals.keySet();
        System.out.println(keySet);

            Collection<String> value = capitals.values();
        System.out.println(value);

            capitals.clear();
        System.out.println(capitals);
        }
    }





