package 面向对象;

/**
 * @author huzhu
 * @date created in 2019-03-29 23:49
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        Human human = new Human();
//        human.age = 13;  //不可见
    }
}

class Human{
    private int age;
    String name;
    protected String sex;
    public String height;
    void sayAge(){
        System.out.println(age);
    }
}

class Boy{
    void sayHello(){
//        System.out.println(age);//无法使用
    }
}
