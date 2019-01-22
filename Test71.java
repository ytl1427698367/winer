package longjava;

/**
 * Author：TaiLong
 * created:2019/1/20
 */
abstract class person12{
    private String name;
    public int age;
    public void setName(String name){

        this.name=name;
    }
    public String getName(){
        return this.name;
    }
   public abstract void print();

}
class Student23 extends person12{
    @Override
    public void print() {
        System.out.println("hello，凯皇");
    }
}
public class Test71 {
    public static void main(String[] args) {
        person12 person2 = new Student23();
        person2.print();
    }
}