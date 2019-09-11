package Java基础;

/**
 * @author huzhu
 * @date created in 2019-03-06 22:38
 * @explaination
 */
public class DataTypeTest {
    public static void main(String[] args) {
        Integer m = 125;
        Integer n = 125;
        Integer m2 = 225;
        Integer n2 = 225;
        System.out.println(m == n);   //true，使用缓存池对象
        System.out.println(m2 == n2);   //false

        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y); // false
        int z = new Integer(123);
        System.out.println(x == z);  //true

        short s1 = 1;
        // s1 = s1 + 1;   //类型错误
        s1 += 1;   //正确

    }
}
