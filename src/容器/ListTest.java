package 容器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author huzhu
 * @date 2019-04-12 13:58
 */
public class ListTest {
    public static void main(String[] args) {
        test03();
    }

    public static void test01() {
        Collection<String> c = new ArrayList<>();

        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("第一个");
        c.add("第二个");
        System.out.println(c.contains("第一个"));
        Object objs = c.toArray();
        System.out.println(objs);
        c.remove("第一个");
        System.out.println(c);

        c.clear();
        System.out.println(c.size());
    }

    public static void test02() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("d");
        list2.add("e");

//        list1.removeAll(list2);//移除所有相交的元素
//        list1.addAll(list2);//全部相加
        list1.retainAll(list2);//只保留相交的元素

        System.out.println("list01 : " + list1);

        System.out.println(list1.containsAll(list2));  //1是否包含了2的全部元素

    }

    public static void test03() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(2,"胡著");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,"小胡子");
        System.out.println(list);

        System.out.println(list.get(2));

        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list);
        System.out.println(list.indexOf("B"));
        System.out.println(list.lastIndexOf("B"));
    }
}
