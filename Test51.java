package longjava;

/**
 * Author：TaiLong
 * created:2018/12/30
 */
//
public class Test51 {
    public static void main (String[] args)throws InterruptedException{
MyThread myThread=new MyThread();
 Thread thread1 = new Thread(myThread,"子线程A");
        thread1.start();
        Thread.sleep(2000);
        myThread.getFlag(false);
        System.out.println("代码结束");
    }
}
class MyThread implements Runnable{
    private boolean flag=true;
    @Override
    public void run() {
        int i=1;
        while(flag){
            try {
                Thread.sleep(1000);
                System.out.println("第" + i + "次执行，线程名称为" + Thread.currentThread().getName());
                i++;
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
    public void getFlag(boolean flag){
        this.flag=flag;
    }
}
