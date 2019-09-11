package 多线程.线程状态;

/**
 * 模拟网络延时
 * @author huzhu
 * @date 2019-05-26 15:41
 */
public class BlockedSleep01 {
    public static void main(String[] args) {
        //一份资源
        WebTicket web = new WebTicket();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web,"马处").start();
        new Thread(web,"码农").start();
        new Thread(web,"蚂蟥").start();
    }

}

class WebTicket implements Runnable {
    private int ticketNums = 99;

    @Override
    public void run() {
        while (true) {
            if (ticketNums < 0) {
                break;
            }
            //模拟延时
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
        }
    }
}