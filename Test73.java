/**
 * Author：TaiLong
 * created:2019/1/24
 */
abstract  class A{
    public A(){//4.调用父类构造
        this.print();//5调用覆写子类的方法
    }
    public abstract void print();
}
class B extends A{
    private int num=100;
    public B(int num){//2.调用子类实例化对象
        super();//3.隐含一行语句，实际上要调用父类构造方法
        this.num=num;
    }
    public void print(){//6.此时调用子类对象属性还没有初始化
        System.out.println(this.num);//7对应其默认的数据类型初值为0
    }
}
public class Test73 {
    public static void main(String[] args) {
        new B(30);//1实例化子类对象
    }
}
