package ThreadPractise;

/**
 * Author：TaiLong
 * created:2019/4/5
 */
class MyThtead1 implements Runnable {//线程主体类
    private String title;
    public  MyThtead1(String title) {
        this.title = title;
    }
    public void run(){//所有线程从这里开始
            for(int i=0;i<10;i++){
                System.out.println(this.title +"i="+i);
            }

        }
    }
public class MyThread{
    public static void main(String[] args){
        MyThtead1 myThtead1=new MyThtead1("thread1");
        MyThtead1 myThtead2=new MyThtead1("thread2");
        MyThtead1 myThtead3=new MyThtead1("thread3");
new Thread(myThtead1).start();
new Thread(myThtead2).start();
new Thread(myThtead3).start();
    }
}
