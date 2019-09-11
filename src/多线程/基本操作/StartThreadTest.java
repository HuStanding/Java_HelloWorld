package 多线程.基本操作;

/**
 * @author huzhu
 * @date 2019-05-01 16:14
 */
public class StartThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        StartThreadTest st = new StartThreadTest();
        st.start();
//        st.run();
        for(int i = 0;i < 10;i++){
            System.out.println("一边coding");
        }
    }
}
