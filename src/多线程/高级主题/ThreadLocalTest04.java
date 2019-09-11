package 多线程.高级主题;

/**
 * InheritableThreadLocal：继承上下文 环境
 * @author huzhu
 * @date 2019-06-04 17:13
 */
public class ThreadLocalTest04 {

    private static ThreadLocal<Integer> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set(2);
        System.out.println(Thread.currentThread().getName() + "-->" + threadLocal.get());

        //线程由main开辟
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "-->" + threadLocal.get());
            threadLocal.set(100);
            System.out.println(Thread.currentThread().getName() + "-->" + threadLocal.get());
        }).start();
    }


}
