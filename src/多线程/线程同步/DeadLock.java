package 多线程.线程同步;

/**
 * 死锁：过多的同步造成相互不释放资源
 * 避免死锁：不要在同一段代码中同时持有多个对象的锁
 *
 * @author huzhu
 * @date 2019-05-30 21:23
 */
public class DeadLock {
    public static void main(String[] args) {
        Markup g1 = new Markup(0, "张柏芝");
        Markup g2 = new Markup(1, "王菲");
        g1.start();
        g2.start();
    }
}

//口红
class LipStick {

}

//镜子
class Mirror {

}

//化妆
class Markup extends Thread {
    static LipStick lipStick = new LipStick();
    static Mirror mirror = new Mirror();
    int choice; //选择
    String name;  //姓名

    public Markup(int choice, String name) {
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        markup();
    }

    //相互持有对方的锁
    private void markup() {
        if (choice == 0) {
            synchronized (lipStick) {//获得口红的锁
                System.out.println(this.name + "涂口红");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*synchronized (mirror) {//获得镜子的锁
                    System.out.println(this.name + "照镜子");
                }*/
            }
            synchronized (mirror) {//获得镜子的锁
                System.out.println(this.name + "照镜子");
            }
        } else {
            synchronized (mirror) {//获得镜子的锁
                System.out.println(this.name + "照镜子");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*synchronized (lipStick) {//获得镜子的锁
                    System.out.println(this.name + "涂口红");
                }*/
            }
            synchronized (lipStick) {//获得镜子的锁
                System.out.println(this.name + "涂口红");
            }
        }
    }
}