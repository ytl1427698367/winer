package ThreadPractise;

/**
 * Author：TaiLong
 * created:2019/4/7
 */
class diandian implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            Thread.yield();
            System.out.println("当前线程"+Thread.currentThread().getName()+"i="+i);
        }

    }
}
public class ThreadSleep  {
    public static void main(String[] args){
        diandian diandianv=new diandian();
        new Thread(diandianv,"tailong").start();
        new Thread(diandianv,"nana").start();
        new Thread(diandianv,"happy").start();
        new Thread(diandianv,"beautiful").start();

    }
}
