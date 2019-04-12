package ThreadPractise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：TaiLong
 * created:2019/4/7
 */
//观察join的方法
    class Long implements  Runnable{

    @Override
    public void run() {
        System.out.println("主线程睡眠前时间");
      try{
        ThreadJoin.prittime();

            Thread.sleep(2000);
          System.out.println(Thread.currentThread().getName());
          System.out.println("睡眠结束时间");
          ThreadJoin.prittime();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadJoin {
        public static void main(String[] args)throws InterruptedException{
Long longs=new Long();

Thread thread=new Thread(longs,"子线程A");
thread.start();
            System.out.println(Thread.currentThread().getName());
            thread.join();
            System.out.println("代码结束");
            }
            public static void prittime(){
            Date date=new Date();
                DateFormat format=  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time=format.format(date);
                System.out.println(time);
            }


}
