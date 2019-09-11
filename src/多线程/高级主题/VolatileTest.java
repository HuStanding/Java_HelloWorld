package 多线程.高级主题;

import sun.awt.windows.ThemeReader;

/**
 * volatile保证数据的同步，也就是可见性
 * @author huzhu
 * @date 2019-06-04 16:11
 */
public class VolatileTest {
    private volatile static int num = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while(num == 0){

            }
        }).start();

        Thread.sleep(1000);
        num = 1;
    }
}
