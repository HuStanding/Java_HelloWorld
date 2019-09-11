//多态性

public class Polymorphism {
}


abstract class Animal2 {
    abstract void eat();
}

class Cat extends Animal2 {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog2 extends Animal2 {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}