package 多线程.基本操作;

/**
 * @author huzhu
 * @date 2019-05-02 10:59
 */
public class StartRunTest implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
//        //创建实现类对象
//        StartRunTest sr = new StartRunTest();
//        //创建代理类对象
//        Thread t = new Thread(sr);
//        //启动
//        t.start();


        new Thread(new StartRunTest()).start();
        for(int i = 0;i < 10;i++){
            System.out.println("一边coding");
        }
    }
}
