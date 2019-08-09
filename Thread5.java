package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class threa5 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("当前线程"+Thread.currentThread().getName()+" i="+i);
        }
    }
}
public class Thread5 {
    public static void main(String[] args){
        threa5 threa51=new threa5();
        Thread thread1=new Thread(threa51,"线程1");
        Thread thread2=new Thread(threa51,"线程2");
        Thread thread3=new Thread(threa51,"线程3");
        //设置线程的优先级
//        thread1.setPriority(Thread.MAX_PRIORITY);
//        thread2.setPriority(Thread.NORM_PRIORITY);
//        thread3.setPriority(Thread.MIN_PRIORITY);
//        thread1.start();
//        thread2.start();
//        thread3.start();
        System.out.println(Thread.currentThread().getPriority());
        //主方法只是中等优先级

    }
}
