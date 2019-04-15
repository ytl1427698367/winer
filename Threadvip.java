package ThreadPractise;

/**
 * Author：TaiLong
 * created:2019/4/7
 */
//线程的优先级设置
    class Mythread4 implements Runnable{
       private int ticket=60;
        public void run() {
            while (ticket > 0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"现在还剩余"+this.ticket--+"张票");

                if(ticket==0){
                    System.out.println("不好意思，票卖光了，下次长点脑子，买早点");
                }
            }
        }
}
public class Threadvip {
        public static void main(String[] args){
            Mythread4 mYthread4=new Mythread4();
            new Thread(mYthread4,"线程1").start();
            new Thread(mYthread4,"线程2").start();
            new Thread(mYthread4,"线程3").start();
            new Thread(mYthread4,"线程4").start();


        }
}
