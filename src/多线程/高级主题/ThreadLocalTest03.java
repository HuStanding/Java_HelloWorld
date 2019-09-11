package 多线程.高级主题;

/**
 * ThreadLocal：分析上下文 环境
 * @author huzhu
 * @date 2019-06-04 17:13
 */
public class ThreadLocalTest03 {

    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

    public static void main(String[] args) {
        new Thread(new MyRun()).start();
        new Thread(new MyRun()).start();
    }

    public static class MyRun implements Runnable {

        public MyRun(){
            threadLocal.set(100);
            System.out.println(Thread.currentThread().getName() + "-->" + threadLocal.get());
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "-->" + threadLocal.get());
        }
    }

}
