package 多线程.高级主题;

import java.util.*;

/**
 * 定时调度：Timer
 * @author huzhu
 * @date 2019-06-02 11:08
 */
public class TimerTest01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
//        timer.schedule(new MyTask(),1000);
//        timer.schedule(new MyTask(),1000,200);
        System.out.println(new Date(System.currentTimeMillis()+1000*60));
        timer.schedule(new MyTask(),new Date().getTime(),200);//每隔0.2秒，该事件之后开始执行

    }
}

class MyTask extends TimerTask{
    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            System.out.println("HelloWorld!");
        }
        System.out.println("---end---");

    }
}
