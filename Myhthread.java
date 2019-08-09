package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class MyThread extends Thread{
    private String title;
    public MyThread(String title){
        this.title=title;
    }

    @Override
    public void run() {
        System.out.println(this.title);
    }
}
public class Myhthread {
    public static  void main(String[] args){
        MyThread myThread1 = new MyThread("thread1") ;
        myThread1.start();
    }
}
