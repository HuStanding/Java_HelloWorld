package 多线程.线程协作;

/**
 * 生产者消费者模型：管程法
 * @author huzhu
 * @date 2019-05-31 11:32
 */
public class CoTest01 {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();
    }
}

//生产者
class Productor extends Thread{
    SynContainer container;

    public Productor(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        //生产
        for(int i = 0;i < 100;i++){
            System.out.println("生产第"+i+"个馒头");
            container.push(new Steamedbun(i));
        }
    }
}

//消费者
class Consumer extends Thread{
    SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        //消费
        for(int i = 0;i < 100;i++){
            System.out.println("消费第"+container.pop().id+"个馒头");
        }
    }
}

//缓冲区
class SynContainer{
    Steamedbun[] buns = new Steamedbun[10];//存储容器
    int count = 0;

    //生产
    public synchronized void push(Steamedbun bun){
        //存在空间可以生产
        if(count == buns.length){
            try {
                this.wait();//线程阻塞，消费者通知生产解除
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buns[count] = bun;
        count++;
        //存在数据，可以消费
        this.notifyAll();
    }

    //获取
    public synchronized Steamedbun pop(){
        if(count == 0){
            try {
                this.wait();//线程阻塞，生产者通知消费
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Steamedbun bun = buns[count];
        this.notifyAll();//存在空间了，唤醒对方生产
        return bun;
    }
}

//馒头
class Steamedbun{
    int id;

    public Steamedbun(int id) {
        this.id = id;
    }
}

