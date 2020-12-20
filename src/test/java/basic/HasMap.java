package basic;

import java.util.HashMap;
import java.util.Map;

public class HasMap {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"kkkk");
        map.put(2,"abc");
        map.put(3,"xyz");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get((3)));
        System.out.println(map.size());
    }
}
