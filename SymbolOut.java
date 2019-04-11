package ThreadPractise;

/**
 * Author：TaiLong
 * created:2019/4/7
 */
class Mythread3 implements Runnable {
    boolean flag = true;

    @Override
    public void run() {
        int i = 1;
        while (flag) {
            try {
                Thread.sleep(500);
                System.out.println("第" + i + "次执行,线程名称为" + Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void setFlag(boolean a){
        this.flag=a;
    }
}

public class SymbolOut {
    public static void main(String[] args) throws InterruptedException {
        Mythread3 mythread3=new Mythread3();
        Thread thread=new Thread(mythread3,"主线程A");
        thread.start();
        Thread.sleep(3000) ;
            mythread3.setFlag(false);
        System.out.println("代码结束");
    }
}
