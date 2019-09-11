package 多线程.线程同步;

/**
 * 同步块，目标更加明确
 * @author huzhu
 * @date 2019-05-29 22:58
 */
public class SynBlockTest01 {
    public static void main(String[] args) {
        Account account = new Account(1000,"小胡子");
        SafeDrawing you = new SafeDrawing(account,80,"你");
        SafeDrawing her = new SafeDrawing(account,90,"她");

        you.start();
        her.start();
    }
}

//模拟取款机取款，线程安全
class SafeDrawing extends Thread{
    Account account;
    int drawingMoney;
    int packetTotal;

    public SafeDrawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        test01();
    }

    public void test01(){
        //提高性能
        if(account.money <= 0){return;}
        synchronized (account){
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
        }//到这里释放锁
    }
}