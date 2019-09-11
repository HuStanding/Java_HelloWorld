package 多线程.基本操作;

/**
 * 模拟火车票抢票
 * @author huzhu
 * @date 2019-05-02 11:04
 */
public class Web12306 implements Runnable{
    private int ticketNums = 99;
    @Override
    public void run() {
        while(true){
            if(ticketNums < 0){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
        }
    }

    public static void main(String[] args) {
        //一份资源
        Web12306 web = new Web12306();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web,"马处").start();
        new Thread(web,"码农").start();
        new Thread(web,"蚂蟥").start();
    }
}
