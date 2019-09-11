package 面向对象2;

/**
 * 为子类提供统一规范的模板
 * @author huzhu
 * @date 2019-04-06 20:38
 * @params
 * @return
*/
public abstract class Animal{
    //第一：没有实现，第二：子类必须实现
    abstract public void shut();
    
    public void run(){
        System.out.println("跑！");
    }

    public static void main(String[] args) {
        Animal a = new Dog();  //可以new子类对象
    }
}


class Dog extends Animal{
    @Override
    public void shut(){
        System.out.println("汪汪汪！");
    }
}

