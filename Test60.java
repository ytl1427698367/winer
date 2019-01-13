package longjava;

/**
 * Author：TaiLong
 * created:2019/1/12
 */
public class Test60 {
    public static void main(String[] args)throws InterruptedException {
        Good goods=new Good();
        Thread producterThread=new Thread(new producter(goods),"生产者线程");

        Thread customerThread=new Thread (new consumer(goods),"消费者线程");
        producterThread.start();
        Thread.sleep(1000);
        customerThread.start();
    }
}
class Good{
    //商品名称
    private String goodName;
    //商品库存
    private int count;
    //生产方法
    public synchronized  void set(String goodName){
        this.count=count+1;
        this.goodName=goodName;
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Good{" + "goodName='" + goodName + '\'' + ", count=" + count + '}';
    }
    //消费方法
    public synchronized  void get(){
        this.count=this.count-1;
        System.out.println(toString());
        }
}
class producter implements Runnable{
    private Good goods;

    public producter(Good goods) {
        super();
        this.goods=goods;
        }
        @Override
    public void run() {
this.goods.set("oppleyige");
    }
}
//消费者类
class consumer implements Runnable{
    private Good goods;
    public consumer(Good goods) {
        super();
        this.goods=goods;
    }
    @Override
    public void run() {
this.goods.get();
    }
}

