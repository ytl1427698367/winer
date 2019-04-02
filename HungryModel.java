/**
 * Author：TaiLong
 * created:2019/4/2
 */

/**
 * 饿汉式单例模式
 */
class Singleton{
    private final static Singleton instancc=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstancc(){
        return instancc;
    }
    public void print(){
        System.out.println("Hello world");
    }
}
public class HungryModel {
    public static void main(String[] args) {
        Singleton singleton = null;//声明对象
        singleton = Singleton.getInstancc();
        singleton.print();
    }
}