import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"ajay");
        map.put(102,"ajayk");
        map.put(100,"ajayh");
        map.put(104,"ajayl");
        map.put(101,"ajad");
        map.put(103,"ajas");
        System.out.println(map);
       // Set set = map.keySet();
        //System.out.println(set);
        Collection<String> value = map.values();
        System.out.println(value);
        //String v1 = map.get(v1);
    }
}
