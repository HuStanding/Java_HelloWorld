package 面向对象2;

/**
 * @author huzhu
 * @date 2019-04-06 20:40
 */
public interface MyInterfaceTest {
    //所有方法都是抽象方法,只定义规范

    //默认public abstract
    void test01();

}


class MyClass implements MyInterfaceTest{

    @Override
    public void test01() {
        System.out.println("MyClass.Test01()");
    }
}