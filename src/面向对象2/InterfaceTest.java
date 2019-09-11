package 面向对象2;

/**
 * @author huzhu
 * @date 2019-04-06 21:13
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Volant volant = new Angel();
        volant.fly();

        Honest honest = new GoodMan();
        honest.helpOther();
    }
}

/*飞行接口*/
interface Volant{
    int FLY_HEIGHT = 1000;
    void fly();
}

/*善良接口*/
interface Honest{
    void helpOther();
}

/*子类实现多个接口*/
class Angel implements Volant, Honest{
    @Override
    public void fly() {
        System.out.println("Angel.fly()");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther()");
    }
}

/*子类*/
class GoodMan implements Honest {
    @Override
    public void helpOther() {
        System.out.println("GoodMan.helpOther()");
    }
}

/*子类*/
class BirdMan implements Volant {
    @Override
    public void fly() {
        System.out.println("BirdMan.fly()");
    }
}