package longjava;

/**
 * Author：TaiLong
 * created:2019/1/22
 */
//在抽象类中定义构造方法
abstract class Person1 {
    private String name;
    public int age;
    //构造方法
    public  Person1(){
        System.out.println("hello，凯皇");
        }
public String getName(){
        return this.name;
}
public void setName(String name){
        this.name=name;
}
abstract  public void print();
}
class Student2 extends Person1{
    public Student2(){
        System.out.println("hello，九月");
    }
    @Override
    public void print() {
    }
}
public class Test72 {
    public static void main(String[] args) {
        new Student2();
    }
}
