package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class thread4 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<6;i++){
            Thread.yield();
            System.out.println("当前线程"+Thread.currentThread().getName()+" i+"+i);
        }
    }
}
public class thiread4 {
    public static void main(String[] args){
        thread4 nb=new thread4();
        new Thread(nb).start();
        new Thread(nb).start();
        new Thread(nb).start();
    }
}
