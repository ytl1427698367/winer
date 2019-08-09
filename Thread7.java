package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class MyThread111 implements Runnable { private int ticket = 1000 ; // 一共十张票
     @Override public void run() {
         for (int i = 0; i < 100; i++) {
         // 在同一时刻，只允许一个线程进入代码块处理
         synchronized(this) { // 表示为程序逻辑上//
             if (this.ticket > 0) { // 还有票
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {  //TODO Auto-generated catch block
                     e.printStackTrace();
                 }
                 // 模拟网络延迟
                 System.out.println(Thread.currentThread().getName() + this.ticket-- + " 张票");
             }
         }
         }
     }
}
             public class Thread7 {
    public static void main(String[] args) {
        MyThread111 mt = new MyThread111() ;
    Thread t1 = new Thread(mt,"黄牛A");
    Thread t2 = new Thread(mt,"黄牛B");
    Thread t3 = new Thread(mt,"黄牛C");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);
    t1.start(); t2.start();
    t3.start(); } }

