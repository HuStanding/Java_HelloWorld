package 面向对象2;

/**
 * @author huzhu
 * @date 2019-04-06 21:20
 */
public class InterfaceTest2 {
}


interface A {
    void testa();
}
interface B {
    void testb();
}
/**接口可以多继承：接口C继承接口A和B*/
interface C extends A, B {
    void testc();
}

class MySubClass implements C {
    public void testc() {
    }
    public void testa() {
    }
    public void testb() {
    }
}