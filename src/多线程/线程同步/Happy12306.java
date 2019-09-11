package 多线程.线程同步;

import Java基础.ParameterTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 快乐火车票同步问题
 *
 * @author huzhu
 * @date 2019-05-30 16:58
 */
public class Happy12306 {
    public static void main(String[] args) {
        Web12306 web12306 = new Web12306(4, "小胡子影院");
        new Passenger(web12306, "蚂蟥", 1).start();
        new Passenger(web12306, "马处", 2).start();
    }
}

//乘客
class Passenger extends Thread {
    int seats;

    public Passenger(Runnable target, String name, int seats) {
        super(target, name);
        this.seats = seats;
    }
}

//火车票网站
class Web12306 implements Runnable {
    int avaliable;//可用的位置
    String name;//名称

    public Web12306(int avaliable, String name) {
        this.avaliable = avaliable;
        this.name = name;
    }

    @Override
    public synchronized void run() {
        Passenger p = (Passenger) Thread.currentThread();
        boolean flag = bookTicket(p.seats);
        if (flag) {
            System.out.println("出票成功" + Thread.currentThread().getName() + "->位置为" + p.seats);
        } else {
            System.out.println("出票失败" + Thread.currentThread().getName() + "->位置不够");
        }
    }

    //购票
    boolean bookTicket(int seats) {
        System.out.println("可用位置为：" + avaliable);
        if (avaliable >= seats) {
            avaliable -= seats;
            return true;
        } else {
            return false;
        }
    }
}