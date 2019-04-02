/**
 * Author：TaiLong
 * created:2019/4/2
 */
interface  Urgent<T>{
    public void raw(T t);
}
class b<T> implements Urgent<T>{
    public void raw(T t){
        System.out.println(t);

    }
}
public class Test93 {
    public static void main(String[] args){
        Urgent <String> i=new b();
        i.raw("hello java");
    }
}
