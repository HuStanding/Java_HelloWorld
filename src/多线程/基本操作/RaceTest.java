package 多线程.基本操作;

/**
 * 模拟龟兔赛跑
 * @author huzhu
 * @date 2019-05-02 11:10
 */
public class RaceTest implements Runnable{
    private static String winner;//胜利者

    @Override
    public void run() {
        for(int steps = 1;steps <= 100; steps++){
//            //模拟兔子休息
//            if(Thread.currentThread().getName().equals("rabbit") && steps % 10 == 0){
//                try{
//                    Thread.sleep(100);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
            System.out.println(Thread.currentThread().getName()+"-->" +steps);
            boolean flag = gameOver(steps);
            if(flag){
                break;
            }
        }
    }

    private boolean gameOver(int steps){
        if(winner != null){
            return true;
        }else{
            if(steps == 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is " + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RaceTest raceTest = new RaceTest();
        new Thread(raceTest,"tortoise").start();
        new Thread(raceTest,"rabbit").start();
    }
}
