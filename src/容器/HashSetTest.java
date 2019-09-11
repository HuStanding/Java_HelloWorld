package 容器;

import java.util.HashSet;
import java.util.Set;

/**
 * @author huzhu
 * @date 2019-04-29 22:30
 */
public class HashSetTest {
    public static void main(String[] args) {
        //其实是简化版的hashmap
        Set<String> set1 = new HashSet<>();
        set1.add("aa");
        set1.add("bb");
        set1.add("aa");

        System.out.println(set1);


        Set<String> set2 = new HashSet<>();
        set2.add("hu");
        set2.addAll(set1);
        System.out.println(set2);
    }
}

