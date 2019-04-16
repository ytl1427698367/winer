package ThreadPractise;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author：TaiLong
 * created:2019/4/9
 */
//等待队列是一个单向队列，而在之前说AQS时知道同步队列是一个双向队列。
//接下来我们还是通过Debug+Demo的形式来看看等待队列的结构

public class WaitQuality {
    public static void main(String[] args){
        Lock lock=new ReentrantLock( );
        Condition condition=lock.newCondition();
        for(int i=0;i<10;i++){
            Thread thread = new Thread(()->{
                lock.lock();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            });
            thread.start();
        }
    }
}
