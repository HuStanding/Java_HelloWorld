package 多线程.高级主题;

/**
 * DCL单例模式-懒汉式
 * @author huzhu
 * @date 2019-06-04 16:18
 */
public class DoubleCheckedLocking {
    //2、提供私有的静态属性
    private static volatile DoubleCheckedLocking instance;
    //1、构造器私有化
    private DoubleCheckedLocking(){

    }
    //3、提供公共的静态方法：获取属性
    public static DoubleCheckedLocking getInstance(){
        //再次检测
        if(instance != null){
            return instance;//避免不必要的不同，已经存在对象
        }
        synchronized (DoubleCheckedLocking.class){
            if(instance == null){
                instance = new DoubleCheckedLocking();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println(DoubleCheckedLocking.getInstance());
        });
        t.start();
        System.out.println(DoubleCheckedLocking.getInstance());
    }
}
