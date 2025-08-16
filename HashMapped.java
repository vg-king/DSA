import java.util.*;
public class HashMapped {
    
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("Us", 30);
        map.put("china", 150);

        System.out.println(map);
        if (map.containsKey("china")) {
            System.out.println(true);
        }
        System.out.println(map.get("china"));
        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
    }
}
