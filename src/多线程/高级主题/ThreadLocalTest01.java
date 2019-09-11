package 多线程.高级主题;

/**
 * ThreadLocal:每个线程自身的存储本地、局部区域
 * get/set/initialvalue
 * @author huzhu
 * @date 2019-06-04 17:00
 */
public class ThreadLocalTest01 {
    //默认初始值
    //private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    //更改初始化值
//    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
//        @Override
//        protected Integer initialValue() {
//            return 200;
//        }
//    };

    //JDK8之后简易方法
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(()->{
        return 100;
    });


    public static void main(String[] args) {
        //获取值
        System.out.println(Thread.currentThread().getName()+"-->"+ threadLocal.get());
        //更改值
        threadLocal.set(99);
        System.out.println(Thread.currentThread().getName()+"-->"+ threadLocal.get());

        new Thread(new MyRun()).start();
        new Thread(new MyRun()).start();
    }

    public static class MyRun implements Runnable{
        @Override
        public void run() {
            threadLocal.set((int)(Math.random()*100));
            System.out.println(Thread.currentThread().getName()+"-->"+ threadLocal.get());

        }
    }
}
