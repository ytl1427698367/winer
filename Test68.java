package longjava;

/**
 * Author：TaiLong
 * created:2019/1/15
 */
class Student{
    public void fun(){
        this.print();
    }
    private  void print(){
        System.out.println("只有父类可以访问此方法");
    }
}
class Body extends Student{
    public void print(){
        System.out.println("因为父类的权限是私有的，子类无法进行继承，虽然方法名相同，但是是子类定义的新方法");
    }
}
public class Test68 {
    public static void main(String[] args) {
        new Body().fun();
    }
}
