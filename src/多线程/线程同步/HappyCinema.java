package 多线程.线程同步;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;

/**
 * 影院购票-同步
 * @author huzhu
 * @date 2019-05-30 15:33
 */
public class HappyCinema {
    public static void main(String[] args) {
        List<Integer> avaliable = new ArrayList<>();
        avaliable.add(1);
        avaliable.add(2);
        avaliable.add(3);
        avaliable.add(4);
        avaliable.add(5);
        avaliable.add(6);
        avaliable.add(7);
        List<Integer> seats1 = new ArrayList<>();
        seats1.add(1);
        seats1.add(2);
        List<Integer> seats2 = new ArrayList<>();
        seats2.add(1);
        seats2.add(5);
        seats2.add(6);

        HiCinema cinema = new HiCinema(avaliable,"小胡子影院");
        new Thread(new HappyCustomer(cinema,seats1),"蚂蟥").start();
        new Thread(new HappyCustomer(cinema,seats2),"马处").start();
    }
}

//顾客
class HappyCustomer implements Runnable{
    HiCinema cinema;
    List<Integer> seats;

    public HappyCustomer(HiCinema cinema,List<Integer> seats){
        this.cinema = cinema;
        this.seats = seats;
    }

    @Override
    public void run() {
        synchronized (cinema){
            boolean flag = cinema.bookTicket(seats);
            if(flag){
                System.out.println("出票成功"+Thread.currentThread().getName()+"->位置为"+seats);
            }else{
                System.out.println("出票失败"+Thread.currentThread().getName()+"->位置不够");
            }
        }

    }
}

//影院
class HiCinema{
    List<Integer> avaliable;//可用的位置
    String name;//名称

    public HiCinema(List<Integer> avaliable, String name) {
        this.avaliable = avaliable;
        this.name = name;
    }

    //购票
    boolean bookTicket(List<Integer> seats){
        System.out.println("可用位置为："+ avaliable);
        List<Integer> copy = new ArrayList<>();
        copy.addAll(avaliable);

        //相减
        copy.removeAll(seats);
        //判断大小
        if(avaliable.size() - copy.size() != seats.size()){
            return false;
        }else{
            //成功
            avaliable = copy;
            return true;
        }
    }
}
