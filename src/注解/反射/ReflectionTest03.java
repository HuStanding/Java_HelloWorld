package 注解.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 测试java.lang.Class对象的获取方式
 * @author huzhu
 * @date 2019-06-06 16:28
 */
@SuppressWarnings("all")
public class ReflectionTest03 {
    public static void main(String[] args) {
        String path = "注解.反射.User";

        try {
            Class<User> clazz = (Class<User>)Class.forName(path);

            //通过反射API调用构造方法
            User user = clazz.newInstance();//必须要有无参数的构造器
            System.out.println(user);

            Constructor<User> c = clazz.getDeclaredConstructor(int.class,String.class,int.class);
            User user2 = c.newInstance(1001,"huzhu",24);//有参构造器
            System.out.println(user2.getName());

            //通过反射API调用普通方法
            User user3 = clazz.newInstance();
            Method method = clazz.getDeclaredMethod("setName", String.class);
            method.invoke(user3,"小胡子");
            System.out.println(user3.getName());

            //通过反射API操作属性
            User user4 = clazz.newInstance();
            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);//这个属性不需要做安全检查，可以直接访问
            field.set(user4,"这是第四个");
            System.out.println(user4.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
