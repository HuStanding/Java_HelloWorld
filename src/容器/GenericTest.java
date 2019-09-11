package 容器;

import 面向对象2.MyInterfaceTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型测试
 * @author huzhu
 * @date 2019-04-12 13:43
 */
public class GenericTest {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<>();
        mc.set("胡著",0);
//        mc.set(123,1);//报错

        String a = (String) mc.get(0);
        Integer b = (Integer) mc.get(1);

        List list = new ArrayList();
    }
}


class MyCollection<T> {
    Object[] objects = new Object[5];

    public void set(T obj,int index){
        objects[index] = obj;
    }

    public Object get(int index){
        return objects[index];
    }

}
