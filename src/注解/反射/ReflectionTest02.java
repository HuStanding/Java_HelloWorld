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
public class ReflectionTest02 {
    public static void main(String[] args) {
        String path = "注解.反射.User";

        try {
            //获取类的信息
            Class clazz = Class.forName(path);
            System.out.println(clazz.getName());
            System.out.println(clazz.getSimpleName());

            //获取属性信息
            Field[] fields = clazz.getFields();//只能获得public的field
            Field[] fields2 = clazz.getDeclaredFields();//获取所有的属性
            System.out.println(fields.length);
            System.out.println(fields2.length);
            for (Field field : fields2) {
                System.out.println("属性："+field);
            }
            //获取方法信息
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("方法：" + method);
            }
            //获取构造器的信息
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("构造器：" + constructor);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
