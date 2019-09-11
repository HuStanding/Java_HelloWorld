package 多线程.线程同步;

import java.util.ArrayList;
import java.util.List;

/**
 * 添加Array
 *
 * @author huzhu
 * @date 2019-05-29 23:07
 */
public class SynBlockTest02 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                synchronized (list) {
                    for (int j = 0; j < 10; j++) {
                        list.add(Thread.currentThread().getName());
                    }
                }
            }).start();
        }
        Thread.sleep(100);
        System.out.println(list.size());
    }
}
