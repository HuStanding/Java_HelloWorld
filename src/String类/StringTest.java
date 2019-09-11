package String类;

/**
 * @author huzhu
 * @date 2019-04-06 21:40
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("huzhu");
        String str2 = new String("huzhu");

        System.out.println(str1.equals(str2));//true
        System.out.println(str1 == str2);//false


        String s1 = "core Java";
        String s2 = "Core Java";
        System.out.println(s1.charAt(3));//提取下标为3的字符
        System.out.println(s2.length());//字符串的长度
        System.out.println(s1.equals(s2));//比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2));//比较两个字符串（忽略大小写）
        System.out.println(s1.indexOf("Java"));//字符串s1中是否包含Java
        System.out.println(s1.indexOf("apple"));//字符串s1中是否包含apple
        String s = s1.replace(' ', '&');//将s1中的空格替换成&
        System.out.println("result is :" + s);
    }
}
