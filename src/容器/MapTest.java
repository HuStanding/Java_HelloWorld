package 容器;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huzhu
 * @date 2019-04-18 21:50
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        System.out.println(map.get(1));
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("four"));

        Map<Integer,String> map2 = new HashMap<>();
        map.put(4,"四");
        map.put(5,"五");

        map.putAll(map2);
        System.out.println(map);

        map.put(3,"三");
        System.out.println(map);//覆盖的情况
    }
}
