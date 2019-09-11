package 多线程.线程状态;

import 面向对象2.MyInterfaceTest;

/**
 * yield礼让线程，暂停线程，直接进入就绪状态而不是阻塞状态
 * @author huzhu
 * @date 2019-05-26 16:03
 */
public class YieldDemo01 {
    public static void main(String[] args) {
//        MyYield my = new MyYield();
//        new Thread(my,"a").start();
//        new Thread(my,"b").start();
        new Thread(()->{
            for(int i = 0;i < 100;i++){
                System.out.println("lambda..." + i);
            }
        }).start();

        for(int i = 0;i < 100;i++){
            if(i % 20 == 0){
                Thread.yield();
            }
            System.out.println("main..." + i);
        }
    }
}

class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "--end");
    }
}
