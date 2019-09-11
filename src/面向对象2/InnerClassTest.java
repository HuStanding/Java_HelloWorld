package 面向对象2;

/**
 * 非静态内部类
 * @author huzhu
 * @date 2019-04-06 21:25
 */
public class InnerClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}


class Outer{
    private int age = 10;
    public void testOuter(){

    }

    class Inner{
        int age = 20;
        public void show(){
            System.out.println("外部类的成员变量" + Outer.this.age);
            System.out.println("内部类的成员变量" + age);
        }
    }
}