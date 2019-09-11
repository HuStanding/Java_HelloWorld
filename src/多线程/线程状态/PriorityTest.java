package 多线程.线程状态;

/**
 * 线程的优先级，不代表绝对的先后顺序，只代表概率
 * @author huzhu
 * @date 2019-05-26 16:52
 */
public class PriorityTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());//默认是5

        MyPriority mp = new MyPriority();
        Thread t1 = new Thread(mp);
        Thread t2 = new Thread(mp);
        Thread t3 = new Thread(mp);
        Thread t4 = new Thread(mp);
        Thread t5 = new Thread(mp);
        Thread t6 = new Thread(mp);

        //设置优先级在启动前
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}


class MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
        Thread.yield();
    }
}