package 多线程.线程状态;

/**
 * @author huzhu
 * @date 2019-05-26 15:22
 */
public class TerminateThread implements Runnable {
    private boolean flag = true;
    private String name;

    public TerminateThread(String name){
        this.name =name;
    }

    @Override
    public void run() {
        int i = 0;
        while(flag){
            System.out.println(name + "-->" + i++);
        }
    }

    /**
     * 对外提供方法改变标志
     * @author huzhu
     * @date 2019-05-26 15:32
     * @params []
     * @return void
    */
    public void terminate(){
        this.flag = false;
    }

    public static void main(String[] args) {
        TerminateThread tt = new TerminateThread("C罗");
        new Thread(tt).start();

        for(int i = 0;i < 99;i++){
            if(i == 88){
                tt.terminate();//线程终止
                System.out.println("线程终止");
            }
            System.out.println("main-->"+i);
        }
    }
}
