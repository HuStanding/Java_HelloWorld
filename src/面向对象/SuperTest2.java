package 面向对象;

public class SuperTest2 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象......");
        new ChildClass();
    }
}
class FatherClass {
    public FatherClass() {
        System.out.println("创建FatherClass");
    }
}
class ChildClass extends FatherClass {

    public ChildClass() {
        super();   //默认会自动执行
        System.out.println("创建ChildClass");
    }
}