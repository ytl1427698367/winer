/**
 * Author：TaiLong
 * created:2019/3/28
 */
abstract  class person{
   public abstract void es();
}
class Student extends person{
    public void es(){
        System.out.println("我是子类");
    }

        }
public class Test90 {
    public static void main(String[] args) {
        person pr = new Student();
        pr.es();
    }
}
