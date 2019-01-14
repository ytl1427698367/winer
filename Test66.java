package longjava;

/**
 * Author：TaiLong
 * created:2019/1/14
 */
class Outer{
    private  String name="凯皇";
    //定义内部类
    class inter{
        //定义内部方法
        public void infor(){

            System.out.println(name);//调用外部类属性
        }
        }
        //定义外部类方法
        public void out(){
        inter in=new inter();//内部类对象
        in.infor();
        }
}

public class Test66 {
    public static void main(String[] args) {
        Outer out=new Outer();
        out.out();
    }
}
