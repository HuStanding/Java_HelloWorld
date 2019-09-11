package String类;

/**
 * StringBuilder测试
 * @author huzhu
 * @date 2019-04-07 21:03
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //线程不安全，但是速度快
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);

        sb.setCharAt(1,'d');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        for(int i = 0;i < 26;i++){
            sb2.append((char)('a' + i));
        }
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        sb2.setCharAt(2,'胡');
        System.out.println(sb2);
        sb2.insert(2,'我');
        System.out.println(sb2);
        sb2.delete(1,2);
        System.out.println(sb2);
    }
}
