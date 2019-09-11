package 常用类;

/**
 * @author huzhu
 * @date 2019-04-07 17:19
 */
public class WrappedClassTest {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = Integer.valueOf("3");

        System.out.println(b);
    }
}
