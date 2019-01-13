package longjava;

/**
 * Author：TaiLong
 * created:2019/1/13
 */
public class Test62 {
    public static void main(String [] args){
        Person0 person=new Person0("张三",25);
        System.out.println(person.print());
        System.out.println(person.name);
        System.out.println(person.age);
    }

}
class Person0{
    public String name;
    public int age;

    public  Person0(String name,int age){
        this.name=name;
        this.age=age;
        }
        public String print(){
        return "姓名"+this.name+"    "+"年龄"+this.age;
        }
}
