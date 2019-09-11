package 面向对象2;

/**
 * @author huzhu
 * @date 2019-04-06 21:32
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        Outer2.Inner2 inner2 = new Outer2.Inner2();
    }
}


class Outer2 {
    static class Inner2 {

    }
}