package 容器;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author huzhu
 * @date 2019-04-29 22:38
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(1);

        System.out.println(treeSet);

    }
}
