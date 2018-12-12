package lon.com;

/**
 * Author：TaiLong
 * created:2018/12/12
 */
//泛型方法与泛型类共存
class Myclass<T> {
    public void testMath(T t) {
        System.out.println(t);
    }

    public <T> T testMath1(T t) {
        return t;
    }
}

public class Test37 {
    public static void main(String[] args) {
        Myclass <String> myclass = new Myclass <>();
        myclass.testMath("是那种看了第一眼就想看第二眼的喜欢");
        Integer i = myclass.testMath1(100);
        System.out.println(i);
    }
}
/**上面代码中，MyClass <T> 是泛型类，testMethod1 是泛型类中的普通方法，而 testMethod2 是一个泛型方法。
        而泛型类中的类型参数与泛型方法中的类型参数是没有相应的联系的，泛型方法始终以自己定义的类型参数为准。
        泛型类的实际类型参数是 String，而传递给泛型方法的类型参数是 Integer，两者不相干*/