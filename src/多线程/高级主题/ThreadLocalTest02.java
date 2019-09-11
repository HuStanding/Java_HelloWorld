package 多线程.高级主题;

/**
 * ThreadLocal：每个线程自己的数据，不会影响其他的线程
 * @author huzhu
 * @date 2019-06-04 17:13
 */
public class ThreadLocalTest02 {

    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new MyRun()).start();
        }
    }

    public static class MyRun implements Runnable {
        @Override
        public void run() {
            Integer left = threadLocal.get();
            System.out.println(Thread.currentThread().getName() + "得到了-->" + threadLocal.get());

            threadLocal.set(left - 1);
            System.out.println(Thread.currentThread().getName() + "还剩下-->" + threadLocal.get());
        }
    }

}
