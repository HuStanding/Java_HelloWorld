package 面向对象;

/**
 * @author huzhu
 * @date created in 2019-03-29 22:35
 * @explaination
 */
public class ObjectTest {
    public static void main(String[] args) {
//        Object oj;
        ObjectTest objectTest = new ObjectTest();
        System.out.println(objectTest.toString());   //覆盖了父类的方法

        Person2 person2 = new Person2("李明",18);
        System.out.println(person2.toString());

    }

    public String toString(){
        return "override test";
    }
}


class Person2{
    String name;
    int age;

    @Override
    public String toString(){
        return name + " " + age;
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}