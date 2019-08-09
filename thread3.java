package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class mythread3 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程"+Thread.currentThread().getName()+"  数字："+i);
        }
    }
}
public class thread3 {
    public static void main(String[] args){
        mythread3 mythread32=new mythread3();
        new Thread(mythread32).start();
        new Thread(mythread32).start();
        new Thread(mythread32).start();
    }
}
