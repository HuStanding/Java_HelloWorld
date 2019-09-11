package 多线程.基本操作;

import java.util.concurrent.*;

/**
 * 模拟龟兔赛跑-callbale
 * @author huzhu
 * @date 2019-05-02 11:10
 */
public class CallableRaceTest implements Callable<Integer> {
    private static String winner;//胜利者

    @Override
    public Integer call() throws Exception{
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
                return steps;
            }
        }
        return null;
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

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableRaceTest raceTest = new CallableRaceTest();
        //执行服务
        ExecutorService ser = Executors.newFixedThreadPool(2);
        //提交执行
        Future<Integer> result1 = ser.submit(raceTest);
        Future<Integer> result2 = ser.submit(raceTest);
        //获取结果
        Integer r1 = result1.get();
        Integer r2 = result2.get();
        System.out.println(r1 + "-->" + r2);
        //关闭服务
        ser.shutdown();
    }
}
