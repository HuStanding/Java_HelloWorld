package 多线程.线程同步;

/**
 * 取钱线程不安全
 * @author huzhu
 * @date 2019-05-27 17:50
 */
public class UnsafeTest02 {
    public static void main(String[] args) {
        Account account = new Account(100,"小胡子");
        SafeDrawing you = new SafeDrawing(account,80,"你");
        SafeDrawing her = new SafeDrawing(account,90,"她");

        you.start();
        her.start();
    }
}


class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//模拟取款机取款
class Drawing extends Thread{
    Account account;
    int drawingMoney;
    int packetTotal;

    public Drawing(Account account, int drawingMoney,String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        test01();
    }

    public synchronized void test01(){
        if(account.money - drawingMoney < 0){
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money -= drawingMoney;
        packetTotal += drawingMoney;
        System.out.println(this.getName()+"-->"+"账户余额为："+account.money);
        System.out.println(this.getName()+"-->"+"口袋里的钱为："+packetTotal);
    }

}