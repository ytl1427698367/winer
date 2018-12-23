package lon.com;

import java.util.SortedMap;

/**
 * Author：TaiLong
 * created:2018/12/23
 */
//线程的让步yield（）方法
public class Test45 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for(int i=0;i<=3;i++){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+"I="+i);
            }
        };
        new Thread(runnable,"Thread1").start();
        new Thread(runnable,"Thread2").start();

    }
}
