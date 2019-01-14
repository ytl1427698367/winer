package longjava;

/**
 * Author：TaiLong
 * created:2019/1/14
 */
class Persons{
    //构造方法
    public Persons(){
        System.out.println("普通类构造方法");
    }
    {
        System.out.println("普通类的构造块");
    }
    static {
        System.out.println("普通类的静态块");
    }
}

public class Test65 {
    public Test65(){
        System.out.println("主类中的构造方法");
    }
    {
        System.out.println("主类中的构造块");
    }
    static{
        System.out.println("主类中的静态块");
    }
    public static void main(String[] args) {
        System.out.println("------------------------");
        new Persons();
        new Persons();
        new Test65();
        new Test65();

        System.out.println("-------------------------");
    }
}
