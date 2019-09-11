package 多线程.线程状态;

import 面向对象2.MyInterfaceTest;

import static java.lang.Thread.*;

/**
 * 多线程的基本信息
 * @author huzhu
 * @date 2019-05-26 20:00
 */
public class InfoTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(currentThread().isAlive());

        //设置名称：真实+代理
        MyInfo info =  new MyInfo("战斗机");
        Thread t = new Thread(info);
        t.setName("公鸡");
        t.start();
        sleep(1000);
        System.out.println(t.isAlive());
    }
}


class MyInfo implements Runnable{
    private String name;
    @Override
    public void run() {
        System.out.println(currentThread().getName()+"-->"+name);
    }

    public MyInfo(String name) {
        this.name = name;
    }
}