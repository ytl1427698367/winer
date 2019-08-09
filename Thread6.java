package com.ming;

/**
 * Author：TaiLong
 * created:2019/8/1
 */
class thread6 implements Runnable {
    private  int tick=10;
    @Override
    public void run() {
while(this.tick>0){//有票
    try{
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName()+",还有" +this.tick -- +" 张票");
}
    }
}
public class Thread6 {
    public static void main(String[] args){
        thread6 thread61=new thread6();
       new Thread(thread61,"黄牛1");
        new Thread(thread61,"黄牛2");
        new Thread(thread61,"黄牛3");



    }
}

