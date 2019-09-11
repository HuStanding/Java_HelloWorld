package 多线程.线程状态;

/**
 * 插队
 * @author huzhu
 * @date 2019-05-26 16:03
 */
public class BlockedJoin01 {
    public static void main(String[] args) throws InterruptedException {
//        MyYield my = new MyYield();
//        new Thread(my,"a").start();
//        new Thread(my,"b").start();
        Thread t = new Thread(()->{
            for(int i = 0;i < 100;i++){
                System.out.println("lambda..." + i);
            }
        });
        t.start();

        for(int i = 0;i < 100;i++){
            if(i == 20){
                t.join(); //插队进来,main被阻塞了，需要lambda执行完才可以执行
            }
            System.out.println("main..." + i);
        }
    }
}

