package 多线程.高级主题;


/**
 * 不可重入锁：锁不可以延续使用
 *
 * @author huzhu
 * @date 2019-06-05 17:17
 */
public class LockTest02 {

    Lock lock = new Lock();

    public void a() throws InterruptedException {
        lock.lock();
        dosomething();
        lock.unlock();

    }

    public void dosomething() throws InterruptedException {
        lock.lock();;
        lock.unlock();
    }
    public static void main(String[] args) throws InterruptedException {
        LockTest02 lockTest02 = new LockTest02();
        lockTest02.a();
    }
}

//不可重入锁
class Lock{
    //是否被占用
    private boolean isLocked = false;
    //使用锁
    public synchronized void lock() throws InterruptedException {
        while(isLocked){
            wait();
        }
        isLocked = true;
    }

    //释放锁
    public synchronized void unlock() throws InterruptedException {
        isLocked = true;
        notify();
    }
}