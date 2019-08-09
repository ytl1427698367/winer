package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class Mythread2 implements Runnable {
    private int ticket=10;

    @Override
    public void run() {
        while(this.ticket>0){
            System.out.println("当前线程"+Thread.currentThread().getName()+"剩余票数"+this.ticket--);
        }
    }
}
public class Thread2 {
    public static void main(String[] args){
        Mythread2 mt = new Mythread2() ;
        new Thread(mt,"线程1").start();
        new Thread(mt).start();
    }
}
