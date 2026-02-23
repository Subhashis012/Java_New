package Java.CollectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    static void main() {
       Map<String, Integer> map = new IdentityHashMap<>();
     //   Map<String, Integer> map = new HashMap<>();
        String key1 = new String("Akshit");
        String key2 = new String("Akshit");
        map.put(key1, 90);
        map.put(key2, 92);
        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}
