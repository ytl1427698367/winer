package longjava;

/**
 * Author：TaiLong
 * created:2019/1/15
 */
//super 的基本使用
    class Parents{
        public void print(){
            System.out.println("父类构造方法");
        }
}
class Sun extends Parents{
        public void print(){
            super.print();//supr 调用父类构造方法
            System.out.println("子类覆写的方法");
        }

}
public class Test69 {
    public static void main(String[] args) {
        new Sun().print();
    }
}
