package com.SortColection;

/**
 * Author：TaiLong
 * created:2019/9/10
 */
//观察线程的休眠操作
    class Thread11 implements Runnable{
    @Override
    public void run() {
        for(int i=10;i!=0;i--){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
            System.out.println("当前线程"+Thread.currentThread().getName()+"i="+ i);
        }
    }
}
public class ThreadSleep {
        public static void main(String[] args){
            Thread11 thread1=new Thread11();
            new Thread(thread1,"sleepThread").start();
        }
}
