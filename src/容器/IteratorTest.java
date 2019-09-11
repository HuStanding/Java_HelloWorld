package 容器;

import java.util.*;

/**
 * @author huzhu
 * @date 2019-04-30 17:52
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            String temp = iter.next();
            System.out.println(temp);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");

        Set<Map.Entry<Integer, String>> ss = map.entrySet();
        for (Iterator<Map.Entry<Integer, String>> iter = ss.iterator(); iter.hasNext(); ) {
            Map.Entry<Integer, String> temp = iter.next();
            System.out.println(temp.getKey() + "--" + temp.getValue());
        }


        Set<Integer> keySet = map.keySet();
        for (Iterator<Integer> iter = keySet.iterator(); iter.hasNext(); ) {
            Integer key = iter.next();
            System.out.println(key + "--" + map.get(key));
        }

    }
}
