package String类;

/**
 * @author huzhu
 * @date 2019-04-06 22:51
 */
public class StringTest2 {
    public static void main(String[] args) {
        String s = "";
        String s1 = "How are you?";
        System.out.println(s1.startsWith("How"));//是否以How开头
        System.out.println(s1.endsWith("you"));//是否以you结尾
        s = s1.substring(4);//提取子字符串：从下标为4的开始到字符串结尾为止
        System.out.println(s);
        s = s1.substring(4, 7);//提取子字符串：下标[4, 7) 不包括7
        System.out.println(s);
        s = s1.toLowerCase();//转小写
        System.out.println(s);
        s = s1.toUpperCase();//转大写
        System.out.println(s);
        String s2 = "  How old are you!! ";
        s = s2.trim();//去除字符串首尾的空格。注意：中间的空格不能去除
        System.out.println(s);

        String str1 = "hello" + " java";//相当于str1 = "hello java";
        String str2 = "hello java";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = " java";
        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false
        System.out.println(str2.equals(str5));//true
    }
}
