package 容器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author huzhu
 * @date 2019-04-30 22:22
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i = 0;i < 10; i++){
            list.add("hu" + i);
        }
        System.out.println(list);

        Collections.shuffle(list);//随机打乱顺序
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"hu5"));//二分查找
    }
}
