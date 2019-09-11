package 面向对象;

/**
 * @author huzhu
 * @date created in 2019-03-29 23:05
 */
public class SuperTest1 {
    public static void main(String[] args) {
        new Child().fun();
    }
}


class Father{
    public int value;
    public void fun(){
        value = 100;
        System.out.println("Father.value = " + value);
    }
}

class Child extends Father{
    public int value;
    public void fun(){
        super.fun();
        value = 200;
        System.out.println("Child.value = " + value);
        System.out.println(value);
        System.out.println(super.value);
    }
}

