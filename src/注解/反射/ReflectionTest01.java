package 注解.反射;

/**
 * 测试java.lang.Class对象的获取方式
 * @author huzhu
 * @date 2019-06-06 16:28
 */
@SuppressWarnings("all")
public class ReflectionTest01 {
    public static void main(String[] args) {
        String path = "注解.反射.User";

        try {
            Class clazz = Class.forName(path);
            System.out.println(clazz.hashCode());
            Class clazz2 = Class.forName(path);//同一个对象，只被加载一次
            System.out.println(clazz2.hashCode());

            Class strClazz = String.class;
            Class strClazz2 = path.getClass() ;
            System.out.println(strClazz == strClazz2);//true

            int[] arr1 =  new int[10];
            int[] arr2 = new int[20];
            System.out.println(arr1 == arr2);//false
            System.out.println(arr1.getClass().hashCode() == arr2.getClass().hashCode());//true

            double[] arr3 = new double[10];

            System.out.println(arr1.getClass().hashCode());
            System.out.println(arr2.getClass().hashCode());
            System.out.println(arr3.getClass().hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
