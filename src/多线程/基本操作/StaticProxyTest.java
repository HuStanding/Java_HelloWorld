package 多线程.基本操作;

/**
 * 静态代理
 * @author huzhu
 * @date 2019-05-02 14:03
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();
    }
}


interface Marry{
    void happyMarry();
}

class You implements Marry{
    @Override
    public void happyMarry() {
        System.out.println("you and change 奔月");
    }
}

//代理角色
class WeddingCompany implements Marry{
    private Marry target;
    public WeddingCompany(Marry marry){
        this.target = marry;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }

    private void ready(){
        System.out.println("布置房间");
    }
    private void after(){
        System.out.println("闹洞房");
    }
}