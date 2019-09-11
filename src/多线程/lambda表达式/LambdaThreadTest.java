package 多线程.lambda表达式;

/**
 * lambda表达式简化线程
 * @author huzhu
 * @date 2019-05-02 14:20
 */
public class LambdaThreadTest {
    //静态内部类
    static class Test implements Runnable {
        @Override
        public void run() {
            for(int i = 0;i < 10;i++){
                System.out.println("一边听歌");
            }
        }
    }
    public static void main(String[] args) {
        //局部内部类
        class Test2 implements Runnable {
            @Override
            public void run() {
                for(int i = 0;i < 10;i++){
                    System.out.println("一边coding");
                }
            }
        }

//        new Thread(new Test()).start();
//        new Thread(new Test2()).start();

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 10;i++){
                    System.out.println("一边coding");
                }
            }
        }).start();

        //lambda简化
        new Thread(()->{
            for(int i = 0;i < 10;i++){
                System.out.println("一边听歌");
            }
        }).start();
    }

}
