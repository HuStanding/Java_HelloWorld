package 多线程.线程状态;

/**
 * 守护线程
 * @author huzhu
 * @date 2019-05-26 17:08
 */
public class DaemonTest {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();
        Thread t = new Thread(god);
        t.setDaemon(true);//守护线程
        t.start();
        new Thread(you).start();
    }
}


class You extends Thread{
    @Override
    public void run() {
        for(int i = 1;i <= 10;i++){
            System.out.println("happy life ...");
        }
        System.out.println("oooooo...");
    }
}

class God extends Thread{
    @Override
    public void run() {
        for(int i = 1;i <= 365 * 10e6;i++){
            System.out.println("bless you...");
        }
        System.out.println("oooooo...");
    }
}