package 面向对象;

/**
 * @author huzhu
 * @date created in 2019-03-30 11:29
 */
public class PolymorphicTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);

        Animal dog = new Dog();  //向上转型
        animalCry(dog);
        ((Dog) dog).seeDoor(); //可以使用
//        dog.seeDoor();  //不可以使用

        Animal cat = new Cat();
        animalCry(cat);

        Dog dog2 = (Dog)dog;
        dog2.seeDoor();  //可以使用

//        Dog dog3 = (Dog)cat;
//        dog3.seeDoor();  //编译可以通过，但是不能运行，类型转换错误
    }


    static void animalCry(Animal a){
        a.shout();
    }
}



class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵！");
    }
}