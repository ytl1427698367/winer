package lon.com;

/**
 * Author：TaiLong
 * created:2018/12/23
 */
public class Test46 {
    public static void main(String[] args) {
        //业务逻辑
        MyRunnable runnnable=new MyRunnable();
        //线程
        Thread thread=new Thread(runnnable,"thread1");
        thread.start();
        //在主线程中调用线程对象的join方法，会阻塞主线程
        //直到调用线程对象的run方法执行完毕，主线程才会继续执行
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程："+Thread.currentThread().getName());//main线程
    }
}
class MyRunnable implements Runnable{
private int tack=100;

    @Override
    public void run() {
        while(tack>=0){
            System.out.println(Thread.currentThread().getName()+"tick="+tack--);
        }
    }
}