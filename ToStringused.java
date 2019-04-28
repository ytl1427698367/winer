package JavaIo;

/**
 * Author：TaiLong
 * created:2019/4/23
 */
class Person12{
    private int age;
    private String name;
    public Person12(int age,String name){
        this.name=name;
        this.age=age;
    }

public String toString(){
        return "姓名"+this.name+"年龄"+this.age;
    }
}
public class ToStringused {
    public static void main(String[] args){
fun(new Person12(21,"王小娜"));
//fun("王小娜，喜欢你");
    }
    public static void fun(Object obj){
        System.out.println(obj.toString());//默认的输出对象就是ToString方法
    }
}
