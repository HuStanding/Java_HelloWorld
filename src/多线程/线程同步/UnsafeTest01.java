package 多线程.线程同步;

/**
 * 线程不安全
 * @author huzhu
 * @date 2019-05-27 17:28
 */
public class UnsafeTest01 {
    public static void main(String[] args) {
        Web12306Unsafe web = new Web12306Unsafe();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web, "马处").start();
        new Thread(web, "码农").start();
        new Thread(web, "蚂蟥").start();
    }
}


class Web12306Unsafe implements Runnable {
    private int ticketNums = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            test01();
        }
    }


    public void test01() {
        if (ticketNums < 0) {
            flag = false;
            return;
        }
        //模拟延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
    }
}