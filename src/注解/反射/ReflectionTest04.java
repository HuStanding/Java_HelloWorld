package 注解.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射方法降低了运行效率
 * 测试java.lang.Class对象的获取方式
 * @author huzhu
 * @date 2019-06-06 16:28
 */
@SuppressWarnings("all")
public class ReflectionTest04 {
    public static void main(String[] args) throws Exception {
        String path = "注解.反射.User";
        test01();
        test02();
        test03();
    }

    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for(int i = 0;i < 1000000000L;i++){
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法调用，执行10亿次，耗时："+(endTime-startTime)+"ms");
    }

    public static void test02() throws Exception {
        User user = new User();
        Class clazz = user.getClass();
        Method method = clazz.getDeclaredMethod("getName",null);
        long startTime = System.currentTimeMillis();
        for(int i = 0;i < 1000000000L;i++){
            method.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射动态方法调用，执行10亿次，耗时："+(endTime-startTime)+"ms");
    }

    public static void test03() throws Exception {
        User user = new User();
        Class clazz = user.getClass();
        Method method = clazz.getDeclaredMethod("getName",null);
        method.setAccessible(true);//跳过安全检查
        long startTime = System.currentTimeMillis();
        for(int i = 0;i < 1000000000L;i++){
            method.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射动态方法调用，跳过安全检查，执行10亿次，耗时："+(endTime-startTime)+"ms");
    }


}
