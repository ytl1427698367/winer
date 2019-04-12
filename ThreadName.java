package ThreadPractise;

/**
 * Author：TaiLong
 * created:2019/4/7
 */
//观察线程的命名取得
    class print2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("当前线程"+Thread.currentThread().getName()+"i="+i);
        }
    }
}
public class ThreadName {
        public static void main(String[] args){
            print2 print2=new print2();
            new Thread(print2).start();
            new Thread(print2,"lalala").start();
        }
}
