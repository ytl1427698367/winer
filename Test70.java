package longjava;

/**
 * Author：TaiLong
 * created:2019/1/15
 * 在Java中final被称为终结器。
 * 使用final修饰类、方法、属性
 * final成员变量必须在声明的时候初始化或者在构造器中初始化，否则就会报编译错误
 * 使用final定义的类不能有子类(String类便是使用final定义
 */
//final的基本使用方法

class Person3 {
    public void print() {
        System.out.println("1.我是爸爸！");
    }
}

class Student1 extends Person3 {
    public void print() {
        System.out.println("2.我是儿子！");
    }
    public void fun(){
        System.out.println("只有儿子有");
    }
}

public class Test70 {
    public static void main(String[] args) {
        Person3 per = new Student1(); //向上转型
        per.print();
        Student1 stu=(Student1)per;//向下转型
        stu.fun();
    }
}

