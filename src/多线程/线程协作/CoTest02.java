package 多线程.线程协作;

/**
 * 生产者消费者模型：信号灯法
 * 借助标志位
 * @author huzhu
 * @date 2019-05-31 11:32
 */
public class CoTest02 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}

//生产者
class Player extends Thread{
    TV tv;

    public Player(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for(int i = 0;i < 20;i++){
            if(i % 2 == 0){
                this.tv.play("奇葩说");
            }else{
                this.tv.play("太污了，喝瓶立白洗洗嘴");
            }
        }
    }
}
//消费者
class Watcher extends Thread{
    TV tv;

    public Watcher(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for(int i = 0;i < 20;i++){
            tv.watch();
        }
    }
}

//电视
class TV {
    String voice;
    //信号灯
    boolean flag = true;//T表示演员表演，观众等待，F表示演员等待，观众观看

    //表演
    public synchronized void play(String voice){
        //演员等待
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("表演了："+voice);
        this.voice = voice;
        //唤醒
        this.notifyAll();
        this.flag = !this.flag;
    }

    //观看
    public synchronized void watch(){
        //观众等待
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("听到了："+voice);
        //唤醒
        this.notifyAll();
        this.flag = !this.flag;
    }



}
