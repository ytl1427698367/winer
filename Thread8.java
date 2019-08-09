package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/5
 */
class thread8 implements  Runnable {
    private int i = 200;

    @Override
    public void run() {
        for (int i = 200; i > 0; i--) {
            this.sale();
        }
    }

    public synchronized void sale() {
        if (i > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "还有" + this.i + "张票");


        }
    }
}
public class Thread8 {
    public static void main(String[] args){
        thread8 tr=new thread8();
        Thread t1=new Thread(tr,"黄牛1");
        Thread t2=new Thread(tr,"黄牛2");
        Thread t3=new Thread(tr,"黄牛3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
