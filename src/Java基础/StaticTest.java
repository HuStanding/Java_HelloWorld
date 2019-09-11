package Java基础;

/**
 * @author huzhu
 * @date created in 2019-03-09 16:26
 * @explaination
 */
public class StaticTest {

    static String a = "";

    StaticTest(){
        System.out.println("构造函数");
    }
    //静态语句初始快
    static{
        System.out.println("执行类的初始化工作");
        a = "a";
        staticFun();
    }

    public static void staticFun(){
//        nonStaticFun(); 不能使用费静态函数
        System.out.println("this is static method");
    }

    public void nonStaticFun(){
        System.out.println("this is non static method");
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        staticTest.nonStaticFun();
        StaticTest.a = "new static family";
        StaticTest.staticFun();
    }
}
