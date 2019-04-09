package ThreadPractise;

/**
 * Author：TaiLong
 * created:2019/4/5
 */
class MYthread extends Thread{
    private int ticket=10;
    public void run(){
        while(ticket>0){
            System.out.println("剩余票数等于"+this.ticket--);
        }
    }
}
public class Mythread2 {
    public static void main(String[] args) {
       MYthread mt=new MYthread();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
