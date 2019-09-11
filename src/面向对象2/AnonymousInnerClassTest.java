package 面向对象2;

/**
 * @author huzhu
 * @date 2019-04-06 21:35
 */
public class AnonymousInnerClassTest {

    public static void test01(AA a){
        a.aa();
    }

    public static void main(String[] args) {
        AnonymousInnerClassTest.test01(new AA() {
            @Override
            public void aa() {
                System.out.println("AnonymousInnerClassTest.aa");
            }
        });
    }
}


interface AA {
    void aa();

}