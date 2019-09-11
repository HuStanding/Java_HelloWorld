package 多线程.线程同步;

/**
 * 线程安全:并发的时候保证数据的准确性
 * synchronized
 * @author huzhu
 * @date 2019-05-27 17:28
 */
public class SynBlockTest03 {
    public static void main(String[] args) {
        Web12306SynBlock web = new Web12306SynBlock();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web, "马处").start();
        new Thread(web, "码农").start();
        new Thread(web, "蚂蟥").start();
    }
}


class Web12306SynBlock implements Runnable {
    private int ticketNums = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            //模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            test01();
//            test02();
            test03();
        }
    }


    //线程安全，同步方法
    public synchronized void test01() {
        if (ticketNums <= 0) {
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

    //线程安全，同步块
    public void test02() {
        synchronized (this) {
            if (ticketNums <= 0) {
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

    //线程安全，同步块
    public void test03() {
        //考虑最后一张票
        if (ticketNums <= 0) {
            flag = false;
            return;
        }
        synchronized (this) {
            //考虑最后一张票
            if (ticketNums <= 0) {
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
}