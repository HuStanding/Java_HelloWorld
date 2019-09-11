package 容器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用增强for循环不可以使用add、remove
 * @author huzhu
 * @date created in 2019-03-10 23:00
 * @explaination
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        for(String item : list){
            System.out.print(item + " ");
        }
        System.out.println();

        //增强循环删除
//        for(String item : list){
//            if("a".equals(item)){
//                list.remove(item);//出现异常
//            }
//        }

        //反编译结果
        Iterator iterator1 = list.iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            String item = (String)iterator1.next();
            if("a".equals(item))
                list.remove(item);
        } while(true);

//        //普通循环删除
//        for(int i = 0; i < list.size();i++){
//            if("a".equals(list.get(i))){
//                list.remove(i);//出现异常
//            }
//        }

        for(String item : list){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
