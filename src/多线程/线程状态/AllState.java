package 多线程.线程状态;

/**
 * 线程状态
 * @author huzhu
 * @date 2019-05-26 16:38
 */
public class AllState {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for(int i = 0;i < 5;i++){
                try{
                    Thread.sleep(1000);
                    System.out.println("...");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        //观察状态
        Thread.State state = t.getState();
        System.out.println(state.toString());  //new

        t.start();
        state = t.getState();
        System.out.println(state.toString());//RUNNABLE

        while(state != Thread.State.TERMINATED){
            state = t.getState();
            System.out.println(state.toString());//
        }
    }
}
